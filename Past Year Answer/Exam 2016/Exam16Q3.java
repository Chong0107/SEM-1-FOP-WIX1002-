package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.*;

public class Exam16Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.print("Enter the number(s) of random integer: ");
        int n = sc.nextInt();
        int [] random = new int[n];
        generateInteger(random);
        getMax(random);
        roundOff(random);
        reverseOrder(random);
    }

    public static void generateInteger(int [] random){
        Random a = new Random();
        out.print("The random integer: ");
        for(int i=0;i<random.length;i++){
            random[i] = a.nextInt(1001);
            out.print(random[i]+" ");
        }
    }

    public static void getMax(int [] random){
        int max = random[0];
        out.print("\nMaximum Number: ");
        for(int j : random){
            if(max < j)
                max = j;
        }
        out.print(max);
    }

    public static void roundOff(int [] random){
        out.print("\nThe approximate of integer to the nearest tenth: ");
        for (int j : random) {
            if (j % 10 <= 4)
                out.print((j - (j % 10)) + " ");
            else
                out.print(j + (10 - (j % 10)) + " ");
        }
    }

    public static void reverseOrder(int [] random){
        out.print("\nThe random integer in reverse order: ");
        for(int a : random){
            String num = Integer.toString(a);
            for(int j=num.length()-1;j>=0;j--){
                out.print(num.charAt(j));
            }
            out.print(" ");
        }
    }
}
