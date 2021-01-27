package com.company;

import java.util.Scanner;

public class R1Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables
        int usage,i;
        String n,name;
        double payment;
        for(i=1;i<=3;i++) {
            System.out.print("Enter Full Name: ");
            name = sc.nextLine();
            System.out.print("Enter Account Number: ");
            n = sc.nextLine();
            System.out.print("Enter Total Usage (kWh): ");
            usage = sc.nextInt();
            if (usage > 400)
                payment = (usage - 400) * 0.416 + 100 * 0.4 + 100 * 0.334 + 200 * 0.218;
            else if (usage > 300)
                payment = (usage - 300) * 0.4 + 100 * 0.334 + 200 * 0.218;
            else if (usage > 200)
                payment = (usage - 200) * 0.334 + 200 * 0.218;
            else
                payment = usage * 0.218;
            System.out.println(name + "(" + n + ")");
            System.out.println("Total usage: " + usage);
            System.out.printf("Total Payment: RM%.2f\n\n",payment);
            sc.nextLine();
        }
    }
}
