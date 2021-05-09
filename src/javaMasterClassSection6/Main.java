package javaMasterClassSection6;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        Car ford = new Car();

        mazda.setModel("Miata");
        System.out.println("Model of the car is: " + mazda.getModel());
        // Model of the car is: Miata

        mazda.setModel("MX-5 Miata");
        System.out.println("Model of the car is: " + mazda.getModel());
        // Model of the car is: Unknown

    }
}
