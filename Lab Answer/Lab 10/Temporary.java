public class Temporary extends ESS{
    private double hours;
    private String name;

    public Temporary(String name,double hours) {
        this.name = name;
        this.hours = hours;
    }

    public double getSalary(){
        return 15 * hours;
    }

    public String toString(){
        String sentence;
        sentence = "Employee name: "+name;
        sentence += String.format("\nSalary per month: RM%.2f",getSalary());
        return sentence;
    }
}
