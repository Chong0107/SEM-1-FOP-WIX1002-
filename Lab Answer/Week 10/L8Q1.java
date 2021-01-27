
package week.pkg10;

public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        a.showAll();
        a.showMax();
        a.showMin();
        a.showAvg();
        a.showEven();
        a.showPrime();
        a.showSquare();
        System.out.println("\n");
        
        Number b = new Number(5);
        b.showAll();
        b.showMax();
        b.showMin();
        b.showAvg();
        b.showEven();
        b.showPrime();
        b.showSquare();
        System.out.println("\n");
        
        Number c = new Number(4,50);
        c.showAll();
        c.showMax();
        c.showMin();
        c.showAvg();
        c.showEven();
        c.showPrime();
        c.showSquare();
        System.out.println("\n");
    }
}
