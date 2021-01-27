package com.company;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class Exam16Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Random r = new Random();
        int playerWin = 0;
        int compWin = 0;
        int playerAction;
        int compAction;
        String [] action = {"Paper","Scissor","Rock"};

        while(compWin != 3 && playerWin != 3){
            out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            playerAction = sc.nextInt();
            compAction = r.nextInt(3)+1;
            out.println("Player : "+action[playerAction-1]+" ----- Computer : "+action[compAction-1]);

            if(compAction == playerAction){
                out.println("Draw");
            }
            else if((compAction == playerAction + 1) ||(compAction == 1 && playerAction == 3)){
                compWin++;
                out.println("Computer win "+compWin+" time(s)");
            }
            else{
                playerWin++;
                out.println("Player win "+playerWin+" time(s)");
            }
        }
        if(playerWin == 3)
            out.println("PLayer wins the game.");
        else
            out.println("Computer wins the game.");
    }
}
