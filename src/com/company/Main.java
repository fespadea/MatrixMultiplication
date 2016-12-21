package com.company;

public class Main {

    public static void main(String[] args) {
        int [] [] a = {{1, 2, -2, 0}, {-3, 4 ,7, 2}, {6, 0, 3, 1}};
        int [] [] b = {{-1, 3}, {0, 9}, {1, -11}, {4, -5}};
        int [] [] c = MatrixMult.mult(a, b);
        if(c == null){
            System.out.print("nope");
        }
        else {
            for (int i[] : c) {
                for (int j = 0; j < i.length; j++) {
                    System.out.print(i[j] + "\t");
                }
                System.out.println("\n");
            }
        }
    }
}
