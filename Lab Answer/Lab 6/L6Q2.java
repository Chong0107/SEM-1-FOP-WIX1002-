package com.company;

import java.util.Scanner;
import static java.lang.System.*;

public class L6Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Enter n: ");
        int n = sc.nextInt();
        out.print("Enter character: ");
        char c = sc.next().charAt(0);
        out.println();
        multiPrint(n,c);
        out.println();
        out.println("Triangle: ");
        displayTriangle(n,c);
        out.println();
        out.println("Diamond: ");
        displayDiamond(n,c);
    }
    public static void multiPrint(int n,char c){
        for (int i=1;i<=n;i++){
            out.print(c+" ");
        }
        out.println();
    }
    public static void displayTriangle(int n,char c){
        for(int i=1;i<=n;i++){      // loop to iterate for the given number of rows
            for(int j=n;j>=i;j--){  // loop to print the number of spaces before the c
                out.print(" ");
            }
            for (int j=1;j<=i;j++){ // loop to print the number of c in each row
                out.print(c+" ");
            }
            out.println();
        }
    }
    public static void displayDiamond(int n,char c){
        for(int i=1;i<=n;i++){ // run loop (parent loop) till number of rows
            for(int j=n;j>i;j--){ // loop for initially space before c printing
                out.print(" ");
            }
            for (int j=0;j<i;j++){ // Print i+1 "c"
                out.print(c+" ");
            }
            out.println();
        }
        for(int i=1;i<=n-1;i++){ // run loop (parent loop) till number of rows
            for(int j=1;j<=i;j++){ // loop for initially space before c printing
                out.print(" ");
            }
            for (int j=n;j>i;j--){ // Print i "c"
                out.print(c+" ");
            }
            out.println();
        }
    }
}
