package com.company;

public class DivideF2 extends Eleven{

    public DivideF2(String filename) {
        super(filename);
    }

    public String divide() {

        StringBuilder string = new StringBuilder();

        for(int i = 0; i<array.length; i++){
            int x = 0;
            int y = array[i];
            for(int j =0; array[i] > 0; j++) {
                int digit = array[i] % 10;
                x = array[i] / 10 - digit;
                array[i] = array[i] / 10;
            }

            if(x%11 == 0)
                string.append(y + " is divisible by 11\n");
            else
                string.append(y + " is not divisible by 11\n");
        }
        return string.toString();
    }
}

