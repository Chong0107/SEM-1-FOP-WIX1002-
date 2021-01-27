package com.company;

import java.util.Scanner;

public class Exam16S2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n for a regular polygon, n: ");
        int num = sc.nextInt();
        System.out.print("Enter the length of a particular side of the regular polygon (in meter), s: ");
        double length = sc.nextDouble();
        System.out.printf("The area is %.2f squared meters.",area(num,length));
        System.out.println();
    }
    public static double area(int n,double s){
        return(n * Math.pow(s,2))/(4 * Math.tan(Math.toRadians(180/n)));
    }
}
