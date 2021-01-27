package com.company;


import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
    /*    Scanner sc = new Scanner(in);
        int a,b;
        out.print("Enter width and height of rectangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        out.println("The perimeter of rectangle: "+perimeterRectangle(a,b));
    }
    public static int perimeterRectangle(int width, int height){
        return(width+height)*2;
    }*/
    /*    Scanner sc = new Scanner(in);
        out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        out.printf("The perimeter of circle: %.2f",perimeterCircle(r));
    }
    public static double perimeterCircle(double radius){
        return(2*(Math.PI)*radius);
    }*/
    /*    Random r = new Random();
        int [] num = new int[3];
        for(int i=0;i< num.length;i++){
            num[i] = r.nextInt(101);
        }
        descending(num);
    }
    public static void descending(int [] num){
        for ( int pass = 1; pass < num.length ; pass++ ) {
            for (int i = 0; i < num.length - 1; i++) {
                if (num[i] < num[i + 1]) {
                    int hold = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = hold;
                }
            }
        }
        String listDisplay = Arrays.toString(num);
        listDisplay = listDisplay.replace("[", "");
        listDisplay = listDisplay.replace("]", "");
        out.println(listDisplay); */

        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter a number: ");
        x = sc.nextInt();
        squareCheck(x);
    }
    //public static boolean check(int x){
        //double sr = Math.sqrt(x);
        //return (sr - Math.floor(sr) == 0);
        /* Math.floor() returns closest integer value, for
         * example Math.floor of 984.1 is 984, so if the value
         * of sq is non integer then the below expression would
         * be non-zero.
         */
    //}
    public static void squareCheck(int x){
        double sr = Math.sqrt(x);
        if(sr - Math.floor(sr) == 0)
            System.out.println(x+" is a perfect square.");
        else
            System.out.println(x+" is not a perfect square.");
    }
}
