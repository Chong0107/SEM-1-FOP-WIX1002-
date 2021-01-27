package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam18S1Q4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new FileInputStream("myAmbition.txt"));
        int[] characterNum = new int[26];
        int sentence = 0;
        int word = 0;
        System.out.println("The essay is: ");
        while(input.hasNextLine()){
           String line = input.nextLine();
           System.out.println(line);
           for(int i=0;i<line.length();i++){
               char character = line.charAt(i);
               //count the number of each alphabet
               if(Character.isLetter(character)){
                   character = Character.toUpperCase(character);
                   characterNum[character - 'A'] += 1;
               }
               //count number of sentence
               if(character == '.' )
                   sentence++;
           }
           //count number of word
           word += line.split(" ").length;
        }
        System.out.println();
        System.out.println("Number of sentences: "+sentence);
        System.out.println("Number of words: "+word);
        for(int i=0;i< characterNum.length;i++){
            System.out.print((char)(i+'A')+" : "+characterNum[i]+" ");
            if((i+1)%8 == 0)
                System.out.println("");
        }
        input.close();
    }
}


