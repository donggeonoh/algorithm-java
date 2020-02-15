package solutions;

import java.util.Scanner;

public class InputTestcase {

    Scanner scanner;

    int row = 0, col = 0;

    InputTestcase(String path) {
        scanner = new Scanner(path);
    }

    public int[][] inputTwoDimensionalArray(int row, int col) {

        int[][] input = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        return input;
    }

    public int[][] inputTwoDimensionalArray(int col) {

        int row = scanner.nextInt();
        int[][] input = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        return input;
    }

    public void close() {
        scanner.close();
    }

}
