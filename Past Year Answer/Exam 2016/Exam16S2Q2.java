package com.company;

import java.util.Scanner;

public class Exam16S2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0;
        System.out.print("Enter a number between 0 and 1000: ");
        num = sc.nextInt();
        /*
        String number = Integer.toString(num);
        int sum = 0;
        for(int i=0;i<number.length();i++){
            sum += number.charAt(i)-'0';
        }
        System.out.println("The sum of the digit is "+sum);
        */

        while(num>0){
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        System.out.println("The sum of digit is "+sum);
    }
}
