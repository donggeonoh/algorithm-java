package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1967Test {

    public static void main(String[] args) {

    }

    @Test
    public void test() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Problem1967Input.txt"));

        int num = scanner.nextInt();
        int[][] input = new int[num - 1][3];

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        Problem1967 problem1967 = new Problem1967(num, input);
        problem1967.printSolution();
    }

}