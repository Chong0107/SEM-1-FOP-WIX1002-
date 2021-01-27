package com.company;
// if-else-if
import java.util.*;
import static java.lang.System.*;

public class l1q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int a,b,c,result;
        char operand1,operand2;
        out.print("Enter three integer number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        out.print("Enter two operand: ");
        operand1 = sc.next().charAt(0);
        operand2 = sc.next().charAt(0);
        if(operand1 == 'A' && operand2 == 'X'){
            result = a + b * c;
            out.println(a+" A "+b+" X "+c+" = "+result);
        }
        else if(operand1 == 'S' && operand2 == 'X'){
            result = a - b * c;
            out.println(a+" S "+b+" X "+c+" = "+result);
        }
        else if(operand1 == 'A' && operand2 == 'D'){
            result = a + b / c;
            out.println(a+" A "+b+" D "+c+" = "+result);
        }
        else if(operand1 == 'S' && operand2 == 'D'){
            result = a - b / c;
            out.println(a+" S "+b+" D "+c+" = "+result);
        }
        else if(operand1 == 'D' && operand2 == 'M'){
            result = (a / b) % c;
            out.println(a+" D "+b+" M "+c+" = "+result);
        }
        else if(operand1 == 'X' && operand2 == 'M'){
            result = a * b % c;
            out.println(a+" X "+b+" M "+c+" = "+result);
        }
        else if (operand1 == 'X' && operand2 == 'D'){
            result = a * b / c;
            out.println(a+" X "+b+" D "+c+" = "+result);
        }
        else if(operand1 == 'D' && operand2 == 'X'){
            result = a / b * c;
            out.println(a+" D "+b+" X "+c+" = "+result);
        }
        else if(operand1 == 'A' && operand2 == 'S'){
            result = a + b - c;
            out.println(a+" A "+b+" S "+c+" = "+result);
        }
        else if(operand1 == 'S' && operand2 == 'A'){
            result = a - b + c;
            out.println(a+" S "+b+" A "+c+" = "+result);
        }
        else if(operand1 == 'A' && operand2 == 'A'){
            result = a + b + c;
            out.println(a+" A "+b+"A  "+c+" = "+result);
        }
        else if(operand1 == 'S' && operand2 == 'S'){
            result = a - b - c;
            out.println(a+" S "+b+" S "+c+" = "+result);
        }
        else if(operand1 == 'X' && operand2 == 'X'){
            result = a * b * c;
            out.println(a+" X "+b+" X "+c+" = "+result);
        }
        else if(operand1 == 'D' && operand2 == 'D'){
            result = a / b / c;
            out.println(a+" D "+b+" D "+c+" = "+result);
        }
        else if(operand1 == 'M' && operand2 == 'M'){
            result = a % b % c;
            out.println(a+" M "+b+" M "+c+" = "+result);
        }
        else if(operand1 == 'A' && operand2 == 'M'){
            result = a + b % c;
            out.println(a+" A "+b+" M "+c+" = "+result);
        }
        else if(operand1 == 'S' && operand2 == 'M'){
            result = a - b % c;
            out.println(a+" S "+b+" M "+c+" = "+result);
        }
        else if(operand1 == 'M' && operand2 == 'A'){
            result = a % b + c;
            out.println(a+" M "+b+" A "+c+" = "+result);
        }
        else if(operand1 == 'M' && operand2 == 'S'){
            result = a % b - c;
            out.println(a+" M "+b+" S "+c+" = "+result);
        }
        else if(operand1 == 'M' && operand2 == 'X'){
            result = a % b * c;
            out.println(a+" M "+b+" X "+c+" = "+result);
        }
        else if(operand1 == 'M' && operand2 == 'D'){
            result = a % b / c;
            out.println(a+" M "+b+" D "+c+" = "+result);
        }
        else
            out.println("Sorry, the operations are invalid in this calculator.");
    }
}
