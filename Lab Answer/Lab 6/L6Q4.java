package com.company;

import static java.lang.System.*;

public class L6Q4 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(in);
        int a,b;
        out.print("Enter first number: ");
        a = sc.nextInt();
        out.print("Enter second number: ");
        b = sc.nextInt();
        out.print("GCD of ("+a+", "+b+")"+": ");
        getGCD(a,b);*/
        out.print("GCD of (24,8): ");
        out.print(getGCD(24,8)+" ");
        out.print(GCD(24,8));
        out.print("\nGCD of (200,625): ");
        out.print(getGCD(200,625)+" ");
        out.print(GCD(200,625));

    }
    /*public static void getGCD(int a, int b){
        while(a != b){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        out.print(b);
    }*/
    public static int getGCD(int a, int b){
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        a = big;
        b = small;
        int remainder;
        do{
            remainder = a%b;
            a = b;
            b = remainder;
        } while(remainder != 0);
        return a;
    }
    public static int GCD(int x,int y){
        for(int i=Math.min(x,y);i>0;i--){
            if(x % i == 0 && y % i == 0)
                return i;
        }
        return 1;
    }
}
