package com.company;

import java.util.Random;
import java.util.*;

public class l1q2Extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int firstValue,secondValue;
        int[] scores = new int[2];
        int[] cumulativeScores = new int[2];
        boolean nextRound = true;
        int roundNum = 1;

        while(nextRound){
            int loop = 0;
            System.out.println("\n================= ROUND " + roundNum++ + " ==================\n");
            while(loop < 2){
                System.out.println("Player "+(loop + 1)+" starts rolling the dice.");
                firstValue = r.nextInt(6)+1;
                secondValue = r.nextInt(6)+1;
                System.out.println("first value: "+firstValue+" second value: "+secondValue);

                while(firstValue == 6 && secondValue == 6){
                    System.out.println("Player "+(loop + 1)+"gets 6 for both rolls. Please roll it again.");
                    firstValue = r.nextInt(6)+1;
                    secondValue = r.nextInt(6)+1;
                    System.out.println("first value: "+firstValue+" second value: "+secondValue);
                }
                if(firstValue == 1 && secondValue == 1){
                    scores[loop] = 0;
                    cumulativeScores[loop] *= 2;
                    System.out.println("Player "+(loop + 1)+" gets 1 for both rolls. Your score will be multiply by 2.");
                }
                else if((firstValue % 2 != 0 && secondValue% 2 != 0)&&(firstValue != 1 && secondValue != 1) ){
                    scores[loop] = 0;
                    cumulativeScores[loop] -= 5;
                    System.out.println("You got both odd numbers. Sorry, we will deduct 5 points from your existing points.");
                }
                else{
                    scores[loop] = firstValue + secondValue;
                    cumulativeScores[loop] += scores[loop];
                }
                System.out.println("------------------------------");
                System.out.printf("%-20s: %d\n","P"+(loop + 1)+" round score",scores[loop]);
                System.out.printf("%-20s: %d\n","P"+(loop + 1)+" cumulative score",cumulativeScores[loop]);
                System.out.println("------------------------------");
                loop++;
            }
            System.out.print("Did you want to play for 1 more round ? (Y for continue, other keys for quit.): ");
            char temp = sc.next().charAt(0);
            nextRound = (temp == 'Y' || temp == 'y') ;
        }
        System.out.println("\n================== SCORE BOARD ==================\n");
        System.out.printf("TOTAL SCORES - Player 1 (%d), Player 2 (%d)\n",cumulativeScores[0],cumulativeScores[1]);
        System.out.print("RESULT: ");
        if(cumulativeScores[0]>cumulativeScores[1])
            System.out.println("Player 1 WIN !");
        else if(cumulativeScores[0]<cumulativeScores[1])
            System.out.println("Player 2 WIN !");
        else
            System.out.println("DRAW !");
        System.out.println("================================================");
    }
}
