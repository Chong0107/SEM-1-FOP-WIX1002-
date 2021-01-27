package com.company;

import java.util.Scanner;

public class L4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare and initialize variables
        int sum=0;
        int max=0;
        int min=1000;
        int pow=0;
        int n=0;
        int score;
        double SD,v;
        //input score
        System.out.print("Enter a score (negative score to quit): ");
        score = sc.nextInt();
        //process for finding sum, max, min, repeating input score until negative score to stop
        while(score>=0){
            sum+=score;
            if(score>max)
                max=score;
            if(score<min)
                min=score;
            pow+=Math.pow(score,2);
            n++;
            System.out.print("Enter a score (negative score to quit): ");
            score = sc.nextInt();
        }
        //process for finding standard deviation and variance
        v = (pow-(Math.pow(sum,2))/n)/(n-1);
        SD = Math.sqrt(v);
        //display result
        System.out.println("Variance: "+ v);
        System.out.println("Minimum Score: "+min);
        System.out.println("Maximum Score: "+max);
        System.out.println("Average Score: "+(sum/n));
        System.out.printf("Standard Deviation: %.2f",SD);
    }
}
