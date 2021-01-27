/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
public class carloan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double P,D,R,M;
        int Y;
        System.out.print("Enter the price of the car : ");
        P = sc.nextDouble();
        System.out.print("Enter the down payment : ");
        D = sc.nextDouble();
        System.out.print("Enter the interest rate (%) : ");
        R = sc.nextDouble();
        System.out.print("Enter the loan duration (year) : ");
        Y = sc.nextInt();

        M = (P + D) * (1 + R*Y/100) / (Y *12);

        System.out.print("The monthly payment of car loan is RM");
        System.out.printf("%.2f",M);
        System.out.print(" .");
    }
 
}
