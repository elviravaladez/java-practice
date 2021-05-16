package javamasterclasssection3.primitivetypes;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByte = 99;
        short myShort = 800;
        int myInt = 8999;

        long myLong = (50000L + (10L * (myByte + myShort + myInt)));

        System.out.println(myLong);

        //Casting
        short shortTotal = (short)(1000 + 10 * (myByte + myShort + myInt));

        System.out.println(shortTotal);
    }
}
