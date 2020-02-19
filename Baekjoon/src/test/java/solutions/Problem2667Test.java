package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem2667Test {

    @Test
    public void solution() throws FileNotFoundException {
        Problem2667 problem2667 = new Problem2667();
        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Probleam2667Input.txt"));

        int size = scanner.nextInt();
        int[][] testcase = new int[size][size];

        for(int i = 0 ; i < size; i++) {
            String str = scanner.next();
            for(int j = 0; j < size; j++) {
                testcase[i][j] = Character.getNumericValue(str.charAt(j));
            }
        }

        problem2667.solution(testcase);
    }
}