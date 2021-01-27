package com.company;

import static java.lang.System.out;
import java.util.*;

public class L4Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declare and initialize
        double M,Cn,Ln,Rn,i;
        double total_interest=0;
        int N,n,j,P;
        // input
        out.print("Enter principle amount: ");
        P = sc.nextInt();
        out.print("Enter interest in %: ");
        i = sc.nextDouble();
        out.print("Enter total number if month(s): ");
        N = sc.nextInt();
        out.println("\nMortgage Loan: ");
        out.printf("%-8s %18s %18s %18s %18s %n","Month","Monthly Payment","Principle","Interest","Unpaid Balance","Total Interest");
        out.println("-----------------------------------" + "-------------------------------------------------");
        // process and output
        for(j=1;j<=N;j++){
            n=j;
            M = (P*(i/1200))/(1-Math.pow((1+(i/1200)),-N));
            Cn = M*Math.pow((1+i/1200),-(1+N-n));
            Ln = M-Cn;
            Rn = Ln/(i/1200) - Cn;
            total_interest+=Ln;
            out.printf("%-8d %18.2f %18.2f %18.2f %18.2f %n",j,M,Cn,Ln,Rn,total_interest);
        }
    }
}
