/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;
public class L2Q3 {
    public static void main(String[] args) {
        Random sc = new Random();
        double num1,num2,num3,sum,avg;
        final int max=50,min=10;
        num1 = sc.nextInt(max-min+1)+min;
        num2 = sc.nextInt(max-min+1)+min;
        num3 = sc.nextInt(max-min+1)+min;

        sum = num1 + num2 + num3;
        avg = sum / 3;

        System.out.println("First random number = "+num1);
        System.out.println("Second random number = "+num2);
        System.out.println("Third random number = "+num3);
        System.out.println("Sum of 3 random number= "+sum);
        System.out.print("Average of 3 random number = ");
        System.out.printf("%.2f",avg);
        System.out.println("");
    }
    
}
