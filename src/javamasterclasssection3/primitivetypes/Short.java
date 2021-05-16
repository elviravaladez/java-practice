package javamasterclasssection3.primitivetypes;

public class Short {
    public static void main(String[] args) {
        short myMinShortValue = java.lang.Short.MIN_VALUE; //-32768
        short myMaxShortValue = java.lang.Short.MAX_VALUE; //32767

        System.out.println("Short Minimum Value = " + myMinShortValue); //Short Minimum Value = -32768
        System.out.println("Short Maximum Value = " + myMaxShortValue); //Short Maximum Value = 32767

//        short bigShortLiteralValue = 32768; //error: is an int (need a short or cast)
    }
}
