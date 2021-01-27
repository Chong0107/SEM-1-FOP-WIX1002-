
package samplequestion;

public class CloudPackage extends Cloud{
    private int numberOfCore;
    private int memory;
    private double pricePerHour;

    public CloudPackage(String cloudPackage,int numberOfCore, int memory, double pricePerHour ) {
        super(cloudPackage);
        this.numberOfCore = numberOfCore;
        this.memory = memory;
        this.pricePerHour = pricePerHour;
    }
    
    public boolean check(Job job){
        if(job.getMemory()>this.memory)
            return false;
        return true;
    }
    
    public double totalCost(Job job){
        totalCost = job.getNumberOftask() * pricePerHour / numberOfCore;
        return totalCost;
    }
}
