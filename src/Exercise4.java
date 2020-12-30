public class Exercise4 {
    //Properties
    int num1;
    int num2;
    int num3;
    int num4;
    int num5;
    int num6;

    //Empty Constructor
    public Exercise4() {

    }

    //Methods
    public static int addMultiply(int num1, int num2, int num3) {
        return num1 + num2 * num3;
    }

    public static int addModulus(int num1, int num2, int num3) {
        return (num1 + num2) % num3;
    }

    public static int addMultiplyDivide(int num1, int num2, int num3, int num4) {
        return num1 + num2 * num3 / num4;
    }

    public static int addMultiplyDivide(int num1, int num2, int num3, int num4, int num5, int num6) {
        return num1 + num2 / num3 * num4 - num5 % num6;
    }



    //Main Method
    public static void main(String[] args) {
        System.out.println(addMultiply(-5, 8, 6));
        System.out.println(addModulus(55, 9, 9));
        System.out.println(addMultiplyDivide(20, -3, 5, 8));
        System.out.println(addMultiplyDivide(5, 15, 3, 2, 8, 3));
    }
}
