public class L9Q1 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Rectangle 1",8,10);
        rectangle.computeArea();
        rectangle.computePerimeter();
        rectangle.display();

        System.out.println("\n");

        Square square = new Square("Square 1",10);
        square.computeArea();
        square.computePerimeter();
        square.display();

        System.out.println("\n");

        Circle circle = new Circle("Circle 1",10);
        circle.computeArea();
        circle.computePerimeter();
        circle.display();

        System.out.println("\n");
    }
}
