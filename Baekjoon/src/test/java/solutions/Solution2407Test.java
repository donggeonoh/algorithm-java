package solutions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Solution2407Test {

    @Test
    public void solution() {
        Solution2407 test = new Solution2407();
        test.input();
        test.solution(0, 0);

        assertEquals(1192052400, test.print());
    }
}