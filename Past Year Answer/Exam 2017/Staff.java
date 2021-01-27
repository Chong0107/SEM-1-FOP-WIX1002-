package com.company;

public class Staff {
    private final String name;
    private final String IC;

    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }

    public String toString(){
        String display;
        display = "Full Name: "+name+"\nIC: "+IC;
        return display;
    }
}
