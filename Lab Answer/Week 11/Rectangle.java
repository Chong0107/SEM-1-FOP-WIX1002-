
package week.pkg11;

public class Rectangle extends Shape{
    private double width,length;
    
    public Rectangle(){
        super("Rectangle",0,0);
    }
    
    public void setWidthAndLength(){
        System.out.print("Width of rectangle (m):");
        width = sc.nextDouble();
        System.out.print("Length of rectangle (m):");
        length = sc.nextDouble();
    }
    
    public void computePerimeter(){
        setPerimeter(2*(width + length));
    }
    
    public void computeArea(){
        setArea(width * length);
    }
}
