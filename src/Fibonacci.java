public class Fibonacci {
    public static int fibonacciSolution(int num) {
        int[] fibonacci = new int[num + 2];

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for(int i = 2; i <= num; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[num];
    }

    public static void main(String[] args) {
        //FIBONACCI NUMBER
        //0 1 1 2 3 5 8
        System.out.println(fibonacciSolution(10));
    }
}
