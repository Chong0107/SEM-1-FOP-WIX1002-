package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exam17S1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of random integer: ");
        int num = sc.nextInt();
        int[] random = new int[num];
        listRandom(random);
        System.out.println("\nMinimum Number: "+getMin(random));
        System.out.print("The approximation of the integer to the nearest hundred: ");
        nearestHundred(random);
        System.out.print("\nThe random integer in reverse order:");
        order(random);
    }
    public static void listRandom (int[]a) {
        Random r = new Random();
        System.out.print("The random integer: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(10001);
            System.out.print(a[i] + " ");
        }
    }
    public static int getMin(int[] b){
        int min = b[0];
        for(int i=0;i<b.length;i++){
            if(b[i]<min)
                min = b[i];
        }
        return min;
    }
    public static void nearestHundred(int[]c){
        for(int i=0;i<c.length;i++){
            if(c[i]%100>=50) {
                System.out.print((c[i] + (100 - (c[i]%100)))+" ");
            }
            else {
                System.out.print((c[i] - (c[i] % 100))+" ");
            }
        }
    }
    public static void order(int[]d){
        for(int i=0;i<d.length;i++) {
            String number = Integer.toString(d[i]);
            StringBuilder reverse = new StringBuilder(" ");
            int length = number.length();
            for (int j = length - 1; j >= 0; j--) {
                reverse.append(number.charAt(j));
            }
            System.out.print(reverse+" ");
        }
    }
}
