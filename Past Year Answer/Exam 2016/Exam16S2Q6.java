public class Exam16S2Q6 {
    public static void main(String[] args) {
        FinancialRecord customer1 = new FinancialRecord(1234,10000,7.77);
        System.out.println("The information about financial record A is as follows: ");
        customer1.displayRecordInfo();
        System.out.println();
        System.out.println("The information about financial record B is as follows: ");
        FinancialRecord customer2 = new FinancialRecord(1001,20000,8.0);
        customer2.displayRecordInfo();
        System.out.println("The monthly interest rate is: "+customer2.getMonthlyInterestRate());
        customer2.deposit(1500);
        customer2.withdraw(500);
    }
}
