
package week.pkg11;
/*
Design a Staff class that consists of the following members:
 A field for the name of the staff.
 A field for the IC of the staff.
 A constructor that contains all the above fields.
 A toString method that displays the staff’s name and IC.
*/
public class Staff {
    private String name, IC;

    public Staff(String name, String IC) {
        this.name = name;
        this.IC = IC;
    }
    
    public String toString(){
        return name+" "+IC+"\n";
    }
}
