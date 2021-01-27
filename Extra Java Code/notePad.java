package com.company;

import java.io.*;
import java.util.Scanner;
import static java.lang.System.*;

public class notePad {
    public static void main(String[] args) {
        try{
            PrintWriter output = new PrintWriter(new FileOutputStream("data.txt"));
            Scanner sc = new Scanner(in);
            out.print("Enter a sentence: ");
            String sentence = sc.nextLine();
            for(int i=0;i<sentence.length();i++){
                int ASCIIdecimal = (int) sentence.charAt(i);
                int [] binary = new int[8];
                for(int bit=0;bit<8;bit++){
                    if(ASCIIdecimal % 2 == 0)
                        binary[bit] = 0;
                    else
                        binary[bit] = 1;
                    ASCIIdecimal /= 2;
                }
                for(int bit=7;bit>=0;bit--){
                    output.print(binary[bit]);
                }
                output.println();
            }
            output.close();
        }catch (IOException e){
            out.println("Problem with file output.");
        }
        try{
            Scanner sc = new Scanner(new FileInputStream("data.txt"));
            int bit, decimal, power;
            while(sc.hasNext()){
                bit = sc.nextInt();
                decimal = 0;
                power = 0;
                while(bit!=0){
                    decimal += (bit % 10) * Math.pow(2,power);
                    power ++;
                    bit /= 10;
                }
                out.print((char)decimal);
            }
        }catch (FileNotFoundException e){
            out.println("File is not found.");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
}
