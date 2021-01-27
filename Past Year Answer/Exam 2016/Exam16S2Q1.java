package com.company;

import java.util.Scanner;

public class Exam16S2Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pound,kg;
        System.out.print("Enter a number in pounds: ");
        pound = sc.nextDouble();
        kg = pound * 0.454;
        System.out.print(pound+" pounds is ");
        System.out.printf("%.3f",kg);
        System.out.print(" kilograms.");
    }
}
