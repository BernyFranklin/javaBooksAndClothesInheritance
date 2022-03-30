/*
 * This is a subclass of class Item
 * 
 */
package booksandclothesinheritance;

// Start of class Book
public class Book extends Item{
    private static final double MAX_BOOK_PRICE = 100.00;
    private String title;
    private String author;
    private int date;
    // Static variable is shared by all objects
    private static int bookCount = 0;
    
    // Default constructor
    Book () {
        // Keeps track of the number of books
        bookCount++; 
    };   // End of Default
    
    // Constructor with 5 arguments
    Book (String title, String author, int date, double price, int inStock) {
        setTitle(title);
        setAuthor(author);
        setDate(date);
        setPrice(price);       // Code in SuperClass
        setInStock(inStock);   // Code in SuperClass
        
        bookCount++;           // Keep track of number of books
    }   // End of 5 ARG constructor
    
    // Getters and Setters //
    
    // Getters
    public String getTitle()         { return title; }
    public String getAuthor()        { return author; }
    public    int getDate()          { return date; }
    public static int getBookCount() { return bookCount; }
    // Setters
    public String setTitle(String t)  { title = t; return title; }
    public String setAuthor(String a) { author = a; return author; }
    public int    setDate (int d)     { date = d; return date; }
    
    @Override   // Overrides setPrice in SuperClass
    public double setPrice(double price) {
        // If Negative
        if (price < 0) {
            this.price = 0.00;
            System.out.println ("Negative price not allowed");
        }
        // If too high
        else if (price > MAX_BOOK_PRICE) {
            this.price = MAX_BOOK_PRICE;
            System.out.println ("Attempted to set price too high");
        }
        // If valid
        else
            this.price = price;
        
        // Return new price
        return this.price
    }   // End of setPrice
    
    @Override   // Overrides toString in SuperClass
    public String toString() {
        return String.format ("%6.2f %s, by %s", price, title, author);
    }   // End of toString
    
}   // End of class
