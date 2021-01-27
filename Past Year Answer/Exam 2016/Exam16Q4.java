package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exam16Q4 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new FileInputStream("Q4.txt"));
            while (input.hasNextLine()){
                String password = input.nextLine();
                boolean upperCase = false;
                boolean lowerCase = false;
                boolean digit = false;
                boolean nonAlphanumeric = false;
                for(int i=0;i<password.length();i++){
                    if(Character.isUpperCase(password.charAt(i)))
                        upperCase = true;
                    if(Character.isLowerCase(password.charAt(i)))
                        lowerCase = true;
                    if(Character.isDigit(password.charAt(i)))
                        digit = true;
                    if(!Character.isSpaceChar(password.charAt(i)) && !Character.isLetterOrDigit(password.charAt(i)))
                        nonAlphanumeric = true;
                }
                if(password.length()>=8 && upperCase && lowerCase && digit && nonAlphanumeric)
                    System.out.println("Strong password.");
                else
                    System.out.println("Not a strong password.");
            }
            input.close();
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }
    }
}
