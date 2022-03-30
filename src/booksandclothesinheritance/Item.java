/*
 * This is the SuperClass for this project
 * 
 */
package booksandclothesinheritance;

public class Item {
    // Protected instance variables can be accessed by child class
    protected double price;
    protected int inStock;
    
    // Constructor
    Item () {}
    
    // Getters
    public double getPrice()   { return price; }
    public    int getInStock() { return inStock; }
    
    // Setters
    public double setPrice(double price) {
        this.price = price;
        return this.price;
    }   // End of setPrice
    
    public int setInStock(int inStock) {
        this.inStock = inStock;
        return this.inStock;
    }   // End of setInStock
    
}   // End of class
