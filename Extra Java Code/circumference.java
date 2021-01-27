package com.company;

import java.util.Scanner;

public class circumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double diameter,circumference,Pi,radius;
        System.out.print("Enter diameter : ");
        diameter = sc.nextDouble();
        radius = diameter / 2;
        Pi = Math.PI;
        circumference = 2 * Pi * radius;
        System.out.print("The circumference of the circle is : ");
        System.out.printf("%.3f\n",circumference);
    }
}
