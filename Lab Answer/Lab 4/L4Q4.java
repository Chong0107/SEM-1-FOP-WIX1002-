package com.company;

import java.util.Scanner;

public class L4Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter the weekday that the year starts: ");
        int firstDayYear = sc.nextInt();
        for (int month = 1; month <= 12; month++) {
            int dayMonth = 0;
            String monthDisplay = sc.next();
            switch (month) {
                case 1:
                    monthDisplay = "January";
                    dayMonth = 31;
                    break;

                case 2:
                    monthDisplay = "February";
                    for (int leapYear = 0; leapYear > -1; ) {
                        leapYear += 4;
                        if (year == leapYear) {
                            dayMonth = 29;
                            break;
                        } else
                            dayMonth = 28;
                    }
                    break;

                case 3:
                    monthDisplay = "March";
                    dayMonth = 31;
                    break;

                case 4:
                    monthDisplay = "April";
                    dayMonth = 30;
                    break;

                case 5:
                    monthDisplay = "May";
                    dayMonth = 31;
                    break;

                case 6:
                    monthDisplay = "June";
                    dayMonth = 30;
                    break;

                case 7:
                    monthDisplay = "July";
                    dayMonth = 31;
                    break;

                case 8:
                    monthDisplay = "August";
                    dayMonth = 30;
                    break;

                case 9:
                    monthDisplay = "September";
                    dayMonth = 31;
                    break;

                case 10:
                    monthDisplay = "October";
                    dayMonth = 30;
                    break;

                case 11:
                    monthDisplay = "November";
                    dayMonth = 31;
                    break;

                case 12:
                    monthDisplay = "December";
                    dayMonth = 30;
                    break;

                default:
                    System.out.println("Invalid: Your month is not in the list. Please try again later.");
                    System.exit(0);
            }
            System.out.println("                      "+ monthDisplay + " " + year);
            System.out.println("_____________________________________");
            System.out.println("Sun     Mon     Tue     Wed     Thu     Fri     Sat");

            int firstDayEachMonth = (dayMonth + firstDayYear)%7;
            for(int space=1;space<=firstDayEachMonth;space++)
                System.out.println("   ");

            for(int daysDisplay=1; daysDisplay<=dayMonth;daysDisplay++){
                if(firstDayYear%7 == 0)
                    System.out.println();
                System.out.printf("%3d      ",daysDisplay);
                firstDayYear+=1;
            }
            System.out.println();
        }
    }
}
