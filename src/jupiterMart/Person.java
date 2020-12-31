package jupiterMart;

import java.util.ArrayList;

public class Person {
    //TODO: DIRECTIONS:
    // there should be a person class with properties of first name and last name.
    // They should have a method that gives them the ability to ring up a cart
    // or products (may need to write later)

    //Properties
    private String firstName;
    private String lastName;



    //Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }



    //Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



    //Custom Method to ring up cart
    public double ringUpCart(ArrayList<Product> products) {
        double total = 0;

        //Getting the price of each product within the ArrayList of products
        // and adding the price to the total
        for(Product product : products) {
            total += product.getPrice();
        }

        System.out.printf("Your total price is: $%.2f.", total);
        return total;
    }

}
