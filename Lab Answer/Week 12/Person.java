
package week.pkg12;

public class Person implements Comparable<Person>{
    String name;

    public Person(String a) {
        name = a;
    }

    public String getName() {
        return name;
    }
    
    public void display(){
         System.out.println("The name is "+name);
    }
    
    public int compareTo(Person o){
        return this.name.compareTo(o.getName());
    }
    
    public String toString(){
        return name;
    }
}
