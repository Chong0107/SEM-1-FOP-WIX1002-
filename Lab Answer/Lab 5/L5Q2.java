package com.company;

//import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class L5Q2 {
    public static void main(String[] args) {
        Random sc = new Random();
        /*ArrayList<Integer> num = new ArrayList<>();
        int count = 0;
        System.out.print("10 non-duplicate random integers within the range from 0 to 20: ");
        while(count<10){
            int random = sc.nextInt(21);
            if(!num.contains(random)) {
                num.add(random);
                count++;
            }
        }
        System.out.print(num);*/
        int [] intArr = new int[10];
        boolean [] dupChecker = new boolean[21];
        for(int i=0; i<10; i++){
            int temp = sc.nextInt(21);
            if(dupChecker[temp]){
                i--;
                continue;
            }
            dupChecker[temp]=true;
            intArr[i]=temp;
        }
        System.out.println("10 non-duplicate random integers within the range from 0 to 20: ");
        String listDisplay = Arrays.toString(intArr);
        listDisplay = listDisplay.replace("["," ");
        listDisplay = listDisplay.replace("]"," ");
        System.out.println(listDisplay);
    }
}
