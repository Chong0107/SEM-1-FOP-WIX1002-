package com.company;

import java.io.*;

public class Exam17S1Q4 {
    public static void main(String[] args) {
        try{
            int q,m,y;
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\D.Chong\\IdeaProjects\\Java\\Q4.dat"));
            try{
                while(true){
                    q = in.readInt();
                    m = in.readInt();
                    y = in.readInt();
                    DayOfTheWeek dow = new DayOfTheWeek(q,m,y);
                    System.out.println(dow.toString());;
                }
            }catch (EOFException e){ }
             in.close();
            }catch (FileNotFoundException e){
                System.out.println("File was not found.");
            }catch (IOException e){
                System.out.println("Problem with file input");
        }
    }
}
