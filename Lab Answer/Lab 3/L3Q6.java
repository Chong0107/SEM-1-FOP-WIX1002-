package com.company;

import java.util.Scanner;

public class L3Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables
        int radius,x,y;
        //input radius, x and y
        System.out.print("Enter the radius of circle : ");
        radius = sc.nextInt();
        System.out.println("Enter coordinate (x,y) : ");
        System.out.print("x : ");
        x = sc.nextInt();
        System.out.print("y : ");
        y = sc.nextInt();
        //calculation for hypotenuse
        double distance = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.print("Distance: ");
        System.out.printf("%.2f",distance);
        System.out.print("m");
        System.out.println(" ");
        //Output for result
        if(distance > radius)
            System.out.println("The point of ("+x+","+y+")"+" is outside the circle centered at (0,0).");
        else
            System.out.println("The point of ("+x+","+y+")"+" is inside the circle centered at (0,0).");
    }
}
