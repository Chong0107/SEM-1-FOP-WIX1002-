public class Rectangle extends Shape{
    private double side,length;

    public Rectangle(double side, double length) {
        this.side = side;
        this.length = length;
    }

    public Rectangle(String name, double side, double length){
        super(name);
        this.length = length;
        this.side = side;
    }

    public void acceptSideLength(double side, double length){
        this.side = side;
        this.length = length;
    }

    public void computePerimeter(){
        this.perimeter = 2 * ( side + length );
    }

    public void computeArea(){
        this.area = side * length;
    }
}
