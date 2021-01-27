package com.company;

import java.util.Random;
import java.util.Scanner;
import static java.lang.System.*;

public class L6Q5 {
    public static void main(String[] args) {
        multiplyGames();
    }
    public static void multiplyGames(){
        boolean active = true;
        int correct = 0;
        while(active){
            Random r = new Random();
            int a = r.nextInt(13);
            Random r1 = new Random();
            int b = r1.nextInt(13);
            int ans = a * b;
            out.println("Enter negative number to quit.");
            Scanner sc = new Scanner(in);
            out.print(a+" X "+b+" = ");
            int guess = sc.nextInt();  //String accurate = String.valueOf(ans);

            if(guess == ans){
                correct++;
            }
            if(guess<0){
                active = false;
            }
        }
        out.println("Your Score is "+correct);
    }
}
