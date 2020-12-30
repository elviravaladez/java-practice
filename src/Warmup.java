public class Warmup {
    //Write a method called cubed that accepts integer and returns int cubed
    public static int cubed(int num) {
        return num * num * num;
    }

    //Method named subtract. Use method overloading so that you can have subtract take in two ints or two doubles
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }


    //Main Method
    public static void main(String[] args) {
        System.out.println(cubed(5));
        System.out.println(subtract(5, 3));
        System.out.println(subtract(5.0, 2.1));
    }
}