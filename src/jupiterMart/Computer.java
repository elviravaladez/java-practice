package jupiterMart;

public class Computer extends Product{
    //TODO: DIRECTIONS:
    // computers should have properties for whether it is a laptop or not (boolean) and OS

    //Properties
    private boolean isALaptop;



    //Constructor
    public Computer(Integer productId, double price, String os, boolean isALaptop) {
        super(productId, price, os);
        this.isALaptop = isALaptop;
    }



    //Getters and Setters
    public boolean getIsALaptop() {
        return isALaptop;
    }

    public void setIsALaptop(boolean isALaptop) {
        this.isALaptop = isALaptop;
    }
}
