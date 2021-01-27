package com.company;

public class PartTimeStaff extends Staff{
    private final int numberOfHours;

    public PartTimeStaff(String name, String IC, int numberOfHours) {
        super(name, IC);
        this.numberOfHours = numberOfHours;
    }

    public int getSalary(){
        return 40 * numberOfHours;
    }

    public String toString(){
        String display;
        display = super.toString()+"\nNumber of working hours: "+numberOfHours;
        display += "\nSalary: RM"+getSalary();
        return display;
    }
}
