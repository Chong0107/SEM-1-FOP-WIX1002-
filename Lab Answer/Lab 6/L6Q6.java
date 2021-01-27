package com.company;

import static java.lang.System.*;

public class L6Q6 {
    public static void main(String[] args) {
        out.println("First 20 palindromic prime number: ");
        for (int i = 0; i < 10000 ; i++) {
            if (getPalindromic(i)) {
                System.out.print(i + " ");
                }
            }
        out.println("\nFirst 20 emiry prime number: ");
        for (int i = 0; i < 400; i++) {
            if (getEmirp(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean getPalindromic(int num){
        int temp,rev,i;
        int s=0;
        int c=0;
        boolean palindromic = false;
        temp = num;
        for(i=1;i<=temp;i++){   // identify prime number
            if(temp % i == 0 )
                c++;
        }
        while(num>0){          // reverse the prime number
            rev = num % 10;
            s = s * 10 + rev;
            num /= 10;
        }
        if(temp == s && c == 2)
            palindromic = true;
        return palindromic;
    }
    public static boolean getEmirp(int n){
        int reverse;
        int c = 0;
        int d = 0;
        int s = 0;
        boolean emirp =false;
        int temp;
        temp = n;
        while(n!=0){    // reverse prime number
            reverse = n % 10;
            s = s * 10 + reverse;
            n /= 10;
        }
        if(temp!=s){  // identify reverse prime number
            for(int i=1;i<=s;i++){
                if(s % i == 0){
                    c++;
                }
            }
        }
        for(int i=1;i<=temp;i++){  // identify original prime number
            if(temp % i == 0){
                d++;
            }
        }
        if(c == 2 && d == 2){
            emirp = true;
        }
        return emirp;
    }
}
