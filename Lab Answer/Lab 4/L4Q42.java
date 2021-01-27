package com.company;

import java.util.Scanner;

public class L4Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare and initialize variables
        int year;
        int firstDayOfYear;
        int dayOfMay;
        int dayOfAugust;
        boolean isLeapYear;

        //input
        System.out.print("Enter year: ");
        year = sc.nextInt();
        System.out.print("Enter first day of the month: ");
        firstDayOfYear = sc.nextInt();

        //process and output
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        if(isLeapYear) {
            System.out.println(year+" is leap year.");
            dayOfMay = firstDayOfYear + 1 + 1;
        }
        else {
            System.out.println(year+" is not leap year.");
            dayOfMay = firstDayOfYear + 1;
        }
        dayOfMay %= 7;

        //empty space
        System.out.println("\nMay: ");
        for(int offset=0;offset<dayOfMay;offset++){
            System.out.print("\t");
        }

        //calender May
        int offsetday = dayOfMay+1;
        for(int dayCount=1;dayCount<=31;dayCount++){
            System.out.print(dayCount+"\t");
            if(offsetday%7==0){
                System.out.println(" ");
            }
            offsetday++;
        }

        System.out.println("\n\n");

        dayOfAugust = dayOfMay + 1;
        dayOfAugust %= 7;

        //empty space
        System.out.println("August: ");
        for(int offset=0;offset<dayOfAugust;offset++){
            System.out.print("\t");
        }

        //calender August
        int offsetDay = dayOfAugust+1;
        for(int dayCount=1;dayCount<=31;dayCount++){
            System.out.print(dayCount+"\t");
            if(offsetDay%7==0){
                System.out.println(" ");
            }
            offsetDay++;
        }
    }
}
