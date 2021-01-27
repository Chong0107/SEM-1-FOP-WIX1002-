
package week.pkg11;
/*
Design a PermanentStaff class that extends the Staff class. 
The PermanentStaff class has the following members:
 A field for the grade of the staff.
 A constructor with arguments.
 A getSalary method that computes salary based on the table below.
 A toString method that displays the staff’s grade and salary.
*/
public class PermanentStaff extends Staff{
    private String grade;

    public PermanentStaff(String name,  String IC, String grade) {
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
        return super.toString()+grade+": RM"+getSalary()+"\n";
    }
}
