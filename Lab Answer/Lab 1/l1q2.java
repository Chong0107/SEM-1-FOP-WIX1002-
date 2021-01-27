package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class l1q2 {
    public static void main(String[] args) {
        int p1_1 = roll();
        int p1_2 = roll();
        System.out.println("Player 1 dice get " + p1_1 + " " + p1_2);
        int sum1 = p1_1+p1_2;

        int p2_1 = roll();
        int p2_2 = roll();
        System.out.println("Player 2 dice get " + p2_1 + " " + p2_2);
        int sum2 = p2_1 +p2_2;

        if(p1_1==6 && p1_2==6){
            System.out.println("Player 1 get both dice 6!");
            sum1 = firstRules();
        }

        else if(p2_1==6 && p2_2==6){
            System.out.println("Player 2 get both dice 6!");
            sum2=firstRules();
        }

        if(p1_1==1 && p1_2==1){
            System.out.println("Player 1 both dice are 1!");
            sum1=secondRules(sum1);
        }
        else if(p2_1==1 && p2_2==1){
            System.out.println("Player 2 both dice are 1!");
            sum2=secondRules(sum2);
        }

        if((p1_1%2!=0 && p1_2%2!=0) && (p1_1!=1 || p1_2!=1)){
            System.out.println("Player 1 both dice are odd number and not both 1!");
            sum1=thirdRules(sum1);
        }
        else if((p2_1%2!=0 && p2_2%2!=0) && (p2_1!=1 || p2_2!=1)){
            System.out.println("Player 2 both dice are odd number and not both 1!");
            sum2=thirdRules(sum2);
        }


        if(sum1>sum2){
            System.out.println("Player 1 win the game with score " + sum1 + " compared to Player 2 score " + sum2);
        }
        if(sum2>sum1) {
            System.out.println("Player 2 win the game with score " + sum2 + " compared to Player 1 score " + sum1);
        }

    }
    public static int roll(){
        return ThreadLocalRandom.current().nextInt(1,7);
    }

    public static int firstRules(){
        System.out.println("Both dice are 6! ");
        int a,b,c,d;
        a=roll();
        b=roll();
        System.out.println("The dice in first extra roll are : " + a + " " + b);

        c=roll();
        d=roll();
        System.out.println("The dice in second extra roll are : " + c + " " + d);

        return a+b+c+d;
    }

    public static int secondRules(int sum){
        return sum*+2;
    }

    public static int thirdRules(int sum) {
        return sum -= 5;
    }
    }


