package com.company;

import java.util.Scanner;

public class L5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = sc.nextInt();
        int [][] pascal = new int[n][n];
        for(int i=0;i< pascal.length;i++){
            for(int j=0;j< pascal.length;j++){
                if(j>i)
                    pascal[i][j]=0;
                else if(j==0 || j==i)
                    pascal[i][j]=1;
                else
                    pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
                System.out.print(pascal[i][j]+" ");
            }
            System.out.println();
        }
    }
}
