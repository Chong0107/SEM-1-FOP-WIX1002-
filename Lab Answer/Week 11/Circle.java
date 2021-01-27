
package week.pkg11;

public class Circle extends Shape{
    private double diameter;
    
    public Circle(){
        super("Circle",0,0);
    }
    
    public void setDiameter(){
        System.out.print("Diameter of circle (m): ");
        diameter = sc.nextDouble();
    }
    
    public void computePerimeter(){
        setPerimeter(Math.PI * (diameter/2));
    }
    
    public void computeArea(){
        setArea(Math.PI * Math.pow((diameter/2),2));
    }
}
