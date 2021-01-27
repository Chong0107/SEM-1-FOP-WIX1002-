package com.company;

import java.io.*;

public class L7Q5 {
    public static void main(String[] args) {
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\Users\\D.Chong\\IdeaProjects\\Java\\Lab07\\person.dat"));
            int TotalNumberOfRecord = input.readInt();
            System.out.println("The total number(s) of records: "+TotalNumberOfRecord);
            try{
                while (true) {
                    String name = input.readUTF();
                    int age = input.readInt();
                    char gender = input.readChar();
                    System.out.println(name + " " + age + " " + gender);
                }
            }catch (EOFException e){
                System.out.println("\nFinish reading files.");
            }
            input.close();;
        }catch (FileNotFoundException e){
            System.out.println("File is not found.");
        }catch (IOException e){
            System.out.println("Problem with file output.");
        }
    }
}
