public class FinancialRecord {
    private int id;
    private double balance;
    private double annualInterestRate;

    public FinancialRecord() {
    }

    public FinancialRecord(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public void withdraw(double withdraw){
        System.out.println("Previous balance: RM"+balance);
        balance -= withdraw;
        System.out.println("Current balance after withdrawal of RM"+withdraw+" is: RM"+balance);
    }

    public void deposit(double deposit){
        System.out.println("Previous balance: RM"+balance);
        balance += deposit;
        System.out.println("Current balance after deposit of RM"+deposit+" is: RM"+balance);
    }

    public void displayRecordInfo(){
        System.out.println("Financial record id is: "+id);
        System.out.println("Financial record balance is: RM"+balance);
        System.out.println("Annual interest rate is: "+annualInterestRate);
    }
}
