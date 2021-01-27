/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author D.Chong
 */
public class book {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] book = new String[n];
        for(int i=0;i<book.length;i++){
            System.out.print("Enter Book Title: ");
            book[i] = sc.nextLine();
            System.out.println(book[i]);
        }
        for(String s : book){
           if(s.charAt(0)== 'M'||s.charAt(0)=='N'){ 
                System.out.println("List of book title begins with M and N:");
                System.out.println(s);
           }
        }
        for(String a : book){
            if(a.length()>10){
                System.out.println("List of book title is more than 10 letters: ");
                System.out.println(a);
            }  
        }
    }
}
