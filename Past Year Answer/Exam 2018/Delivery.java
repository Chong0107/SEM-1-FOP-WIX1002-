package com.company;

public class Delivery {
    private final String sender;
    private final String recipient;
    private final double weight;

    public Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }

    public double totalCost(){
        double cost = 0;
        if(weight<=5)
            cost += weight * 2.8;
        else if(weight>5 && weight<=20)
            cost += 5 * 2.8 + (weight - 5) * 5.2;
        else if(weight>20 && weight<=50)
            cost += 5 * 2.8 + 15 * 5.2 + (weight - 20) * 7;
        else
            cost += 5 * 2.8 + 15 * 5.2 + 30 * 7 + (weight - 50) * 8.6;

        return cost;
    }

    public String toString(){
        String display;
        display = "From: "+sender+" To: "+recipient;
        display += "\nWeght of Package: RM"+weight;
        display += "\nShipping Cost: RM"+totalCost();
        return display;
    }
}
