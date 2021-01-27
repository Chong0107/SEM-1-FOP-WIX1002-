
package week.pkg11;

public class L9Q1 {
    public static void main(String[] args) {
        Rectangle shape1 = new Rectangle();
        shape1.setWidthAndLength();
        shape1.computePerimeter();
        shape1.computeArea();
        shape1.display();
        
        System.out.println("\n");
        
        Square shape2 = new Square();
        shape2.setLength();
        shape2.computePerimeter();
        shape2.computeArea();
        shape2.display();
        
        System.out.println("\n");
        
        Circle shape3 = new Circle();
        shape3.setDiameter();
        shape3.computePerimeter();
        shape3.computeArea();
        shape3.display();
        
        System.out.println("\n");
    }
}
