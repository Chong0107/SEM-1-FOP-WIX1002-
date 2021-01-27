
package samplequestion;

public class Exam2020Q5 {
    public static void main(String[] args) {
        Job job1 = new Job("J1",252,20);
        Job job2 = new Job("J2",108,10);
        Job job3 = new Job("J3",72,25);
        
        CloudPackage package1 = new CloudPackage("P2-15",4,15,1.24);
        CloudPackage package2 = new CloudPackage("P2-30",6,30,2.11);
        CloudPackage package3 = new CloudPackage("P5-20",4,20,1.38);
        CloudPackage package4 = new CloudPackage("P6-20",6,20,1.88);
        
        Job[]jobList = {job1,job2,job3};
        CloudPackage[]packageList = {package1,package2,package3,package4};
        
        double totalCost = 0;
        //check each job
        for(int i=0;i<jobList.length;i++){
            //to find out which package can give the cheapest cost and index
            //minIndex can used to check whether got which memory can execute the package
            double minCost = Double.MAX_VALUE;
            int minIndex = -1;
            //check which package is the most suitable for the job
            for(int j=0;j<packageList.length;j++){
                //check which package can help on finishing the job (memory can execute the package)
                if(packageList[j].check(jobList[i])){
                    //if got suitable package, then it will check the cost
                    //find which package can give the cheapest price
                    if(packageList[j].totalCost(jobList[i])<=minCost){
                        minCost = packageList[j].totalCost(jobList[i]);
                        minIndex = j;
                    }
                }
            }
            
            System.out.println(jobList[i].toString());
            //after checking each of the package, now checking for minIndex
            //if didn't got any suitable memory to execute the package, 
            //then it will display the message "No valid package."
            if(minIndex == -1)
                System.out.println("No valid package.");
            else{
                //take the lowest cost for that package and display it when minIndex is true
                System.out.println(packageList[minIndex].toString());
            }
            //calculation for the total of all package prices
            totalCost += minCost;
        }
        System.out.println("Total Cost: "+totalCost);
        System.out.println();
    }
}
