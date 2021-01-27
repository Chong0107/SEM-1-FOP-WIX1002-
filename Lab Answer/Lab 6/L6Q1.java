package com.company;

public class L6Q1 {
    public static void main(String[] args) {
        System.out.print("First 20 Triangular Number(s): ");
        //isTriangularNumber();
        for(int i=1;i<=20;i++)
            System.out.print(displayTriNum(i)+" ");
    }
   /* public static void isTriangularNumber(){
        int k=1;
        int j=1;
        for(int i=1;i<=20;i++){
            System.out.print(k+" ");
            j+=1;
            k+=j;
        }
    }*/
    public static int displayTriNum(int input){
        int num = 0;
        for(int i=1;i<=input;i++){
            num += i;
        }
        return num;
    }
}
