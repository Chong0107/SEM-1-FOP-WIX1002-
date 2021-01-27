
package week.pkg12;

public abstract class DiscountPolicy {
    double discount, discountRate;
    public abstract double computeDiscount(int count, double itemCost);
}

