
package week.pkg12;

public class OtherDiscount extends DiscountPolicy{
    @Override
    public double computeDiscount(int count, double itemCost){
        if(count == 3 || count == 4 || count == 5)
            discountRate = 0.1;
        else if(count == 6 || count == 7 || count == 8)
            discountRate = 0.2;
        else if(count >= 8)
            discountRate = 0.3;
        else
            discountRate = 0;
        discount = itemCost * discountRate;
        return discount;
    }
}
