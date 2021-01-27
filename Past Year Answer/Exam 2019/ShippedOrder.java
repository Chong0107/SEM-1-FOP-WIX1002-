public class ShippedOrder extends Order{
    public double computeTotalPrice(){
        return quantityOrdered * unitPrice + 4;
    }

    public ShippedOrder(String customerName, String customerID, int quantityOrdered, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrdered = quantityOrdered;
        this.unitPrice = unitPrice;
    }

    public String toString(){
        String display;
        display = "\nShipped"+"\nOrder record "+"\nCustomer Name: "+customerName+"\nCustomer ID: "+customerID;
        display += "\nQuantity Ordered: "+quantityOrdered+"\nUnit Price: "+unitPrice+"\nTotal Price: "+computeTotalPrice();
        return display;
    }
}
