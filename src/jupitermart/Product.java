package jupitermart;

public abstract class Product {
    //TODO: DIRECTIONS:
    // jupiter mart carries computers and cell phones.  These products should
    // all have product ids, prices, and OS

    //Properties
    private int productId;
    private double price;
    private String os;



    //Constructor
    public Product(Integer productId, double price, String os) {
        this.productId = productId;
        this.price = price;
        this.os = os;
    }



    //Getters and Setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
