package dan.baekjoon.solution;

import org.junit.Assert;
import org.junit.Test;

public class Problem17136Test {

    @Test
    public void test() {
        Problem17136 problem17136 = new Problem17136();

        int[][] testcase = {
                {0, 0, 0, 0, 0, 0 ,0, 0, 0, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0},
                {0, 0, 0, 0, 0,0 ,0, 0, 0, 0},
                {0 ,0 ,0 ,0 ,0 ,0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0 ,0 ,0 ,0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0},
                {0, 0, 0, 0, 0, 0, 0 ,0, 0, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0,0},
                {0, 0, 0, 0, 0, 0, 0, 0,0, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0}
        };
        int result = problem17136.solution(testcase);
        Assert.assertEquals(0, result, 0);

        int[][] testcase2 = {
                {0, 0, 0, 0, 0, 0 ,0, 0, 0, 0},
                {0 ,1 ,1 ,0 ,0 ,0 ,0 ,0 ,0, 0},
                {0, 0, 1, 0, 0,0 ,0, 0, 0, 0},
                {0 ,0 ,0 ,0 ,1 ,1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1, 0 ,0 ,0 ,0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0},
                {0, 0, 1, 0, 0, 0, 0 ,0, 0, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0,0},
                {0, 0, 0, 0, 0, 0, 0, 0,0, 0},
                {0 ,0 ,0 ,0 ,0 ,0 ,0 ,0 ,0, 0}
        };
        int result2 = problem17136.solution(testcase2);
        Assert.assertEquals(5, result2, 0);
    }
}
