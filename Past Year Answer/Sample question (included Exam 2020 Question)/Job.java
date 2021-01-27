
package samplequestion;

public class Job{
    private String nameOfJob;
    private int numberOftask;
    private int memory;

    public String getNameOfJob() {
        return nameOfJob;
    }

    public int getNumberOftask() {
        return numberOftask;
    }

    public int getMemory() {
        return memory;
    }

    public Job(String nameOfJob, int numberOftask, int memory) {
        this.nameOfJob = nameOfJob;
        this.numberOftask = numberOftask;
        this.memory = memory;
    }
    
    public String toString(){
        String display;
        display = "Job Name: "+nameOfJob+" Memory = "+memory+"GB";
        display += " Number of Task = "+numberOftask;
        return display;
    }
}
