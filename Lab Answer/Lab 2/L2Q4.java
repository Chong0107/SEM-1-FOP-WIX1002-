/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;
public class L2Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int second,hours,minutes,second2;
        System.out.print("Enter the number of seconds : ");
        second = sc.nextInt();
        hours = second / 3600;
        minutes = (second % 3600) / 60;
        second2 = (second % 3600) % 60;
        System.out.println(second+" seconds is "+hours+" hours "+minutes+" minutes "+second2+" seconds.");
    }
}
