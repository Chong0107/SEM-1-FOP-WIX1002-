package com.company;

import java.util.Scanner;

public class Exam20S1Q2 {
    public static void main(String[] args) {
        System.out.println("Enter Location 1");
        double lat1 = requestInput();
        double lon1 = requestInput();
        System.out.println("Enter Location 2");
        double lat2 = requestInput();
        double lon2 = requestInput();
        double distance = calculateDistance(Math.toRadians(lat1),Math.toRadians(lon1),Math.toRadians(lat2),Math.toRadians(lon2));
        System.out.printf("Location 1: %.6f Latitude, %.6f Longitude",lat1,lon1);
        System.out.printf("\nLocation 2: %.6f Latitude, %.6f Longitude",lat2,lon2);
        System.out.printf("\nDistance: %.2f KM",distance);
    }
    public static double requestInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Direction: [N,S,E,W]: ");
        char direction = sc.next().charAt(0);
        System.out.print("Enter Degree, Minute and Second: ");
        return getDecimalDegree(direction,sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
    }

    public static double getDecimalDegree(char direction,double degree,double minute,double second){
        double decimalDegree = degree + (minute * 60 + second) / 3600;
        if(direction == 'S' || direction =='W'){
            decimalDegree *= -1;
        }
        return decimalDegree;
    }

    public static double calculateDistance(double lat1,double lon1,double lat2,double lon2){
        double a = Math.pow(Math.sin((lat1 - lat2)/2),2)
                + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2))
                * Math.pow(Math.sin((lon1 - lon2)/2),2);
        double c = 2 * Math.atan2(Math.sqrt(a),Math.sqrt(1-a));
        return c * 6371;
    }
}
