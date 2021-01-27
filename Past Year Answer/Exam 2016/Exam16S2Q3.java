package com.company;

import java.util.Scanner;

public class Exam16S2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();
        for(int row=0;row<num;row++){
            for(int column=0;column<num*2-1;column++){
                if(column >= (num-1-row) && column <= (num -1+row)){
                    if(column <= num -1)
                        System.out.print(num - column);
                    else
                        System.out.print(column - num + 2);
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
