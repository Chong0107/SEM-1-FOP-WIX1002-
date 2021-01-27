
package samplequestion;

public class Cloud {
    private String cloudPackage;
    protected double totalCost;

    public double getTotalCost() {
        return totalCost;
    }

    public Cloud(String cloudPackage) {
        this.cloudPackage = cloudPackage;
    }
    
    public String toString(){
        String display;
        display = "Cloud Package: "+cloudPackage;
        display += String.format(" Total Cost = %.2f",totalCost);
        return display;
    }
}
