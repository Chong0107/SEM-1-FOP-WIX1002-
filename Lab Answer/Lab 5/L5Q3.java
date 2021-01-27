package com.company;

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter number(s) of employee: ");
        int n = sc.nextInt();
        int [] hour = new int[7];
        //int sum2 = 0;
        System.out.print("*************************************");
        System.out.println("\nWork hours of employees in seven day: ");
        for(int i=1; i<=n; i++){
            int sum = 0;
            System.out.println("Employee "+i+": ");
            System.out.println("S M T W Th F Sn");
            for(int j=0; j< hour.length; j++){
                hour[j] = r.nextInt(8)+1;
                System.out.print(hour[j]+" ");
                sum+=hour[j];
                //sum2 += hour[j];
            }
            System.out.print("\n");
            System.out.print("The total hours of employee "+i+": "+sum+" hours");
            System.out.print("\n");
        }
        //System.out.println("Total of hours for those employee(s): "+sum2);
        System.out.println("*************************************");
    }
}
