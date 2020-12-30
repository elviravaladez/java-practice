package jupiterMart;

public class Computer extends Product{
    //TODO: DIRECTIONS:
    // computers should have properties for whether it is a laptop or not (boolean) and OS

    //Properties
    private boolean isALaptop;

    //Constructor
    public Computer(Integer productId, double price, String os) {
        super(productId, price, os);
    }


    //Methods
    @Override
    public boolean isComputer() {
        return true;
    }

    public boolean isALaptop() {
        return true;
    }
}
