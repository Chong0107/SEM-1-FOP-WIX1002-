public class L8Q2 {
    public static void main(String[] args) {
        BankAccount sc = new BankAccount("CHONG JUN YI", "010701-04-0101",1000000);
        sc.showAll();
        sc.displayBalance();
        sc.deposit(500);
        sc.displayBalance();
        sc.withDraw(312);
        sc.displayBalance();
    }
}
