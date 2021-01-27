package com.company;

import java.util.Scanner;

public class R1Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter number of books: ");
        n = sc.nextInt();
        sc.nextLine();
        String[] bookName = new String[n];
        for (int i = 0; i < bookName.length; i++) {
            System.out.print("Enter Book Title: ");
            bookName[i] = sc.nextLine();
        }
        System.out.println("\nList of ALL books: ");
        for (int i = 0; i < bookName.length; i++){
            System.out.println(bookName[i]);
        }
        System.out.println("\nList of book where the book title start with M or N: ");
        for (int i = 0; i < bookName.length; i++) {
            if (bookName[i].charAt(0) == 'M' || bookName[i].charAt(0) == 'N') {
                System.out.println(bookName[i]);
            }
        }
        System.out.println("\nList of book where the book title is more than 10 words: ");
        for(String a : bookName){
            if(a.length() > 10)
                System.out.println(a);
        }
    }
}


