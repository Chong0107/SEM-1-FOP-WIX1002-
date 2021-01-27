package com.company;

import java.util.Random;

public class L4Q6 {
    public static void main(String[] args) {
        Random sc = new Random();
        //declare and initialize the variables
        int num;
        int count=1;
        //input the value of random number
        num = Math.abs(sc.nextInt()); // Math.abs = return absolute value
        //process for calculating the number of digit
        System.out.println("Random value(positive): "+num);
        while((num /= 10) != 0){
            count++;
        }
        //display the number of digit
        System.out.println("Number of digit in those number: "+count);
    }
}
// 1