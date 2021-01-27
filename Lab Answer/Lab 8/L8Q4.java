public class L8Q4 {
    public static void main(String[] args) {
        Fraction fraction = new Fraction();
        fraction.setDenominator(6);
        fraction.setNumerator(2);
        System.out.println("The numerator is "+fraction.getNumerator());
        System.out.println("The denominator is "+fraction.getDenominator());
        fraction.displayFraction();
    }
}
