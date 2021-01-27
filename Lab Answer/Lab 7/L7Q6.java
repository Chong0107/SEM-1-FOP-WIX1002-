package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class L7Q6 {
    public static void main(String[] args) {
        try{
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n","ProductID","ProductName","Quantity","PricePerUnit","Total");
            Scanner orderInput = new Scanner(new FileInputStream("c://Users/D.Chong/IdeaProjects/Java/Lab07/order.txt/"));
            Scanner productInput = new Scanner(new FileInputStream("c://Users/D.Chong/IdeaProjects/Java/Lab07/product.txt/"));
            String [][] product = new String[7][];
            for(int i=0;i<7;i++){
                product[i] = productInput.nextLine().split(",");
            }
            while(orderInput.hasNextLine()){
                String [] order = orderInput.nextLine().split(",");
                for(int i=0;i<product.length;i++){
                    if(order[1].equalsIgnoreCase(product[i][0])){
                        double price = Integer.parseInt(order[2])*Double.parseDouble(product[i][2]);
                        System.out.printf("%-20s%-20s%-20s%-20s%-20.2f\n",product[i][0],product[i][1],order[2],product[i][2],price);
                    }
                }
            }
            productInput.close();
            orderInput.close();
        }catch (FileNotFoundException e){
            System.out.println("\nFile is not found.");
        }
    }
}

