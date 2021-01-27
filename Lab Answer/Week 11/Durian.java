
package week.pkg11;
// Design a Durian class that extends the Fruit class. 
// A field for the weight of the durian in kilogram.
// A constructor
// A totalPrice method that returns the total price of the durian purchased.
// The price of the D24 durian is RM24 per kilogram
// The price of the Udang Merah durian is RM32 per kilogram
// A display method that displays the weight and total price of the durian purchased.
public class Durian extends Fruit{
    private double weight;

    public Durian(String type, double weight) {
        super("Durian", type);
        this.weight = weight;
    }
    
    public double totalPrice(){
        double price = 0;
        if(getType().equals("D24")){
            price = 24 * weight;
        }
        else if(getType().equals("Udang Merah")){
            price = 32 * weight;
        }
        else
            price = 0;
        return price;
    }
    
    public String toString(){
        return String.format(super.toString()+weight+" kg: RM%.2f",totalPrice());
    }
}
