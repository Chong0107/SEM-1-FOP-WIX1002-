/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author D.Chong
 */
public class L6Q6 {
    public static void main(String[] args) {
        System.out.print("Frist 20 palindromic number(s): ");
        for(int i=0,j=0;i<=Integer.MAX_VALUE && j<20;i++){
            if(getPalindromic(i)){
                System.out.print(i+" ");
                j++;
            }
        }
        System.out.print("\nFrist 20 emirp number(s): ");
        for(int i=0,j=0;i<=Integer.MAX_VALUE && j<20;i++){
            if(getEmirp(i)){
                System.out.print(i+" ");
                j++;
            }
        }
        System.out.println();
    }
    public static boolean getPalindromic(int num){
       int s = 0;
       int c = 0;
       int temp = num;
       boolean palindromic = false;
       for(int i=1;i<=temp;i++){
           if(temp % i == 0)
               c++;
       }
       while(num>0){
           int reverse = num % 10;
           s = s * 10 + reverse;
           num /= 10;
       }
       if(temp == s && c == 2){
           palindromic = true;
       }
       return palindromic;
    }
    public static boolean getEmirp(int n){
        int s = 0;
        int c = 0;
        int d = 0;
        int temp = n;
        boolean emirp = false;
        while(n!=0){
           int reverse = n % 10;
           s = s * 10 + reverse;
           n /= 10;
        }
        if(temp != s){
        for(int i=1;i<=s;i++){
           if(s % i == 0)
               c++;
            }
        }
        for(int i=1;i<=temp;i++){
           if(temp % i == 0)
               d++;
       }
        if(c == 2 && d == 2){
            emirp = true;
        }
        return emirp;
    }
}
