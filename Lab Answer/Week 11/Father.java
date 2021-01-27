
package week.pkg11;
// base class / parent class / super class
public class Father {
    private String name, address;
    protected String car;

    public Father() {
        name = "";
    }

    public Father(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public String toString(){
        return "Father Name: "+name+"\nAddress: "+address+"\nCar: "+car+"\n";
    }
}
