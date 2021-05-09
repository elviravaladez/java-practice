package javaMasterClassSection6;

public class Main {
    public static void main(String[] args) {
        //TODO: Car Example
        Car mazda = new Car();
        Car ford = new Car();

        mazda.setModel("Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Miata

        mazda.setModel("MX-5 Miata");
        System.out.println("Model of the car is: " + mazda.getModel()); // Model of the car is: Unknown

        //TODO: Simple Calculator Challenge
        SimpleCalculator calculator = new SimpleCalculator();

        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("subtract = " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply = " + calculator.getMultiplicationResult());
        System.out.println("divide = " + calculator.getDivisionResult());

        //TODO: Person Challenge
        Person person = new Person();

        person.setFirstName("");
        person.setLastName("");
        person.setAge(10);
        System.out.println("fullName = " + person.getFullName()); //fullName =
        System.out.println("teen = " + person.isTeen()); //teen = false

        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullName = " + person.getFullName()); //fullName = John
        System.out.println("teen = " + person.isTeen()); //teen = true
        person.setLastName("Smith");
        System.out.println("fullName = " + person.getFullName()); //fullName = John Smith
    }
}
