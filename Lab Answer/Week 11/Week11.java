
package week.pkg11;

public class Week11 {

    public static void main(String[] args) {
        /*
        // Parent class - Father (name, houseaddress), Son(name)
        Son b = new Son("Ahmad","Petaling Jaya");
        System.out.println("Address: "+b.getAddress());
        // protected
        b.setCar("Toyota");
        System.out.println("Car: "+b.getCar());
        System.out.println(b.toString());
        */
        
        // Ahmad purchased the following items:
        // 23 green apple, 36 red apple and 4.6kg D24 durian and 3.2kg Udang Merah durian
        // display all items purchased and total price
        /*
        Apple app1 = new Apple("Green",23);
        Apple app2 = new Apple("Red",36);
        Durian app3 = new Durian("D24",4.6);
        Durian app4 = new Durian("Udang Merah",3.2);
        
        System.out.println(app1.toString());
        System.out.println(app2.toString());
        System.out.println(app3.toString());
        System.out.println(app4.toString());
        
        double total = app1.totalPrice()+app2.totalPrice()+app3.totalPrice()+app4.totalPrice();
        System.out.printf("Total price for all: RM%.2f\n",total);
        */
        
        PermanentStaff p1 = new PermanentStaff("Ahmad Hakim","010506-04-8899","EM02");
        PartTimeStaff p2 = new PartTimeStaff("Hon Jia Herng","010504-11-7845",18);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
