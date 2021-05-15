package javamasterclasssection3.strings;

public class StringDataType {
    public static void main(String[] args) {
        String myString = "This is a string";

        System.out.println("myString is equal to " + myString);
        //myString is equal to This is a string
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        //myString is equal to This is a string, and this is more.

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString); //250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println("LastString is equal to " + lastString);
        //LastString is equal to 1050

        //Java converted the int to a string

        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("LastString is equal to " + lastString);
        //LastString is equal to 1050120.47
    }
}