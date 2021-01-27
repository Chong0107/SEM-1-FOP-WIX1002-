
package lab7;

import java.util.Scanner;

public class XOR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first 8-bit binary number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second 8-bit binary number: ");
        int num2 = sc.nextInt();
        System.out.println("The XOR of those two binary numbers is "+result(num1,num2));
    }
    // convert first binary number to decimal number
    public static int binaryToDecimal1(int a){
        int dec = 0;
        int base = 1;
        int temp = a;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            dec += digit * base;
            base *= 2;
        }
        return dec;
    }
    // convert second binary number to decimal number
    public static int binaryToDecimal2(int b){
        int dec = 0;
        int base = 1;
        int temp = b;
        while(temp > 0){
            int digit = temp % 10;
            temp /= 10;
            dec += digit * base;
            base *= 2;
        }
        return dec;
    }
    // find the XOR of those 2 binary numbers
    public static int result(int a, int b){
        return (binaryToDecimal1(a)^binaryToDecimal2(b));
    }
}
