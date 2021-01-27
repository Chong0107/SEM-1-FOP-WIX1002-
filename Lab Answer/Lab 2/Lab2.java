/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celsius,Fahrenheit;
        System.out.print("Enter the temperature in degree of Fahrenheit : ");
        Fahrenheit = sc.nextDouble();
        celsius = (Fahrenheit - 32) / 1.8;
        System.out.print("The temperature in degree of Celsius is ");
        System.out.printf("%.2f",celsius);
        System.out.print(" .");
    }
    
}
