package com.company;

import java.util.Random;
public class l1q2CHONG {
    public static void main(String[] args) {
        int p1_1 = roll();
        int p1_2 = roll();
        System.out.println("Player 1 dice : " + p1_1 + " " + p1_2);
        int sum1 = p1_1 + p1_2;

        int p2_1 = roll();
        int p2_2 = roll();
        System.out.println("Player 2 dice : " + p2_1 + " " + p2_2);
        int sum2 = p2_1 + p2_2;

        if (p1_1 == 6 && p1_2 == 6) {
            System.out.println("Player 1 get both dice 6!");
            sum1 = firstRules();
        }
        else if (p2_1 == 6 && p2_2 == 6) {
            System.out.println("Player 2 get both dice 6!");
            sum2 = firstRules();
        }

        if (p1_1 == 1 && p1_2 == 1) {
            System.out.println("Player 1 both dice are 1!");
            sum1 = secondRules(sum1);
        }
        else if (p2_1 == 1 && p2_2 == 1) {
            System.out.println("Player 2 both dice are 1!");
            sum2 = secondRules(sum2);
        }

        if ((p1_1 % 2 != 0 && p1_2 % 2 != 0) && (p1_1 != 1 || p1_2 != 1)) {
            System.out.println("Player 1 both dice are odd number and not both 1!");
            sum1 = thirdRules(sum1);
        }
        else if ((p2_1 % 2 != 0 && p2_2 % 2 != 0) && (p2_1 != 1 || p2_2 != 1)) {
            System.out.println("Player 2 both dice are odd number and not both 1!");
            sum2 = thirdRules(sum2);
        }


        if (sum1 > sum2) {
            System.out.println("");
            System.out.println("**TOTAL MARKS**");
            System.out.println("Player 1 : " +sum1);
            System.out.println("Player 2 : "+sum2);
            System.out.println("Player 1 WIN!");
        }
        else if (sum2 > sum1) {
            System.out.println("");
            System.out.println("**TOTAL MARKS**");
            System.out.println("Player 1 : " +sum1);
            System.out.println("Player 2 : "+sum2);
            System.out.println("Player 2 WIN!");
        }
        else{
            System.out.println("");
            System.out.println("**TOTAL MARKS**");
            System.out.println("Player 1 : " +sum1);
            System.out.println("Player 2 : "+sum2);
            System.out.println("DRAW!");
        }

    }

    public static int roll() {
        Random sc = new Random();
        return sc.nextInt(6)+1;
    }

    public static int firstRules() {
        int a = roll();
        int b = roll();
        while(a==6 && b==6){
            a = roll();
            b = roll();
            if(!(a==6 && b==6)){
                break;
            }
        }
        if (a == 1 && b == 1) {
            System.out.println("Player in extra dice both dice are 1!");
            return secondRules(a+b);
        }

        else if ((a % 2 != 0 && b % 2 != 0) && (a != 1 || b != 1)) {
            System.out.println("Player in extra dice both dice are odd number and not both 1!");
            return thirdRules(a+b);
        }

        else{
            return a+b;
        }
    }

    public static int secondRules(int sum) {

        return sum *=2;
    }

    public static int thirdRules(int sum) {

        return sum -=5;
    }
}
