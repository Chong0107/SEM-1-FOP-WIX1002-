package com.company;


public class matrix {
    public static void main(String[] args) {
        int k=0;
        int[][] value = new int[4][5];
        for(int i=0;i<4;i++){      //4=row
            for(int j=0;j<5;j++){  //5=column
                value[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++) {
                System.out.print(value[i][j]+" ");
            }
            System.out.println();
        }
    }
}
