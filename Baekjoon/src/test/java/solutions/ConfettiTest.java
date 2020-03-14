package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class ConfettiTest {

    @Test
    public void solution() {

        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/Input17136.txt"));
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
            Confetti problem = new Confetti();
            int result = problem.solution(testcase);
            int answer = scanner.nextInt();
            System.out.println("result : " + result + " answer : " + answer);
            assertEquals(answer, result);
        }
    }
}