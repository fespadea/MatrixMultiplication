package com.company;

/**
 * Created by fs279 on 12/21/16.
 */
public class MatrixMult {
    public static int [][] mult(int a[][], int b[][]){
        int ans [] [] = new int[a.length][b[0].length];
        int check = 0;
        for(int i []: a){
            if(i.length == b.length){
                check++;
            }
        }
        if(check == a.length){
            for(int x = 0; x < a.length; x++){
                for(int z = 0; z < b[0].length; z++) {
                    int sum = 0;
                    for (int y = 0; y < a[0].length; y++) {
                        sum += a[x][y] * b[y][z];
                    }
                    ans [x][z] = sum;
                }
            }
            return ans;
        }
        return null;
    }
}
