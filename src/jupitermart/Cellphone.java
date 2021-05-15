package jupitermart;

public class Cellphone extends Product {
    //TODO: DIRECTIONS:
    // cell phones should have properties for screen size

    //Properties
    private String screenSize;



    //Constructor
    public Cellphone(Integer productId, double price, String os, String screenSize) {
        super(productId, price, os);
        this.screenSize = screenSize;
    }



    //Getters and Setters
    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
