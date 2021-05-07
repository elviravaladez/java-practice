package javaMasterClassSection3.primitiveTypes;

public class Long {
    public static void main(String[] args) {
        long myLongValue = 100L;

        long myMinLongValue = java.lang.Long.MIN_VALUE; //-9223372036854775808
        long myMaxLongValue = java.lang.Long.MAX_VALUE; //9223372036854775807

        System.out.println("Long Minimum Value = " + myMinLongValue); //Long Minimum Value = -32768
        System.out.println("Long Maximum Value = " + myMaxLongValue); //Long Maximum Value = 32767

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue); //2147483647234
    }
}
