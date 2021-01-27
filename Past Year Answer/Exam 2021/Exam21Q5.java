package com.company;

import java.util.Scanner;

public class Exam21Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] num = new double[3];

        while (true) {
            boolean checkAns = true;
            System.out.print("Enter 3 numbers [1-9] : ");
            String[] input = sc.nextLine().split(" ");
            int j = 0;

            for (int i = 0; i < num.length; i++)
                num[i] = Integer.parseInt(input[i]);


            if (num[0] + num[1] + num[2] == 18) {
                System.out.printf("%d + %d + %d = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] + num[1] - num[2] == 18) {
                System.out.printf("%d + %d - %d = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if ((num[0] + num[1]) * num[2] == 18) {
                System.out.printf("(%d + %d) * %d = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] + num[1] * num[2] == 18) {
                System.out.printf("(%f + %f) * %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if ((num[0] + num[1]) / num[2] == 18) {
                System.out.printf("(%f + %f) /  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] + num[1] / num[2] == 18) {
                System.out.printf("%f + %f /  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] - num[1] + num[2] == 18) {
                System.out.printf("%f - %f + %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if ((num[0] - num[1]) * num[2] == 18) {
                System.out.printf("(%f - %f) * %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] - num[1] * num[2] == 18) {
                System.out.printf("(%f - %f) * %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if ((num[0] - num[1]) / num[2] == 18) {
                System.out.printf("(%f - %f) /  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] - num[1] / num[2] == 18) {
                System.out.printf("%f - %f /  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] * num[1] + num[2] == 18) {
                System.out.printf("%f * %f +  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }
            else if (num[0] * num[1] - num[2] == 18) {
                System.out.printf("%f * %f - %f = 18\n", num[0], num[1], num[2]);
                j++;
            }
            else if (num[0] * num[1] * num[2] == 18) {
                System.out.printf("%f * %f * %f = 18\n", num[0], num[1], num[2]);
                j++;
            }
            else if (num[0] * num[1] / num[2] == 18) {
                System.out.printf("%f * %f / %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] * (num[1] + num[2]) == 18) {
                System.out.printf("%f * (%f + %f) = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] * (num[1] - num[2]) == 18) {
                System.out.printf("%f * (%f - %f) = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] / num[1] + num[2] == 18) {
                System.out.printf("%f / %f +  %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] / num[1] - num[2] == 18) {
                System.out.printf("%f / %f - %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] / num[1] * num[2] == 18) {
                System.out.printf("%f / %f * %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] / num[1] / num[2] == 18) {
                System.out.printf("%f / %f / %f = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else if (num[0] / (num[1] / num[2]) == 18) {
                System.out.printf("%f / (%f / %f) = 18\n", num[0], num[1], num[2]);
                j++;
            }

            else {
                System.out.printf("%f / (%f / %f) = 18\n", num[0], num[1], num[2]);
                j++;
            }

            if (j == 0) {
                System.out.println("No solution");
            }
        }
    }
}
