
package week.pkg11;
/*
Design a class PartTimeStaff that extends the Staff class. 
The PartTimeStaff class has the following members:
 A field for the number of working hours (integer type).
 A constructor with arguments.
 A getSalary method that computes salary based on RM40 per hour.
 A toString method that displays the staff’s working hours and salary.
*/
public class PartTimeStaff extends Staff{
    private int hours;

    public PartTimeStaff(String name,  String IC, int hours) {
        super(name, IC);
        this.hours = hours;
    }
    
    public int getSalary(){
        return 40 * hours;
    }
    
    public String toString(){
        return super.toString()+hours+" hour(s): RM"+getSalary()+"\n";
    }
}
