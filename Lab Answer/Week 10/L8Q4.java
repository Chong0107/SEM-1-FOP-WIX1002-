
package week.pkg10;

public class L8Q4 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.setNumerator(4);
        fraction.setDenominator(8);
        System.out.println("Numerator: "+fraction.getNumerator());
        System.out.println("Denominator: "+fraction.getDenominator());
        fraction.simplest();
        System.out.println();
    }
}
