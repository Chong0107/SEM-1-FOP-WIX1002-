package com.company;

import java.util.Random;

public class L4Q5 {
    public static void main(String[] args) {
        Random sc = new Random();
        int sum1=0;
        int sum2=0;
        int player1,player2;
        player1 = sc.nextInt(6+1);
        player2 = sc.nextInt(6+1);
        while(sum1<100 && sum2<100){
            player1 = sc.nextInt(6+1);
            player2 = sc.nextInt(6+1);
            sum1+=player1;
            sum2+=player2;
            if(player1==6){
                sum1+=player1;
                player1 = sc.nextInt(6+1);
                sum1+=player1;
            }
            if(player2==6){
                sum2+=player2;
                player2 = sc.nextInt(6+1);
                sum2+=player2;
            }
        }
        System.out.println("Player 1: "+player1);
        System.out.println("Player 2: "+player2);
        if(sum1>sum2)
            System.out.println("Player 1 WIN !");
        else if(sum2>sum1)
            System.out.println("Player 2 WIN !");
        else
            System.out.println("DRAW");
    }
}
