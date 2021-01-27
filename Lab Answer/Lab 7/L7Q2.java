package com.company;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L7Q2 {
    public static void main(String[] args) {
    try{
        URL u = new URL("https://fsktm.um.edu.my/");
        URLConnection cnn = u.openConnection();
        InputStream stream = cnn.getInputStream();
        Scanner in = new Scanner(stream);

        PrintWriter output = new PrintWriter(new FileOutputStream("index.html"));
        while(in.hasNextLine()){
            output.println(in.nextLine());
        }
        output.close();
    }catch (IOException e){
        System.out.println("ID Error: "+e.getMessage());
    }
    }
}
