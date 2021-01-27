package com.company;

import java.util.Random;

public class L4Q5S2 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(7);
        int sum1 = 0;
        System.out.println("Score of player 1 at this turn: " + x);
        sum1 = x;
        System.out.print("Total score of Player 1 after this turn: " + sum1);

        System.out.println();
        if (x == 6) {
            do {
                System.out.println("Player 1 turn again.");
                x = r.nextInt(7);
                System.out.println("Score of player 1 at this turn: " + x);
                sum1 = sum1 + x;
                System.out.println("Total score of Player 1 after this turn: " + sum1);
            } while (x == 6);
        }
        System.out.println();

        int y = r.nextInt(7);
        int sum2 = 0;
        System.out.println("Score of player 2 at this turn: " + y);
        sum2 = y;
        System.out.println("Total score of Player 2 after this turn: " + sum2);

        System.out.println();
        if (y == 6) {
            do {
                System.out.println("Player 2 turn.");
                y = r.nextInt(7);
                System.out.println("Score of player 2 at this turn: " + y);
                sum2 = sum2 + y;
                System.out.println("Total score of Player 2 after this turn: " + sum2);
            } while (y == 6);
        }
        System.out.println();

        while (sum1 < 100 || sum2 < 100) {
            x = r.nextInt(7);
            if (x == 6) {
                System.out.println("Player 1 turn.");
                x = r.nextInt(7);
                System.out.println("Score of player 1 at this turn: " + x);
                sum1 = sum1 + x;
                System.out.println("Total score of Player 1 after this turn: " + sum1);
            } else {
                System.out.println("Player 1 turn.");
                x = r.nextInt(7);
                System.out.println("Score of player 1 at this turn: " + x);
                sum1 = sum1 + x;
                System.out.println("Total score of Player 1 after this turn: " + sum1);
            }
            System.out.println();

            y = r.nextInt(7);
            if (y == 6) {
                System.out.println("Player 2 turn.");
                y = r.nextInt(7);
                System.out.println("Score of player 2 at this turn: " + y);
                sum2 = sum2 + y;
                System.out.println("Total score of Player 2 after this turn: " + sum2);
            } else {
                System.out.println("Player 2 turn.");
                y = r.nextInt(7);
                System.out.println("Score of player 2 at this turn: " + y);
                sum2 = sum2 + y;
                System.out.println("Total score of Player 2 after this turn: " + sum2);
            }
            System.out.println();
        }
        if (sum1 > sum2)
            System.out.print("Player 1 wins");
        else
            System.out.println("Player 2 wins");
    }
}
