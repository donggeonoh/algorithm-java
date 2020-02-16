package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Problem1967Test {

    @Test
    public void test() throws FileNotFoundException {

        Problem1967 problem1967 = new Problem1967();
        Scanner scanner = new Scanner(new File("/Users/donggeon/Sources/Algorithm/Baekjoon/src/main/java/testcases/Problem1967Input.txt"));

        int num = scanner.nextInt() - 1;
        int[][] input = new int[num][3];

        for(int i = 0; i < input.length; i++) {
            for(int j = 0; j < input[i].length; j++) {
                input[i][j] = scanner.nextInt();
                System.out.print(input[i][j] + " ");
            }
            System.out.println();
        }

        int answer = problem1967.solution(num, input);
        assertEquals(45, answer);
    }

}