package com.company;

import java.util.Scanner;

public class L4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        int sum=0;
        int hold=0;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        for(i=1;i<=n;i++){
            /*for(j=1;j<=i;j++){
                sum+=j;
            }*/
            hold+=i;
            sum+=hold;
            System.out.print(hold+"+");
        }
        System.out.println("\nThe sum of the series is "+sum);
    }
}
