package javaMasterClassSection6;

public class Dog extends Animal { //extends mean inheriting

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //keyword "super" calls a constructor from the class we're extending from so we can inherit from that class
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat(); //call the super equivalent of that class
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

}
