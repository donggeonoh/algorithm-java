package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution1967Test {

    @Test
    public void test() throws FileNotFoundException {

        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input1967.txt"));

        int num = scanner.nextInt();
        int[][] input = new int[num - 1][3];

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
            }
        }

        Solution1967 solution1967 = new Solution1967(num, input);
        solution1967.printSolution();
    }

}