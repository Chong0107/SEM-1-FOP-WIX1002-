package com.company;


public class L5Q4 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 7}, {3, 6, 9}, {5, 3, 8}};
        System.out.println("3 by 3 Matrix ");
        for (int i = 0; i < matrix.length; i++) { // row
            for (int j = 0; j < matrix[i].length; j++) {  // column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("After rotates 90 degree clockwise ");
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length - i - 1; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
