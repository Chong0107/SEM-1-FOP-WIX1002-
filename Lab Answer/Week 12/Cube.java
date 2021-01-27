
package week.pkg12;

public class Cube implements Number{
    private int num;

    public Cube(int num) {
        this.num = num;
    }
    
    public int getSpecial(){
        return (int)Math.pow(num,3);
    }
    
    public String toString(){
        return "The cube number is "+getSpecial();
    }
}
