package com.company;

public class Exam18S1Q5 {
    public static void main(String[] args) {
        Delivery customer1 = new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        Delivery customer2 = new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        Delivery customer3 = new SpecialDelivery("FSKTM, UM","FK, UM",32.5,true,false);
        Delivery customer4 = new SpecialDelivery("Ang","Liew",19,true,true);
        System.out.println(customer1.toString());
        System.out.println();
        System.out.println(customer2.toString());
        System.out.println();
        System.out.println(customer3.toString());
        System.out.println();
        System.out.println(customer4.toString());
        System.out.println();
        System.out.println("The total shipping cost is RM"+SpecialDelivery.getTotalCost());
    }
}
