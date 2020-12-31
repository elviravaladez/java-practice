package jupiterMart;

public class JupiterMartMain {
    //TODO: add a class to hold your main method
    // In your main method create products (computers and phones) for a customer to purchase

    //Main Method
    public static void main(String [] args) {
        Person customer = new Person("customer", "1");

        Computer comp1 = new Computer(0, 2000, "Apple", false);
        Cellphone cell1 = new Cellphone(1, 1000, "Apple","6.1-inch OLED");

    }
}
