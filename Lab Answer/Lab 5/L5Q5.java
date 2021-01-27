package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.*;
import static java.lang.System.*;

public class L5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        Random r = new Random();

        //declare and initialize
        final int Max = 100;
        int size = 20;
        int [] num = new int[size];
        
        //generate 20 random number in unsorted form
        out.println("A list of 20 random integer within 0 to 100 ");
        for(int i=0;i< num.length;i++){
            num[i]=r.nextInt(Max+1);
        }
        String listDisplay = Arrays.toString(num);
        listDisplay = listDisplay.replace("[", "");
        listDisplay = listDisplay.replace("]", "");
        out.println(listDisplay);

        //Find the position of number in unsorted array (linear search)
        out.print("Enter a number to search: ");
        int key = sc.nextInt();
        boolean search = false;
        for(int i=0;i< num.length;i++){
            if(num[i] == key){
                out.println(key+" found");
                out.println("Linear Search - "+(i)+" loop(s)");
                search = true;
                break;
            }
        }
        if(!search)
            out.println("Sorry, the number is not found in this array.");

        //generate 20 random number in sorted form
        out.println("\nArray in descending order");
        for ( int pass = 1; pass < num.length ; pass++ ) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    int hold = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = hold;
                }
            }
        }
        String listDisplay1 = Arrays.toString(num);
        listDisplay1 = listDisplay1.replace("[", "");
        listDisplay1 = listDisplay1.replace("]", "");
        out.println(listDisplay1);

        //Find the position of number in sorted array (binary search)
        out.print("Enter a number to search: ");
        key = sc.nextInt();
        boolean search1 = false;
        int low = num.length - 1;
        int high = 0;
        int middle;
        while(low >= high){
            middle = (low + high )/2;
            if(key == num[middle]){
                out.println(key+" found");
                out.println("Binary Search - "+middle+" loop(s)");
                search1 = true;
                break;
            }
            else if(key<num[middle])
                high = middle + 1;
            else
                low = middle - 1;
        }
        if(!search1)
            out.println("Sorry, the number is not found in this array.");

    }
}

//String listDisplay = Arrays.toString(num);
//listDisplay = listDisplay.replace("[", "");
//listDisplay = listDisplay.replace("]", "");
//System.out.println(listDisplay);
