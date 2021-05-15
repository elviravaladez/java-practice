package javamasterclasssection6;

public class Rectangle extends Shape {
    private int width;
    private int height;

    //TODO: Create an example of constructor chaining

    //1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); //calls 2nd constructor
    }

    //2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        //initialize variables
        super(x, y); //calls constructor from the parent (Shape)
        this.width = width;
        this.height = height;
    }
}
