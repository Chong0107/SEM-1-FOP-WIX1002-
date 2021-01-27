package com.company;

public class PermanentStaff extends Staff{
    private final String grade;

    public PermanentStaff(String name, String IC, String grade) {
        super(name, IC);
        this.grade = grade;
    }

    public int getSalary(){
        if(grade.equals("EM01"))
            return 7000;
        else if(grade.equals("EM02"))
            return 5000;
        else if(grade.equals("EM03"))
            return 3000;
        else if(grade.equals("EM04"))
            return 1000;
        else
            return 0;
    }

    public String toString(){
        String display;
        display = super.toString() + "\nGrade: "+grade+"\nSalary: RM"+getSalary();
        return display;
    }
}
