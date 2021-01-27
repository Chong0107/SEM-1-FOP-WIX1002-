package com.company;

import java.util.Scanner;

public class energy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double Q,M,temp1,temp2,final_temp,initial_temp,weight;
        System.out.print("Enter the amount of water in gram : ");
        weight = sc.nextDouble();
        M = weight / 1000;
        System.out.print("Enter the initial temperature in Fahrenheit : ");
        temp1 = sc.nextDouble();
        System.out.print("Enter the final temperature in Fahrenheit : ");
        temp2 = sc.nextDouble();
        initial_temp = (temp1 - 32 ) * (0.5555555556);
        final_temp = (temp2 - 32) * (0.5555555556);
        Q = M * (final_temp - initial_temp) * 4184;
        System.out.println("The energy needed is "+Q+".");
    }
}
