package com.company;

import java.io.*;

public abstract class Eleven {
    protected int[] array = new int[8];
    private String  filename;

    public Eleven(String filename) {
        this.filename = filename;
        try{
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("data.dat"));
            try {
                int j=0;
                while(input.available() > 0){
                    array[j++] = input.readInt();
                }
            }catch (EOFException e){}
            input.close();;
        }catch (FileNotFoundException e){
            System.out.println("File was not found.");
        }catch (IOException e){
            System.out.println("Error reading from file.");
        }
    }

    public abstract String divide();

}
