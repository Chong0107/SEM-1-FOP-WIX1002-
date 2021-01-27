public class Permanent extends ESS{
    private String category;
    private String name;

    public Permanent(String name,String category) {
        this.name = name;
        this.category = category;
    }


    public double getSalary() {
        if(category.equals("A"))
            return 4000;
        else if(category.equals("B"))
            return 3000;
        else if(category.equals("C"))
            return 2000;
        else
            return 0;
    }

    public String toString(){
        String sentence;
        sentence = "Employee name: "+name;
        sentence += String.format("\nSalary per month: RM%.2f",getSalary());
        return sentence;
    }
}
