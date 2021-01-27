package week.pkg10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Week10 {

    public static void main(String[] args) {
        
        //create objects from the Restaurant class
        //object without argument
        //a - ABC, Kepong, 20
        //b - CDE, PJ, 10
        Restaurant a = new Restaurant();
        Restaurant b = new Restaurant();
        a.setName("ABC");
        a.setAddress("Kepong");
        a.setNumber(20);
        b.setName("CDE");
        b.setAddress("PJ");
        b.setNumber(10);
        System.out.println(a.toString());
        System.out.println();
        System.out.println(b.toString());
        System.out.println();
        if(a.getNumber()>b.getNumber())
            System.out.println(a.getName()+" has more employees.");
        else
            System.out.println(b.getName()+" has more employees.");
        
        
        //object with argument 
        //c - XYZ, KL, 50
        Restaurant c = new Restaurant("XYZ","KL",50);
        System.out.println("\n"+c.toString());
        
        // make copy of c object
        Restaurant d = new Restaurant(c);
        System.out.println("\n"+d.toString());
        
        // object is reference data type
        special(b);
        System.out.println("\n"+b.toString());
        
        
        // array of object
        int size = 5;
        Restaurant [] rest = new Restaurant [size];
        // use for loop
        rest[0] = new Restaurant("OPQ","Serdang",30);
        rest[1] = new Restaurant("LMN","Kajang",22);
        System.out.println("\n"+rest[0].toString());
        System.out.println("\n"+rest[1].toString());
        
        
        //write a program to create the Book class
        //the attribute values of the class is stored
        //in a text file named "book.txt"
        /*try{
            Scanner sc = new Scanner (new FileInputStream("C:\\Users\\D.Chong\\IdeaProjects\\Java\\Week10\\book.txt"));
            int count = 0;
            while(sc.hasNextLine()){
                sc.nextLine();
                count++;
            }
            sc.close();
            sc = new Scanner(new FileInputStream("C:\\Users\\D.Chong\\IdeaProjects\\Java\\Week10\\book.txt"));
            Book [] book = new Book[count];
            for(int i=0; i<book.length; i++){
                String [] raw = sc.nextLine().split(",");
                int y = Integer.parseInt(raw[1]);
                double p = Double.parseDouble(raw[3]);
                book[i] = new Book(raw[0],raw[2],y,p);
            }
            sc.close();
            System.out.println("The book details are: ");
            for(int i=0; i<book.length; i++){
                System.out.println(book[i].toString());
            }
        }catch (FileNotFoundException e){
            System.out.println("File is not found.");
        }*/
    }
    public static void special(Restaurant a){
        a.setAddress("Johor");
    }
    
}
