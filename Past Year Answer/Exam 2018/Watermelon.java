public class Watermelon extends Fruit{
    private double weight;

    public Watermelon(String name, String type, double weight) {
        super(name, type);
        this.weight = weight;
    }

    public double totalPrice(){
        switch (type){
            case "Local":
                if(weight<2)
                    return  2.25 * weight;
                else if(weight>=2 && weight<=5)
                    return 1.95 * weight;
                else if(weight>5)
                    return 1.65 * weight;
                else
                    return 0;
            case "Imported":
                if(weight<2)
                    return 3.75 * weight;
                else if(weight>=2 && weight<=5)
                    return 3.45 * weight;
                else if(weight>5)
                    return 3.15 * weight;
                else
                    return 0;
        }
        return 0;
    }

    public String toString(){
        String display;
        display = type+" "+ name + " - "+weight+"kg = RM"+totalPrice();
        return display;
    }
}
