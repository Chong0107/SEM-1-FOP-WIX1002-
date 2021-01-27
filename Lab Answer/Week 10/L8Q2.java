
package week.pkg10;

public class L8Q2 {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount("John",100000,"010701-04-0101");
        bank.showAll();
        bank.deposite(500);
        bank.display();
        bank.withdraw(214);
        bank.display();
    }
}
