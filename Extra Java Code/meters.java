package com.company;

import java.util.Scanner;

public class meters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inch,meter;
        System.out.print("Enter value if inch: ");
        inch = sc.nextDouble();
        meter = inch * (2.54/100);
        System.out.print( inch + " inches = ");
        System.out.printf("%.2f\t",meter);
        System.out.print("meters");
    }
}
