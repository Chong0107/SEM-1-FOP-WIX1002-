
package week.pkg10;
        
public class Fraction {
   private int numerator;
   private int denominator;

    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
     
    public void simplest(){
        int gcd = 1, max;
        if(denominator >= numerator)
            max = denominator;
        else
            max = numerator;
        for(int i=max;i>=2;i--){
            if(denominator % i == 0 && numerator % i == 0){
                gcd = i;
                break;
            }
        }
        denominator /= gcd;
        numerator /= gcd;
        
        System.out.println("The simplest fraction is "+numerator+"/"+denominator+" .");
    }
}
