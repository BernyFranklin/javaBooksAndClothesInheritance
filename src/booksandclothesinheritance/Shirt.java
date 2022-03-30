/*
 * This is a subclass of class Clothing
 * 
 */

package booksandclothesinheritance;

public class Shirt extends Clothing {
    // Instance variables
    private String size;
    // Static variable is shared by all objects
    private static int shirtCount = 0;
    
    // Getters
    public String getSize() { return size; }
    
    // Setters
    public String setSize( String size) {
        this.size = size;
        return this.size;
    }   // End of setSize
    
    // Constructors
    
    // Default Constructor
    Shirt() {
        // Keep track of number of shirts
        shirtCount++;
    }   // End of default Constructor
    
    // Constructor with 6 ARGS
    Shirt (String type, String brand, String size, 
            String color, double price, int inStock) {
        setType(type);         // Located in SuperClass
        setBrand(brand);       // Located in SuperClass
        setSize(size);
        setColor(color);       // Located in SuperClass
        setPrice(price);       // Located in SuperClass
        setInStock(inStock);   // Located in SuperClass
        shirtCount++;          // Keep track of number of shirts
        
    }   // End of constructor with 6 ARGS
    
    @Override
    public String toString() {
        return String.format ("%6.2f %s, by %s", getPrice(), getType(), getBrand());
    }   // End of toString
    
}   // End of class
