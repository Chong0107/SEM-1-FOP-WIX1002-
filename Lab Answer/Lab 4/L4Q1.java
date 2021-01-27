package com.company;

import java.util.Scanner;

public class L4Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,i;
        System.out.print("Enter an Integer: ");
        num = sc.nextInt();
        System.out.print("Total factors are: ");
        for(i=1;i<=num;i++){
            if(num % i == 0){
                /*if(num / i != 1) {
                    System.out.print(i + ", ");
                }
                else if(num / i == 1) {
                    System.out.print(i);
                }*/
                System.out.print((i == num) ? i : i + ", ");
                // variable = (condition) ? [true] : [false] ;
            }
        }
    }
}
