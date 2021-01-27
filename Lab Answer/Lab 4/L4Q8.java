package com.company;

import java.util.Random;

public class L4Q8 {
    public static void main(String[] args) {
        // declare and initialize
        Random sc = new Random();
        int generateValue;
        int primeCounter = 0;

        // process and output
        generateValue = sc.nextInt(101);
        System.out.println("Random Value: "+generateValue);
        System.out.print("Prime number: ");
        outer:
        for(int oneByOne = 2; primeCounter < generateValue; oneByOne++){
            for (int j = 2; j <= Math.sqrt(oneByOne); j++) {
                if (oneByOne % j == 0)
                    continue outer;
            }
            primeCounter++;
            System.out.print(oneByOne+" ");
        }

    }
}
