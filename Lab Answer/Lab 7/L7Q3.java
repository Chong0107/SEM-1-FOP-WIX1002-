package com.company;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class L7Q3 {
    public static void main(String[] args) {
        String sentence = "Steady";
        try{
            PrintWriter output = new PrintWriter(new FileOutputStream("reverse.txt"));
            for(int i=sentence.length()-1;i>=0;i--){
                output.print(sentence.charAt(i));
            }
            output.println();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File was not found");
        }

    }
}
