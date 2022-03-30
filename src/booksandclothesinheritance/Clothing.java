/*
 * This is a subclass of the SuperClass Item
 * 
 */
package booksandclothesinheritance;

public class Clothing extends Item {
    // Instance Variables
    private String type;
    private String brand;
    private String color;
    
    // Getters
    public String getType()  { return type; }
    public String getBrand() { return brand; }
    public String getColor() { return color; }
    
    // Setters
    public String setType (String type) {
        this.type = type;
        return this.type;
    }   // End of setType
    
    public String setBrand (String brand) {
        this.brand = brand;
        return this.brand;
    }   // End of setBrand
    
    public String setColor (String color) {
        this.color = color;
        return this.color;
    }   // End of setColor
    
    // Constructors
    
    // Default Constructor
    Clothing() {}
    
    // Constructor with 3 ARGS
    Clothing (String type, String brand, String color) {
        setType(type);
        setBrand(brand);
        setColor(color);
    }   // End of Constructor with 3 ARGS
    
}   // End of class
