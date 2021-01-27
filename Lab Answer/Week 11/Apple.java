
package week.pkg11;
// Design an apple class that extends the Fruit class
// A field for the quantity of the apple
// A constructor
// A totalPrice method that returns the total price of the apple purchased
// Green apple is RM9.80 (5 pcs) 
// Red apple is RM6.40 (5 pcs) 
// A method that displays the quantity and total price of the apple purchased.
public class Apple extends Fruit{
    private int quantity;

    public Apple(String type, int quantity) {
        super("Apple",type);
        this.quantity = quantity;
    }
    public double totalPrice(){
        double price = 0;
        if(getType().equals("Green")){
            price = 9.8 / 5 * quantity;
        }
        else if(getType().equals("Red")){
            price = 6.4 / 5 * quantity;
        }
        else
            price = 0;
        return price;
    }
    public String toString(){
        return String.format(super.toString()+quantity+"  : RM%.2f",totalPrice());
    }
}
