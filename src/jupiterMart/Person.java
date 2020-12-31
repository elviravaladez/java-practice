package jupiterMart;

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



    //Custom Methods
    //Method to ring up cart
    public String ringUpCart() {
        return "You are now ringing up your cart";
    }

    //Method to ring up cart
    public boolean canRingUpCart() {
        return true;
    }
}
