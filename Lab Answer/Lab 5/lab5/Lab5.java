/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        //decalre and initialize
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        final int MAX = 100;
        int [] num = new int [20];
        //display unsorted array
        System.out.println("A list of 20 random integer within 0 and 100");
        for(int i=0;i<num.length;i++){
            num[i] = r.nextInt(MAX+1);
        }
        String displayInteger = Arrays.toString(num);
        displayInteger = displayInteger.replace("[", "");
        displayInteger = displayInteger.replace("]", "");
        System.out.println(displayInteger);
        //linear search
        System.out.print("Enter a number to search: ");
        int key = sc.nextInt();
        boolean search = false;
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                System.out.println(key+" found");
                System.out.println("Linear Search - "+i+" loop(s)");
                search = true;
                break;
            }
        }
        if(!search)
            System.out.println("Sorry, the number is not found in this array.");
        //display sorted array
        System.out.println("Array in deceding order");
        for(int pass=1;pass<num.length;pass++){
            for(int i=0;i<num.length-1;i++){
                if(num[i]<num[i+1]){
                    int hold = num[i];
                    num[i] = num[i+1];
                    num[i+1] = hold; 
                }
            }
        }
        String displayInteger1 = Arrays.toString(num);
        displayInteger1 = displayInteger1.replace("[", "");
        displayInteger1 = displayInteger1.replace("]", "");
        System.out.println(displayInteger1);
        //binary search
        System.out.print("Enter a number to search: ");
        key = sc.nextInt();
        boolean search1 = false;
        int low = num.length - 1;
        int high = 0;
        int middle;
        while(low >= high){
            middle = (low + high)/2;
            if(key == num[middle]){
                System.out.println(key+" found");
                System.out.println("Binary Search - "+middle+" loop(s)");
                search1 = true;
                break;
            }
            else if(key<num[middle])
                high = middle + 1;
            else
                low = middle - 1;
        }
        if(!search1)
            System.out.println("Sorry, the number is not found in this array.");
    }
}
