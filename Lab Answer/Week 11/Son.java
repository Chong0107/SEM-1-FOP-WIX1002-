
package week.pkg11;
// derived class / sub class / child class
public class Son extends Father{
    private String name;

    public Son(String name, String address) {
        // call parent constructor
        super("Ali", address);
        this.name = name;
    }
    public void setCar(String a){
        car = a;
    }
    public String getCar(){
        return car;
    }
    public String toString(){
        return super.toString()+"Son Name: "+name+"\nAddress: "+getAddress()+"\nCar: "+car;
    }
}
