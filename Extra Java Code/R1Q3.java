package com.company;

import java.util.Scanner;

public class R1Q3 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter deposit amount (RM): ");
         double n = sc.nextDouble();
         System.out.print("Enter number of month: ");
         int m = sc.nextInt();
         System.out.print("Enter annual interest rate (%): ");
         double i = sc.nextDouble();
         System.out.println(" ");
         System.out.printf("%-10s%-15s%-15s%-20s\n","Month", "Principal (P)",
                           "Interest (r)",  "Interest r/1200*p");
         double total=0;
         for(int j=1;j<=12;j++,i+=0.12){
            double interest = (i/1200)*n;
            total += interest;
            System.out.printf("%-10d%-15.2f%-15.2f%-20.2f\n", j, n, i, interest);
            n += interest;
         }
         System.out.println(" ");
         System.out.printf("Total Interest: RM%.2f\n",total);
    }
}
