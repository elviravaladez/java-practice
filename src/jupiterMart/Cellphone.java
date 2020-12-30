package jupiterMart;

public class Cellphone extends Product {
    //TODO: DIRECTIONS:
    // cell phones should have properties for OS and screen size

    //Properties
    private String screenSize;


    //Constructor
    public Cellphone(Integer productId, double price, String os) {
        super(productId, price, os);
    }



    @Override
    public boolean isComputer() {
        return false;
    }
}
