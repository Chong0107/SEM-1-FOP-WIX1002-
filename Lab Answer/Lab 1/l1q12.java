package com.company;

import java.util.Scanner;

public class l1q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //declare variables
        int a, b, c,result;
        String operand;
        //input value
        System.out.print("Enter three integer number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter two operand: ");
        operand = sc.nextLine();
        //requirement for process
        /* [X = *], [D = /], [M = %], [A = +], [S = -] */
        //display result
        switch (operand) {
            case "A A" : 
                result = a + b + c;
                System.out.println(a + "A" + b + "A" + c + "=" + result);

            case "S S" :
                result = a - b - c;
                System.out.println(a + "S" + b + "S" + c + "=" + result);

            case "X X" :
                result = a * b * c;
                System.out.println(a + "X" + b + "X" + c + "=" + result);

            case "D D" :
                result = a / b / c;
                System.out.println(a + "D" + b + "D" + c + "=" + result);

            case "M M" :
                result = a % b % c;
                System.out.println(a + "M" + b + "M" + c + "=" + result);

            case "A S" :
                result = a + b - c;
                System.out.println(a + "A" + b + "S" + c + "=" + result);

            case "S A" :
                result = a - b + c;
                System.out.println(a + "S" + b + "A" + c + "=" + result);

            case "X D" :
                result = a * b / c;
                System.out.println(a + "X" + b + "D" + c + "=" + result);

            case "D X" :
                result = a / b * c;
                System.out.println(a + "D" + b + "X" + c + "=" + result);

            case "A M" :
                result = a + b % c;
                System.out.println(a + "A" + b + "%" + c + "=" + result);

            case "S M" :
                result = a - b % c;
                System.out.println(a + "S" + b + "M" + c + "=" + result);

            case "X M" :
                result = a * b % c;
                System.out.println(a + "S" + b + "M" + c + "=" + result);

            case "D M" :
                result = a / b % c;
                System.out.println(a + "D" + b + "M" + c + "=" + result);

            case "A X" :
                result = a + b * c;
                System.out.println(a + "A" + b + "X" + c + "=" + result);

            case "S X" :
                result = a - b * c;
                System.out.println(a + "S" + b + "X" + c + "=" + result);

            case "A D" :
                result = a + b / c;
                System.out.println(a + "A" + b + "D" + c + "=" + result);

            case "S D" :
                result = a - b / c;
                System.out.println(a + "S" + b + "D" + c + "=" + result);

            case "M D" :
                result = a % b / c;
                System.out.println(a + "M" + b + "D" + c + "=" + result);

            case "M X" :
                result = a % b * c;
                System.out.println(a + "M" + b + "X" + c + "=" + result);

            case "M A" :
                result = a % b + c;
                System.out.println(a + "M" + b + "A" + c + "=" + result);

            case "M S" :
                result = a % b - c;
                System.out.println(a + "M" + b + "A" + c + "=" + result);

            default :
                System.out.println("These operands are invalid in this program. Please try again later.");
                System.exit(0);

        }
    }
}
