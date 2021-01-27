public class Apple extends Fruit{
    private int quantity;

    public Apple(String name, String type, int quantity) {
        super(name, type);
        this.quantity = quantity;
    }

    public double totalPrice(){
        if(type.equalsIgnoreCase("Green"))
            return quantity * 1.2;
        else if(type.equalsIgnoreCase("Red"))
            return quantity * 1.8;
        else
            return 0;
    }

    public String toString() {
        return  type+" "+ name + " - "+quantity+" = RM"+totalPrice();
    }
}
