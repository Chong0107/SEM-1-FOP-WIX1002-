package com.company;

import java.util.Arrays;

public class Exam16Q1 {
    public static void main(String[] args) {
        int [] num = {34,15,12,27,74,23};
        int cnt = 0;
        for (int j : num) {
            if (isEven(j))
                cnt++;
        }
        String array = Arrays.toString(num);
        array = array.replace("["," ");
        array = array.replace("]"," ");
        System.out.println("All number(s): "+array);
        System.out.println("The number of even number is "+cnt);
        System.out.println("The sum of the array is "+getTotal(num));
    }
    public static boolean isEven(int a){
        return a % 2 == 0;
    }
    public static int getTotal(int[] a){
        int sum = 0;
        for (int j : a) {
            sum += j;
        }
        return sum;
    }
}
