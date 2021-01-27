package com.company;

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class L6Q3 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int [] reverse = new int[10];
        displayInteger(num);
        out.println("List of array entered: "+ Arrays.toString(num));
        reverseArray(num,reverse);
        out.println("List of array (reversed): "+Arrays.toString(reverse));
    }
    public static void displayInteger(int [] num){
        Scanner sc = new Scanner(in);
        for(int i=0;i<num.length;i++){
            out.print("Enter number: ");
            num[i] = sc.nextInt();
        }
    }
    public static void reverseArray(int [] num, int [] reverse){
        for(int i=0;i<num.length;i++){
            while(num[i]!=0){
                int hold = num[i]%10;
                reverse[i] = (reverse[i]*10)+hold;
                num[i] /= 10;
            }
        }
    }
}
