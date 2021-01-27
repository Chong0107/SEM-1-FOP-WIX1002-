/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package l1q4.pkg2;

/**
 *
 * @author D.Chong
 */
public class L1Q42 {
    public static void main(String[] args) {
        String[]month = {"January",
                         "February",
                         "March",
                         "April",
                         "May",
                         "June"};
        int[] amount = {2500,
                        1600,
                        2000,
                        2700,
                        3200,
                        800};
        System.out.print(month[0] + "\t:\t");
        for(int i = 0; i < amount[0]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(month[1] + ":\t");
        for(int i = 0; i < amount[1]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(month[2] + "\t:\t");
        for(int i = 0; i < amount[2]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(month[3] + "\t:\t");
        for(int i = 0; i < amount[3]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(month[4] + "\t:\t");
        for(int i = 0; i < amount[4]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print(month[5] + "\t:\t");
        for(int i = 0; i < amount[5]/100; i++){
            System.out.print("*");
        }
        System.out.println("");
        
    } 
    
}
