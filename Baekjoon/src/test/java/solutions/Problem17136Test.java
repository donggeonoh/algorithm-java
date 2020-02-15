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
            scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/main/java/testcases/Problem17136Input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        int[][] testcase = new int[10][10];

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    testcase[j][k] = scanner.nextInt();
                    System.out.print(testcase[j][k] + " ");
                }
                System.out.println();
            }
            Problem17136 problem = new Problem17136();
            int result = problem.solution(testcase);
            int answer = scanner.nextInt();
            System.out.println("result : " + result + " answer : " + answer);
            assertEquals(answer, result);
        }
    }
}