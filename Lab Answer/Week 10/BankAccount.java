
package week.pkg10;

public class BankAccount {
    private String name;
    private int balance;
    private String IC;

    public BankAccount(String name, int balance, String IC) {
        this.name = name;
        this.balance = balance;
        this.IC = IC;
    }

    public void deposite(int a){
        System.out.println("Deposite: "+a);
        balance += a;
    }
    
    public void withdraw(int a){
        System.out.println("Withdraw: "+a);
        balance -= a;
    }
    
    public void display(){
        System.out.println("The balance of the amount is RM"+balance);
    }
    
    public void showAll(){
        System.out.println("Name: "+this.name);
        System.out.println("IC: "+this.IC);
    }
}
