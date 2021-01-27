package com.company;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f,x,y;
        System.out.print("Enter the value of a : ");
        a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        c = sc.nextInt();
        System.out.print("Enter the value of d : ");
        d = sc.nextInt();
        System.out.print("Enter the value of e : ");
        e = sc.nextInt();
        System.out.print("Enter the value of f : ");
        f = sc.nextInt();

        if(((a*d)-(b*c))==0){
            System.out.println("The equation has no solution.");
            System.exit(0);
        }

        x = ((e*d)-(b*f))/((a*d)-(b*c));
        y = ((a*f)-(e*c))/((a*d)-(b*c));

        System.out.println("Value of x : "+x);
        System.out.println("Value of y : "+y);


    }
}
