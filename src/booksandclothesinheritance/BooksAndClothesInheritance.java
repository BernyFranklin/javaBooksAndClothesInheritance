/*
 * booksAndClothesInheritance Version1.0
 * Frank Bernal
 * CIS 084 Java Programming
 * Input
 * Output
 * 29 Mar 2022
 */

package booksandclothesinheritance;


public class BooksAndClothesInheritance {
    // Define array of books
    private static final Book[] BOOK_LIST = {
        new Book("ULYSSES", "James Joyce", 1918, 32.95, 16),
        new Book("THE GREAT GATSBY", "F. Scott Fitzgerald", 1925, 13.95, 30),
        new Book("THE BRAVE NEW WORLD", "Aldous Huxley", 1931, 14.95, 28),
    };   // End of book array
    
    // Number of books
    private static final int BOOK_COUNT = BOOK_LIST.length;
    
    // Define array of shirts
    private static final Shirt[] SHIRT_LIST = {
        new Shirt("T-shirt", "Guess", "M", "Blue", 14.95, 23),
        new Shirt("Dress shirt", "Ralph Lauren", "L", "White", 39.95, 5),
        new Shirt("Blouse", "Versace", "S", "Yellow", 44.95, 6),
    };   // End of shirt array
    
    // Deifne array of pants
    private static final Pants[] PANT_LIST = {
        new Pants("Jeans", "Levi Strauss", "32", "30", "Blue", 39.95, 17),
        new Pants("Slacks", "Dockers", "32", "30", "Black", 59.95, 21),
        new Pants("Shorts", "Revtown", "32", "12", "Tan", 29.95, 14),
    };   // End of pants array
    
    
    // Start of main
    public static void main(String[] args) {
        // Creating objects from inside main
        Book myBook = new Book ("Dan the Programmer", "Dan McElroy", 
                                2018, 14.95, 10);
        Shirt myShirt = new Shirt ("T-Shirt", "Guess", "M", "Red", 14.95, 23);
        Pants myPants = new Pants ("Jorts", "Levi Strauss", "32", "12", "Blue",
                                    29.95, 10);
        
        // Display objects that were created in main
        System.out.println ("My first book is: " + myBook.getTitle());
        System.out.println ("My shirt selection is: " + myShirt.getType());
        System.out.println ("My pants selection are: " +myPants.getType());
        
        // Using a standard for statement to display all books in BOOK_LIST
        // Using i to index through the array
        System.out.println();   // Blank line
        System.out.println("Inventory");
        System.out.println("QTY    PRICE  ITEM");
        for (int i = 0; i < BOOK_COUNT; i++) {
            System.out.printf ("%3d  %7.2f  %-30.30s\n",
                    BOOK_LIST[i].getInStock(), BOOK_LIST[i].getPrice(), 
                    BOOK_LIST[i].getTitle());
        }   // End of for loop
        
        // Using enhanced for statement to display all shirts in shirt list
        // The variable s will refer to the current shirt as the loop
        // Steps through the array, one shirt at a time.
        for (Shirt s : SHIRT_LIST) {
            System.out.printf ("%3d  %7.2f  %-30.30s\n",
                    s.getInStock(), s.getPrice(), s.getType());
        }   // End of shirt loop
        
        // Using enhanced for statement to display all pants in pant list
        // The variable p will refer to the current pant as the loop
        // Steps through the array, one pant at a time
        for (Pants p: PANT_LIST) {
            System.out.printf ("%3d  %7.2f  %-30.30s\n",
                    p.getInStock(), p.getPrice(), p.getType());
        }   // End of pant loop
        
        // Display items in the arrays using the toString method
        System.out.println ("\nBooks in the array");
        for (Book b: BOOK_LIST)   { System.out.println(b); }
        
        System.out.println ("\nShirts in array");
        for (Shirt s: SHIRT_LIST) { System.out.println(s); }
        
        System.out.println ("\nPants in array");
        for (Pants p: PANT_LIST)  { System.out.println(p); }
        
    }   // End of PSV Main
    
}   // End of class
