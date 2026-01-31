package Teaching;

public class Book {

    public double price;
    public int pages;

    public Book(double price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    public double applyDiscount(double percentage){
        return  price - (price * percentage/100);
    }
boolean isLongBook(){
        return pages>300;
}

    /*Create a class called "Book" with:

Attributes:
- title (String)
- author (String)
- price (double)

- pages (int)
- publisher (String)

Constructor:
- Initialize all attributes

Methods:
1. displayInfo() - print all book details
2. applyDiscount(double percentage) - reduce price by percentage
3. isLongBook() - return true if pages > 300, false otherwise

In main:
- Create 3 different book objects
- Display their information
- Apply discount to one book
- Check which books are "long books"*/

    //2. applyDiscount(double percentage) - reduce price by percentage

    //3. isLongBook() - return true if pages > 300, false otherwise



}
