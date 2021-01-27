package com.company;
import java.util.Scanner;
public class Fahrenheit {
    public static void main(String []args){
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
