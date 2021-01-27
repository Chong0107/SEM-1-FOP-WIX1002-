public class Contract extends ESS{
    private double sales;
    private String name;

    public Contract(String name,double sales) {
        this.name = name;
        this.sales = sales;
    }

    public double getSalary(){
        return 500 + (sales * 0.5);
    }

    public String toString(){
        String sentence;
        sentence = "Employee name: "+name;
        sentence += String.format("\nSalary per month: RM%.2f",getSalary());
        return sentence;
    }
}
