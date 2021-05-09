package javaMasterClassSection6;

public class Main {
    public static void main(String[] args) {
        Car mazda = new Car();
        Car ford = new Car();

        mazda.setModel("Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Miata

        mazda.setModel("MX-5 Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Unknown

        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

    }
}
