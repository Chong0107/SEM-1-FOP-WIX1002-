public class Square extends Shape{
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public Square(String name, double sideLength) {
        super(name);
        this.sideLength = sideLength;
    }

    public void acceptSideLength(double sideLength){
        this.sideLength = sideLength;
    }

    public void computePerimeter(){
        this.perimeter = 4 * sideLength;
    }

    public void computeArea(){
        this.area = Math.pow(sideLength,2);
    }
}
