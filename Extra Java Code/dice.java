package com.company;


import java.util.Random;

public class dice {
    public static void main(String[] args) {
        Random sc = new Random();
        int max=6,min=1;
        System.out.println("Dice Competition" );
        System.out.println("*****************");
        int player1_dice1 = sc.nextInt(max-min+1)+min;
        int player2_dice1 = sc.nextInt(max-min+1)+min;
        int player1_dice2 = sc.nextInt(max-min+1)+min;
        int player2_dice2 = sc.nextInt(max-min+1)+min;

        int sum_player1 = player1_dice1 + player1_dice2;
        int sum_player2 = player2_dice1 + player2_dice2;

        System.out.println("Player 1 (first dice) : "+player1_dice1);
        System.out.println("Player 1 (second dice) : "+player1_dice2);
        System.out.println("Player 2 (first dice) : "+player2_dice1);
        System.out.println("Player 2 (second dice) : "+player2_dice2);
        System.out.println("Total result for Player 1 : "+sum_player1);
        System.out.println("Total result for Player 2 : "+sum_player2);

        if(sum_player1>sum_player2)
            System.out.println("Player 1 wins");

        else if(sum_player1<sum_player2)
            System.out.println("Player 2 wins");

        else
            System.out.println("Draw");
    }
}
