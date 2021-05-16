package javamasterclasssection3.operatorsoperandsandexpressions;

public class Operators {
    public static void main(String[] args) {

        int result = 1 + 2;//3
        //has the = operator and + operator

        System.out.println("1 + 2 = " + result);
        //1 + 2 = 3
        int previousResult = result;

        System.out.println(previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);//3 - 1 = 2

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result); ////2 * 10 = 20

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result); //20 / 5 = 4

        //Modulus Operator (remainder)
        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result); //4 % 3 = 1


        //Abbreviation Examples

        // result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
    }
}
