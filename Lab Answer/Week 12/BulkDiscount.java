
package week.pkg12;

public class BulkDiscount extends DiscountPolicy{
    int minimum;
    public BulkDiscount(int a, double b){
        minimum = a;
        discountRate = b;
    }
    
    @Override
    public double computeDiscount(int count, double itemCost){
        if(count>minimum)
            discount = itemCost * discountRate;
        else
            discount = 0;
        return discount;
    }
    
}
