package solutions;

import org.junit.Test;
import static org.junit.Assert.*;

public class SnailTest {

    int[][] testcase1 = {
            {1, 2, 3},
            {8, 9, 4},
            {7, 6, 5}
    };
    int[][] testcase2 = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
    };

    int[][] result1 = new Snail().solution(3);
    int[][] result2 = new Snail().solution(5);

    @Test
    public void test() {
        assertArrayEquals(testcase1, result1);
        assertArrayEquals(testcase2, result2);
    }
}