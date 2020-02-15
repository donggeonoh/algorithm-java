package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem1967Test {

    @Test
    public void test() {
        Problem1967 problem1967 = new Problem1967();
        InputTestcase input = new InputTestcase("/Users/donggeon/Sources/Algorithm/Baekjoon/src/main/java/testcases/Problem1967Input.txt");
        int answer = problem1967.solution(input.inputTwoDimensionalArray(3));
        assertEquals(45, answer);
        input.close();
    }

}