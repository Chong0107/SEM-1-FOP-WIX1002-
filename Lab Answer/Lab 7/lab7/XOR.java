// Find the XOR of two 8-bit Binary Numbers
// array and method
package lab7;

import java.util.Scanner;

public class XOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first 8-bit binary number: ");
        String num1 = sc.nextLine();
        System.out.print("Enter the second 8-bit binary number: ");
        String num2 = sc.nextLine();
         
        boolean [] bit1 = new boolean [8];
        boolean [] bit2 = new boolean [8];
        
        for(int i=0;i<num1.length();i++){
            /*if(num1.charAt(i)== '1')
                bit1[i] = true;
            else
                bit1[i] = false;
            if(num2.charAt(i)== '1')
                bit2[i] = true;
            else
                bit2[i] = false;*/
            bit1[i] = num1.charAt(i)== '1';
            bit2[i] = num2.charAt(i)== '1';
        }
        System.out.println("The XOR of those two 8-bit binary numbers are "+Xor(bit1,bit2));
    }
    public static int Xor(boolean [] bit1, boolean [] bit2){
        StringBuilder binary = new StringBuilder();
        for(int i=0;i<bit1.length;i++){
            if(bit1[i]^bit2[i]) // " ^ " means XOR
               binary.append(1);
            else
               binary.append(0);
        }    
        String b = binary.toString();
        return Integer.parseInt(b,2);
    }
}
