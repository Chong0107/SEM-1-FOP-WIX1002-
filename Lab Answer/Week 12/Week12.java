
package week.pkg12;

import java.util.Arrays;

public class Week12 {
    /*
    public static void main(String[] args) {
        DiscountPolicy a = new BulkDiscount(3,0.1);
        DiscountPolicy b = new OtherDiscount();
        combineDiscount c = new combineDiscount(a,b);
        System.out.println(a.computeDiscount(7,100));
        System.out.println(b.computeDiscount(7,100));
        System.out.println(c.discount());
    }
    */
    /*
    public static void main(String[] args) {
        SavingAccount a = new SavingAccount(6000);
        FixedAccount b = new FixedAccount(6000);
        System.out.println("Saving Acount: RM"+a.computeInterest());
        System.out.println("Fixed Acount: RM"+b.computeInterest());
    }
    */
    /*
    public static void main(String[] args) {
        Person [] students = {new Person("D"),new Person("C"), new Person("B"), new Person("a")};
        Arrays.sort(students);
        for(Person student : students){
            System.out.print(student+" ");
        }
        System.out.println();
    }
    */
    /*
    public static void main(String[] args) {
        // abstract class
        Car a = new Car();
        Boat b = new Boat();
        testing(a);
        testing(b);
        
        Vehicle d = a;
        d.special();
        d = b;
        d.special();
    }
    public static void testing(Vehicle a){
        a.special();
        System.out.println("The number is "+a.getRandom(5));
    }
    
    public static void testing(Car a){
        a.special();
    }
    public static void testing(Boat a){
        a.special();
    }
    */
    
    public static void main(String[] args) {
        int x=5, y=10;
        Square s = new Square(x);
        Cube c = new Cube(x);
        info(s);
        info(c);
        Square t = new Square(y);
        info(t);
        if(s.compareTo(t)>0){
            System.out.println("Object s is bigger.");
        }else{
            System.out.println("Object t is bigger.");
        }
    }
    
    public static void info (Number a){
        System.out.println(a.toString());
    }
}
