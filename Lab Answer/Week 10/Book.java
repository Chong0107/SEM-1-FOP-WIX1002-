
package week.pkg10;

public class Book {
    private String bookName, publisher;
    private int year;
    private double price;

    public Book() {
    }

    public Book(String bookName, String publisher, int year, double price) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.year = year;
        this.price = price;
    }
    
    public String toString(){
        String str;
        str = "Book = "+bookName+"("+year+")"+"\n";
        str = str+"Publisher = "+publisher+"\n";
        str = str+"Price = RM"+price+"\n";
        return str;
    }
}
