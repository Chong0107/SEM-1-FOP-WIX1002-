package com.company;
import java.util.Scanner;
public class MathOperation{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        char operand;
        String Str;
        System.out.print("Enter two integer numbers = ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter the operand = ");
        Str = sc.next();
        operand = Str.charAt(0);

        if(operand == '+')
            System.out.println(a+"+"+b+"="+(a+b));
        else if(operand == '-')
            System.out.println(a+"-"+b+"="+(a-b));
        else if(operand == '*')
            System.out.println(a+"*"+b+"="+(a*b));
        else if(operand == '/')
            System.out.println(a+"/"+b+"="+(a/b));
        else
            System.out.println("There is no method for this operand in this program.");
    }
}
