package javamasterclasssection6;

public class Car {
    //Fields (properties) (instance variables)
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //Methods
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("mustang") || validModel.equals("miata")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return this.engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color = color;
    }

}
