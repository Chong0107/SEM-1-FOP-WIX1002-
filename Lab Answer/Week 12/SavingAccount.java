
package week.pkg12;

public class SavingAccount implements Interest{
    double balance, interest, interestRate;
    public SavingAccount(double a){
        balance = a;
        interestRate = 0.005 / 12;
    }

    @Override
    public double computeInterest() {
        interest = balance * interestRate;
        return interest;
    }
}
