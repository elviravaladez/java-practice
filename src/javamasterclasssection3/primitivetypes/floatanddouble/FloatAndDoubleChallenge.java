package javamasterclasssection3.primitivetypes.floatanddouble;

public class FloatAndDoubleChallenge {
    public static void main(String[] args) {
        int myIntValue = 5;
        float myFloatValue = 5f;
        double myDoubleValue = 5d;

        System.out.println("MyIntValue = " + myIntValue); //MyIntValue = 5
        System.out.println("MyFloatValue = " + myFloatValue); //MyFloatValue = 5.0
        System.out.println("MyDoubleValue = " + myDoubleValue); //MyDoubleValue = 5.0

        int myNewIntValue = 5 /2;
        float myNewFloatValue = 5f / 2f;
        double myNewDoubleValue = 5d / 2d;

        System.out.println("MyNewIntValue = " + myNewIntValue); //MyNewIntValue = 2
        System.out.println("MyNewFloatValue = " + myNewFloatValue); //MyNewFloatValue = 2.5
        System.out.println("MyNewDoubleValue = " + myNewDoubleValue); //MyNewDoubleValue = 2.5

        int myNextIntValue = 5 /3;
        float myNextFloatValue = 5f / 3f;
        double myNextDoubleValue = 5d / 3d;

        System.out.println("MyNextIntValue = " + myNextIntValue); //MyNextIntValue = 1
        System.out.println("MyNextFloatValue = " + myNextFloatValue); //MyNextFloatValue = 1.6666666
        System.out.println("MyNextDoubleValue = " + myNextDoubleValue); //MyNextDoubleValue = 1.6666666666666667

        //TODO: Pounds to Kilograms Challenge
        double pounds = 200d;
        double convertedKilograms = pounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);
        // Converted kilograms = 90.718474

        double pi = 3.1415927d;
        System.out.println(pi); //3.1415927

        double anotherNumber = 3_000_000.4_567_890d; //valid syntax
        System.out.println(anotherNumber); //3000000.456789
    }
}
