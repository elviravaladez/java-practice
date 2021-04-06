package interviewPreparationKit;

public class Array {

    //Two-Dimensional Arrays
    //We can define an array whose elements are themselves arrays.
    // This is called a two-dimensional array, or a matrix.
    // You can think of a two-dimensional array like a grid, with rows and columns.

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;

        int maxHourglassSum = -63;

        for(int i = 0; i < rows - 2; i++) {
            for(int j = 0; j < columns - 2; j++) {
                int currentHourglassSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];

                maxHourglassSum = Math.max(maxHourglassSum, currentHourglassSum);
            }
        }

        return maxHourglassSum;
    }
}
