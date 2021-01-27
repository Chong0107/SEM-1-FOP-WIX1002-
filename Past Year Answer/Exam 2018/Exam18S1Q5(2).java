public class Exam18S1Q5 {
    public static void main(String[] args) {
        Fruit fruit1 = new Apple("Apple","Red",8);
        Fruit fruit2 = new Apple("Apple","Green",11);
        Fruit fruit3 = new Watermelon("Watermelon","Local",7.6);
        Fruit fruit4 = new Watermelon("Watermelon","Imported",4);
        fruit1.totalPrice();
        System.out.println(fruit1.toString());
        fruit2.totalPrice();
        System.out.println(fruit2.toString());
        fruit3.totalPrice();
        System.out.println(fruit3.toString());
        fruit4.totalPrice();
        System.out.println(fruit4.toString());
        System.out.println("The cheapest item is");
        if(fruit1.totalPrice()<fruit2.totalPrice() && fruit1.totalPrice()<fruit3.totalPrice() && fruit1.totalPrice()<fruit4.totalPrice())
            System.out.println(fruit1.toString());
        else if (fruit2.totalPrice()<fruit1.totalPrice() && fruit2.totalPrice()<fruit3.totalPrice() && fruit2.totalPrice()<fruit4.totalPrice())
            System.out.println(fruit2.toString());
        else if(fruit3.totalPrice()<fruit1.totalPrice() && fruit3.totalPrice()<fruit2.totalPrice() && fruit3.totalPrice()<fruit4.totalPrice())
            System.out.println(fruit3.toString());
        else
            System.out.println(fruit4.toString());
    }
}
