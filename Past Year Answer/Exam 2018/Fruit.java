public abstract class  Fruit {
    protected String name;
    protected String type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public abstract double totalPrice();

    public String toString(){
        String display;
        display = "Name: "+name+"\nType: "+type;
        return display;
    }
}
