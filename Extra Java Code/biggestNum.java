package com.company;

import java.util.Scanner;
public class biggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Enter three numbers: ");
        System.out.print("1st number :");
        num1 = sc.nextInt();
        System.out.print("2nd number :");
        num2 = sc.nextInt();
        System.out.print("3rd number :");
        num3 = sc.nextInt();

        if(num1>num2 && num1>num3)
            System.out.println("The 1st number is the biggest.");
        else if(num2>num1 && num2>num3)
            System.out.println("The 2nd number is the biggest.");
        else
            System.out.println("The 3rd number is the biggest.");
    }
}
