package com.company;

import java.io.*;
import java.util.Scanner;

    public class L7Q1 {
        public static void main(String[] args){
            try{
                String[][] array = {{"WXES1116", "Programming I"}, {"WXES1115", "Data Structure"}, {"WXES1110", "Operating System"}, {"WXES1112", "Computing Mathematics I"}};
                ObjectOutputStream output = new ObjectOutputStream (new FileOutputStream("coursename.dat"));
                for(int i=0;i<array.length;i++){
                    for(int j=0;j<array[i].length;j++){
                        output.writeUTF(array[i][j]);
                    }
                }
                output.close();
            }catch(IOException e){
                System.out.println("Problem with file output.");
            }

            try{
                ObjectInputStream input = new ObjectInputStream(new FileInputStream("course.dat"));
                System.out.print("Enter the course code: ");
                Scanner sc = new Scanner(System.in);
                String code = sc.nextLine();
                boolean found = false;
                try{
                    while(true){
                        String courseCode = input.readUTF();
                        String courseName = input.readUTF();
                        if(courseCode.equals(code)){
                            found = true;
                            System.out.println("The course name for the code is "+courseName+".");
                            break;
                        }
                    }
                }catch(EOFException e){
                    System.out.println("Couldn't find the course code.");
                }
                input.close();
            } catch (FileNotFoundException e) {
                System.out.println("The file is not found.");
            } catch (IOException e) {
                System.out.println("Problem with file output.");
            }
        }

    }

