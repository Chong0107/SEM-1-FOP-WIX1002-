package com.company;

import java.util.Scanner;

public class commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sales;
        double commission;
        System.out.print("Enter the total sales volume : ");
        sales = sc.nextInt();
        if(sales<=100){
            commission = sales * 0.05;
            System.out.println("The commission are RM"+String.format("%.2f",commission));
        }
        else if(sales>100 && sales<=500){
            commission = sales * 0.075;
            System.out.println("The commission are RM"+String.format("%.2f",commission));
        }
        else if(sales>500 && sales<=1000){
            commission = sales * 0.1;
            System.out.println("The commission are RM"+String.format("%.2f",commission));
        }
        else {
            commission = sales * 0.125;
            System.out.println("The commission are RM"+String.format("%.2f",commission));
        }


    }
}
