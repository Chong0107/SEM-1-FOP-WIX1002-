
package week.pkg11;
// Problem 1:
// Design a Fruit class that consist of the following members:
// A field for the name of the fruit.
// A field for the type of the fruit.
// constructor that contains the name and type of the fruit.
// Accessor method for the name and type of the fruit.
// A method that displays the fruit's type and name.
public class Fruit {
    private String name, type;

    public Fruit(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
    
    public String toString(){
        return type+" "+name+"\n";
    }
}
