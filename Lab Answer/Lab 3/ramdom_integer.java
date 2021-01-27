package com.company;

import java.util.*;

public class ramdom_integer {
    public static void main(String[] args) {
        Random sc = new Random();
        int num,max=5;
        num = sc.nextInt(max+1);
        if(num == 1)
            System.out.println(num+" is one.");
        else if(num == 2)
            System.out.println(num+" is two.");
        else if(num == 3)
            System.out.println(num+" is three.");
        else if(num == 4)
            System.out.println(num+" is four.");
        else if(num == 5)
            System.out.println(num+" is five.");
        else
            System.out.println("The number is invalid.");
    }
}
