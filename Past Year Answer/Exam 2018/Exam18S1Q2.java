package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exam18S1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int[][]matrixA = generateMatrix(n);
        int[][]matrixB = generateMatrix(n);
        System.out.println("Matrix A: ");
        displayMatrix(matrixA);
        System.out.println("Matrix B: ");
        displayMatrix(matrixB);
        int[][] sum = addMatrix(matrixA,matrixB);
        System.out.println("Matrix A + B");
        displayMatrix(sum);
        int[][] multiply = multiplyMatrix(matrixA,matrixB);
        System.out.println("Matrix A X B");
        displayMatrix(multiply);
    }
    public static int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        Random r = new Random();
        for(int row=0;row<n;row++){
            for (int column=0;column<n;column++){
                matrix[row][column] = r.nextInt(10);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][] matrix){
        for(int row=0;row< matrix.length;row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println(" ");
        }
    }
    public static int[][] addMatrix(int[][] matrix1,int[][] matrix2){
        int[][] addition = new int[matrix1.length][matrix2.length];
        for(int row=0;row< matrix1.length;row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                addition[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return addition;
    }
    public static int[][] multiplyMatrix(int[][]matrix1, int[][]matrix2){
        int[][] multiply = new int[matrix1.length][matrix2.length];
        for(int row=0;row< matrix1.length;row++) {
            for (int column = 0; column < matrix2[row].length; column++) {
                multiply[row][column] = crossMultiply(matrix1,matrix2,row,column);
            }
        }
        return multiply;
    }
    public static int crossMultiply(int[][] matrix1,int[][] matrix2,int row,int column){
        int tempSum = 0;
        for (int i = 0; i<matrix1.length; i++) {
            tempSum += matrix1[row][i] * matrix2[i][column];
        }
        return tempSum;
    }
}
