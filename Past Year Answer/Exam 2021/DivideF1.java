package com.company;

public class DivideF1 extends Eleven{

    public DivideF1(String filename) {
        super(filename);
    }

    public String divide() {
        StringBuilder string = new StringBuilder();
        string.append("Divisibility Rule (Formula 1)\n");

        for (int i = 0; i < array.length; i++) {

            int current = array[i];
            int[] evenNum;
            int[] oddNum;
            if (String.valueOf(current).length() % 2 == 0) {
                evenNum = new int[String.valueOf(current).length() / 2];
                oddNum = new int[String.valueOf(current).length() / 2];
            } else {
                evenNum = new int[String.valueOf(current).length() / 2 + 1];
                oddNum = new int[String.valueOf(current).length() / 2];
            }


            int n = current;
            int evenTotal = 0, oddTotal = 0;
            int even = 0;
            int odd = 0;
            int c = 0;

            while (n != 0) {
                if (c % 2 == 0)
                    evenNum[even++] = n % 10;
                else
                    oddNum[odd++] = n % 10;
                n /= 10;
                c++;
            }

            for (int j : evenNum) {
                evenTotal += j;
            }

            for (int j : oddNum) {
                oddTotal += j;
            }

            int different = Math.abs(evenTotal - oddTotal);
            int result = different % 11;

            string.append(current + " : " + "|x| = | (");

            for (int j = 0; j < evenNum.length; j++) {
                if (j == evenNum.length - 1) {
                    string.append(evenNum[j]);
                } else {
                    string.append(evenNum[j] + " + ");
                }
            }
            string.append(") - (");

            for (int j = 0; j < oddNum.length; j++) {
                if (j == oddNum.length - 1) {
                    string.append(oddNum[j]);
                } else {
                    string.append(oddNum[j] + " + ");
                }
            }
            string.append(") | = " + different + "\n");
            if (result == 0) {
                string.append(different + " modulus 11 = " + result + ", " + current + " is divisible by 11\n\n");
            } else {
                string.append(different + " modulus 11 = " + result + ", " + current + " is not divisible by 11\n\n");
            }
        }
        return string.toString();
    }
}
