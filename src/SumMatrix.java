import java.util.Random;
import java.util.Scanner;

public class SumMatrix {
    public static void main(String[] args) {
        int size = getSize();
        int[][] firstArray = getArray(size, size);
        System.out.println("first matrix");
        displaySumArray(firstArray);

        int[][] secondArray = getArray(size, size);
        System.out.println("second matrix");
        displaySumArray(secondArray);

        int[][] sumArray = getSumArray(firstArray, secondArray, size);
        System.out.println("result: ");
        displaySumArray(sumArray);


    }

    private static int getSize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        return sc.nextInt();
    }

    private static void displaySumArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getSumArray(int[][] firstArray, int[][] secondArray, int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = firstArray[i][j] + secondArray[i][j];
            }
        }
        return array;
    }

    private static int[][] getArray(int height, int width) {
        int[][] array = new int[height][width];
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rd.nextInt(100) + 1;
            }
        }
        return array;
    }
}
