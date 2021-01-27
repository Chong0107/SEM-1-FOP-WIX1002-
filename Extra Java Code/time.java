package com.company;

import java.util.Scanner;

public class time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second,hours,minutes,second2;
        System.out.print("Enter the number of seconds : ");
        second = sc.nextInt();
        hours = second / 3600;
        minutes = (second % 3600) / 60;
        second2 = (second % 3600) % 60;
        System.out.println(second+" seconds is "+hours+" hours "+minutes+" minutes "+second2+" seconds.");
    }
}
