package javamasterclasssection3.primitiveTypes.floatAndDouble;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE; //1.4E-45
        float myMaxFloatValue = Float.MAX_VALUE; //3.4028235E38

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE; //4.9E-324
        double myMaxDoubleValue = Double.MAX_VALUE; //1.7976931348623157E308

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = (float)5.25;
        double myDoubleValue = 5d;
    }
}
