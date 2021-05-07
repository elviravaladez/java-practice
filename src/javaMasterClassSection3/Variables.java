package javaMasterClassSection3;

public class Variables {
    public static void main(String[] args) {
        System.out.println("Hello, Elvira");

        //Declaration Statement: Used to define a variable by indicating the data type, and the name, and optionally to set the variable to a certain value.

        int firstNum = 5; //This is a Declaration Statement
        //type is an int, name is "myFirstNumber" value is 5
        //initialization is optional
        int secondNum = 10 + 5;
        int thirdNum = (10 + 5) + (2 * 10);

        System.out.println(firstNum); //5
        System.out.println(secondNum); //15
        System.out.println(thirdNum); //35

        //TODO: Create additional variables
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        //TODO: Find the sum of two variables
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        System.out.println(myTotal); //117

        //TODO: Variable Challenge
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);  //883
    }
}
