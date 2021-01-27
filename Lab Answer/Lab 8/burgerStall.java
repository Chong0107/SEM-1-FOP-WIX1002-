public class burgerStall {
    private final String ID;
    private int numOfBurger = 0;
    private static int sumOfBurger = 0;

    public burgerStall(String ID) {
        this.ID = ID;
    }

    public void sold(int a){
        numOfBurger += a;
        sumOfBurger += a;
    }

    public void display(){
        System.out.println("The number of burger sold by stall "+this.ID+" is "+numOfBurger);
    }

    public static void  displaySum(){
        System.out.println("The total number of burger sold by all stall(s) are "+sumOfBurger);
    }
}
