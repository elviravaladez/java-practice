package javaMasterClassSection3.PrimitiveTypes;

public class Int {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; //-2147483648
        int myMaxIntValue = Integer.MAX_VALUE; //2147483647

        System.out.println("Integer Minimum Value = " + myMinIntValue); //Integer Minimum Value = -2147483648
        System.out.println("Integer Maximum Value = " + myMaxIntValue); //Integer Maximum Value = 2147483647

        //int is a primitive type

        //Integer is a Wrapper Class
        //Java uses the concept of a Wrapper class for all eight primitive types - In the case of an int, we can use Integer, and by doing so it gives us ways to perform operations on an int.

        System.out.println("Busted MAX value = " + (myMaxIntValue + 1)); // Busted MAX value = -2147483648
        //The number turned into a negative number. This is called an overflow b/c we tried to put a number that was TOO LARGE for the allocated space for an integer, and it didn't fit, but the computer tried to put the number into the space anyway. B/C it didn't fit the number overflowed.


        System.out.println("Busted MIN value = " + (myMaxIntValue - 1)); // Busted MIN value = 2147483646
        //This is called UNDERFLOW

        //NOTE: If you try and put a value larger than the maximum value in Java, or a value smaller than the minimum value in Java, then you will get an OVERFLOW in the case of the maximum value or an UNDERFLOW in the case of the minimum.

        //The computer just skips back to the min. number or the max. number, which is usually not what you want.
    }
}
