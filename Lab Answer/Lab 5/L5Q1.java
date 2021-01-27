package com.company;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        System.out.print("Enter number of Student(s): ");
        n = sc.nextInt();
        String[]name = new String[n];
        int[]marks = new int[n];
        double sum=0;
        double ave;
        sc.nextLine();
        for(int i=0;i<name.length;i++){
            System.out.print("Enter name : ");
            name[i]=sc.nextLine();
        }
        for(int i=0;i<name.length;i++){
            marks[i]=r.nextInt(101);
        }
        System.out.println("\nList of name and marks: ");
        for(int i=0;i<name.length;i++){
            System.out.println((i+1)+"."+name[i]+"\t"+marks[i]);
            sum += marks[i];
        }
        System.out.println("\nSum of those mark(s): "+sum);
        ave = sum / marks.length;
        System.out.printf("Average: %.2f",ave);
        double highest = marks[0];
        double lowest = marks[0];
        for(int i=0;i< marks.length;i++){
            if(marks[i]>highest)
                highest = marks[i];
            if(marks[i]<lowest)
                lowest = marks[i];
        }
        System.out.println("\nHighest mark: "+highest);
        System.out.println("Lowest mark: "+lowest);
    }
}
