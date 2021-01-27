package com.company;

import java.util.Scanner;

public class Exam17S2Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial tuition fee (i.e year 1): ");
        double fee = sc.nextDouble();
        System.out.print("Enter the yearly rate of increment (e.g enter 5.2 for 5.2%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        int year = sc.nextInt();
        System.out.print("\nComputed tuition fee for year "+year+" is: RM");
        System.out.printf("%.2f",computeFees(fee,rate,year));
    }
    public static double computeFees(double fee, double rate, int year){
        double tuitionFee = fee;
        for(int i=1;i<year;i++){
            tuitionFee += tuitionFee * (rate / 100);
        }
        return tuitionFee;
    }
}
