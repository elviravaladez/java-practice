package javamasterclasssection3.casting;

public class Casting {
    public static void main(String[] args) {
        byte myMinByteValue = java.lang.Byte.MIN_VALUE; //-128
        short myMinShortValue = java.lang.Short.MIN_VALUE; //-32768
        int myMinIntValue = Integer.MIN_VALUE; //-2147483648

        int myTotal = (myMinIntValue / 2);

//        byte myNewByteValue = (myMinByteValue / 2);
        //The code above will give an error b/c the default whole number used by Java is an int

        //TODO: Use casting to convert the number to the proper data type
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short)(myMinShortValue / 2);
    }
}
