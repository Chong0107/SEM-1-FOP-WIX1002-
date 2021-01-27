package com.company;

import java.util.Scanner;

public class Exam17S1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of teams: ");
        int num = sc.nextInt();
        String [] team = new String[num];
        int [] score = new int[num];
        for(int i=0;i<num;i++){
            sc.nextLine();
            System.out.print("Enter team "+(i+1)+" name: ");
            team[i] = sc.nextLine();
            System.out.print("Enter team "+(i+1)+" score: ");
            score[i] = sc.nextInt();
        }
        for ( int pass = 0; pass < score.length - 1; pass++ ) {
            for (int i = 0; i < score.length - 1; i++) {
                if (score[i + 1] > score[i]) {
                    int hold = score[i + 1];
                    score[i + 1] = score[i];
                    score[i] = hold;

                    String hold2 = team[i+1];
                    team[i + 1] = team[i];
                    team[i] = hold2;
                }
            }
        }
        System.out.println("List of team with the highest team score first: ");
        for(int i=0;i<num;i++){
            System.out.print(team[i]+" ("+score[i]+")"+" | ");
        }
    }
}
