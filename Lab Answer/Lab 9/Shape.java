public class Shape {
    protected String name;
    protected double perimeter, area;

    public Shape() {
        this.name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display(){
        System.out.printf("%s has perimeter of %.2f cm and area of %.2f cm.",this.name,this.perimeter,this.area);
    }
}
