public class L8Q6 {
    public static void main(String[] args) {
        burgerStall stall1 = new burgerStall("WIX1003");
        burgerStall stall2 = new burgerStall("WIX1002");
        stall1.sold(100);
        stall2.sold(200);
        stall1.display();
        stall2.display();
        burgerStall.displaySum();
    }
}
