public class BankAccount {
    private final String name;
    private int balance;
    private final String IC;

    public BankAccount(String name, String IC, int balance) {
        this.name = name;
        this.IC = IC;
        this.balance = balance;
    }

    public void deposit(int a){
        System.out.println("Deposit: RM"+a);
        balance += a;
    }

    public void withDraw(int a){
        System.out.println("Withdraw: RM"+a);
        balance -= a;
    }

    public void displayBalance(){
        System.out.println("The balance of the amount is RM"+balance);
    }

    public void showAll(){
        System.out.println("Name: "+name);
        System.out.println("IC: "+IC);
    }
}
