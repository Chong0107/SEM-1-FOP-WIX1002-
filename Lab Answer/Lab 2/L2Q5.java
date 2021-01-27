/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Random;
public class L2Q5 {
    public static void main(String[] args) {
        Random sc = new Random();
        int num,sum = 0;
        num = sc.nextInt(1001);
        System.out.println("Number in the range of 0 - 1000 : "+num);
        while(num > 0){
            sum = sum + (num % 10);
            num = num / 10;
        }
        System.out.println("The sum of digit in the random number is "+sum+".");
    }
}
