package solutions;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CombinationTest {

    @Test
    public void solution() {
        Combination test = new Combination();
        test.input();
        test.solution(0, 0);

        assertEquals(1192052400, test.print());
    }
}