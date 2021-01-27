package com.company;

import java.util.Scanner;

public class l1q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables
        String eq1,eq2;
        int a,b,c,d,e,f,x,y;
        //input eq1 and eq2
        System.out.print("Enter Input Line 1: ");
        eq1 = sc.nextLine();
        System.out.print("Enter Input Line 2: ");
        eq2 = sc.nextLine();
        //split {x,y,=} from eq1 and eq2
        // example:
        // 1x+2y=8
        // ax+by=e
        // 2x+9y=26
        // cx+dy=f
        String[] line1 = eq1.split("x"); // "1"=[0]   "+2y=8" =[1]
        String[] line2 = eq2.split("x"); // "2"=[0]   "+9y=26"=[1]
        a = Integer.parseInt(line1[0]);
        c = Integer.parseInt(line2[0]);
        String r1 = line1[1];
        String r2 = line2[1];

        line1 = r1.split("y");// "+2"=[0]     "=8" =[1]
        line2 = r2.split("y");// "+9"=[0]    "=26" =[1]
        b = Integer.parseInt(line1[0]);
        d = Integer.parseInt(line2[0]);
        r1 = line1[1];
        r2 = line2[1];

        line1 = r1.split("=");// " "=[0]  "8" =[1]
        line2 = r2.split("=");// " "=[0]  "26" =[1]
        e = Integer.parseInt(line1[1]);
        f = Integer.parseInt(line2[1]);

        //requirement for output
        //process for finding the value of x and y
        if(((a*d)-(b*c))==0){
            System.out.println("The equation has no solution.");
        }
        else{
            x = ((e*d)-(b*f))/((a*d)-(b*c));
            y = ((a*f)-(e*c))/((a*d)-(b*c));
            System.out.println("Value of x : "+x);
            System.out.println("Value of y : "+y);
        }
    }
}
