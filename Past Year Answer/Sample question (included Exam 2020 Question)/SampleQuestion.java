
package samplequestion;

import java.util.Scanner;

public class SampleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1,num2,sum;
        System.out.print("Enter First Integer: ");
        num1 = sc.nextInt();
        System.out.print("Enter Scond Integer: ");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("The sum of "+num1+" and "+num2+" is "+sum);
    }
}
