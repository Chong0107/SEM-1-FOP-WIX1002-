import java.util.Scanner;

public class Exam19S2Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter customer ID: ");
        String customerID = sc.nextLine();
        System.out.print("Enter quantity ordered: ");
        int unitQuantity = sc.nextInt();
        System.out.print("Enter price per unit: ");
        double unitPrice = sc.nextDouble();

        Order customer1 = new Order(customerName,customerID,unitQuantity,unitPrice);
        System.out.println(customer1.toString());

        Order customer2 = new ShippedOrder("joe","123",10,5);
        System.out.println(customer2.toString());
    }
}
