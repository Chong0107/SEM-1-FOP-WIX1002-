
package samplequestion;

import java.util.Random;
import java.util.Scanner;

public class Exam18S1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int [][] matrix1 = getMatrix(n);
        int [][] matrix2 = getMatrix(n);
        System.out.println("Matrix A");
        displayMatrix(matrix1);
        System.out.println("Matrix B");
        displayMatrix(matrix2);
        System.out.println("Matrix A + B");
        int[][] addition = addMatrix(matrix1,matrix2);
        displayMatrix(addition);
        System.out.println("Matrix A X B");
        int[][]multiplication = multiplyMatrix(matrix1,matrix2);
        displayMatrix(multiplication);
    }
    public static int[][] getMatrix(int n){
        int[][]matrix = new int[n][n];
        Random r = new Random();
        for(int row=0;row<n;row++){
            for(int column=0;column<n;column++){
                matrix[row][column] = r.nextInt(10);
            }
        }
        return matrix;
    }
    public static void displayMatrix(int[][]matrix){
        for(int row=0;row<matrix.length;row++){
            for(int column=0;column<matrix[row].length;column++){
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println("");
        }
    }
    public static int[][] addMatrix(int[][]matrixA,int[][]matrixB){
        int[][] addition = new int[matrixA.length][matrixB.length];
        for(int row=0;row<matrixA.length;row++){
            for(int column=0;column<matrixA[row].length;column++){
                addition[row][column] = matrixA[row][column] + matrixB[row][column];
            }
        }
        return addition;
    }
    public static int[][] multiplyMatrix(int[][]matrixA,int[][]matrixB){
        int[][] multiplication = new int[matrixA.length][matrixB.length];
        for(int row=0;row<matrixA.length;row++){
            for(int column=0;column<matrixA[row].length;column++){
                multiplication[row][column] = crossMultiply(matrixA,matrixB,row,column);
            }
        }
        return multiplication;
    }
    public static int crossMultiply(int[][]matrixA,int[][]matrixB,int row,int column){
        int tempSum = 0;
        for(int i=0;i<matrixA.length;i++){
            tempSum += matrixA[row][i]* matrixB[i][column];
        }
        return tempSum;
    }
}
