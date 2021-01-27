
package week.pkg12;

public class combineDiscount extends DiscountPolicy{
    double max;
    DiscountPolicy discount1, discount2;

    public combineDiscount(DiscountPolicy a, DiscountPolicy b) {
        discount1 = a;
        discount2 = b;
    }
    
    public double discount(){
        if(discount1.discount > discount2.discount)
            max = discount1.discount;
        else
            max = discount2.discount;
        return max;
    }

    @Override
    public double computeDiscount(int count, double itemCost) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
