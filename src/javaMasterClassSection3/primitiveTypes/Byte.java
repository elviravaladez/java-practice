package javaMasterClassSection3.primitiveTypes;

public class Byte {
    public static void main(String[] args) {
        byte myMinByteValue = java.lang.Byte.MIN_VALUE; //-128
        byte myMaxByteValue = java.lang.Byte.MAX_VALUE; //127

        System.out.println("Byte Minimum Value = " + myMinByteValue); //Byte Minimum Value = -128
        System.out.println("Byte Maximum Value = " + myMaxByteValue); //Byte Maximum Value = 127
    }
}
