
package week.pkg10;
// create a new class 
// instance variable
// constuctor
// methods
public class Restaurant {
    // instance variable
    private String name, address;
    private int number;

    public Restaurant() {
        name = "";
        address = "";
        number = 0;
    }

    public Restaurant(String name, String address, int number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    
    //copy constructor
    public Restaurant(Restaurant a) {
        if(a != null){
        name = a.getName();
        address = a.getAddress();
        number = a.getNumber();
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getNumber() {
        return number;
    }
    
    // output method
    public String toString(){
        String str = "Restaurant: "+name+"\nAddress: "+address+"\n";
        str = str+"Number of Employee(s): "+number;
        return str;
    }
}
