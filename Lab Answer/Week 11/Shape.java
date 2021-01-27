
package week.pkg11;

import java.util.Scanner;

public class Shape {
    private String name;
    private double perimeter, area;
    
    public Scanner sc = new Scanner(System.in);

    public Shape(String name, double perimeter, double area) {
        this.name = name;
        this.perimeter = perimeter;
        this.area = area;
    }
    
    public void display(){
        System.out.println("Name: "+name);
        System.out.printf("Perimeter: %.2f m",perimeter);
        System.out.printf("\nArea: %.2f m",area);
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
    
}
