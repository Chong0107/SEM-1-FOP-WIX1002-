
package week.pkg12;

public class FixedAccount implements Interest{
    double balance, interest, interestRate;

    public FixedAccount(double a) {
         balance = a;
         interestRate = 0.3 / 12;
    }

    @Override
    public double computeInterest() {
         interest = balance * interestRate;
         return interest;
    }
}
