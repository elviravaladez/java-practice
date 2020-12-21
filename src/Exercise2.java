public class Exercise2 {
    private int num1;
    private int num2;

    public Exercise2() {

    }
    public Exercise2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void sum() {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d%n",num1, num2, sum);
    }

    public static void main(String[] args) {
        Exercise2 numbers = new Exercise2(20, 20);
        numbers.sum();
    }
}
