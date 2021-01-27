package com.company;

import java.io.*;
import java.util.Scanner;

public class L7Q4 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(new FileInputStream("word.txt"));
            while(sc.hasNextLine()){
                int numLine=0, numWords=0, numChar=0;
                while(sc.hasNextLine()){
                    String sentence = sc.nextLine();
                    numLine++;
                    String [] words = sentence.split(" ");
                    numWords+=words.length;
                    for(int i=0;i<words.length;i++){
                        numChar += words[i].length();
                    }
                }
                System.out.println("The number of lines are "+numLine);
                System.out.println("The number of words are "+numWords);
                System.out.println("The number of characters excluding space are "+numChar);
                sc.close();
            }
        }catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }
    }
}
