
package week.pkg11;

public class Square extends Shape{
    private double length;
    
    public Square(){
        super("Square",0,0);
    }
    
    public void setLength(){
        System.out.print("Length of square (m): ");
        length = sc.nextDouble();
    }
    
    public void computePerimeter(){
        setPerimeter(4 * length);
    }
    
    public void computeArea(){
        setArea(Math.pow(length,2));
    }
}
