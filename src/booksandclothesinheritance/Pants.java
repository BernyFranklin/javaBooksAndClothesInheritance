/*
 * This is a subclass of class clothing
 * 
 */

package booksandclothesinheritance;

public class Pants extends Clothing {
    //  Instance variables
    private String waist;
    private String length;
    // Static variable is shared by all objects
    private static int pantCount = 0;
    
    // Getters
    public String getWaist()  { return waist; }
    public String getLength() { return length; }
    
    // Setters
    public String setWaist(String waist) {
        this.waist = waist;
        return this.waist;
    }   // End of setWaist
    public String setLength(String length) {
        this.length = length;
        return this.length;
    }   // End of setLength
    
    // Constructors
    
    // Default constructor
    Pants() {
        // Keep track of number of pants
        pantCount++;
    }   // End of defualt constructor
    
    // Constructor with 7 ARGS
    Pants (String type, String brand, String waist, String length, 
            String color, double price, int inStock) {
        setType(type);         // Located in SuperClass
        setBrand(brand);       // Located in SuperClass
        setWaist(waist);
        setLength(length);   
        setColor(color);       // Located in SuperClass
        setPrice(price);       // Located in SuperClass
        setInStock(inStock);   // Located in SuperClass
        pantCount++;
    }   // End of constructor with 7 ARGS
    
    @Override
    public String toString() {
        return String.format ("%6.2f %s, by %s", getPrice(), getType(), 
                              getBrand());
    }   // End of toString
    
}   // End of class
