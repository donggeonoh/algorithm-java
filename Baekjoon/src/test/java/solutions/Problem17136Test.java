package solutions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.*;

public class Problem17136Test {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void solution() {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/main/java/testcases/Problem17136.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[][] testcase = new int[10][10];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    testcase[j][k] = scanner.nextInt();
                }
            }
            Problem17136 problem = new Problem17136();
            int result = problem.solution();
            int answer = scanner.nextInt();
            assertEquals(answer, result);
        }

    }
}