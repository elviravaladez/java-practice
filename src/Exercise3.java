public class Exercise3 {
    //properties
    private double number1;
    private double number2;

    //Constructor
    public Exercise3(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    //Getters and Setters
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    //Method to print the difference between two numbers
    public void difference() {
        double difference = number1 / number2;
        System.out.printf("%.2f / %.2f = %.2f",number1, number2, difference);
    }

    //Main Method
    public static void main(String[] args) {
        //declaration => Exercise3 difference
        //instantiation => the "new" keyword that creates the object Exercise3
        //initialization => the call to the Exercise3() constructor ==> Exercise3(30, 2)
        Exercise3 numbers = new Exercise3(82, 5);
        numbers.difference();
    }

}
