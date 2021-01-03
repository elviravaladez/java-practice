package christmas;

public class Reindeer {
    //Properties
    protected String name;


    //Constructor
    public Reindeer(String name) {
        this.name = name;
        System.out.printf("%s%n", name);
    }


    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
