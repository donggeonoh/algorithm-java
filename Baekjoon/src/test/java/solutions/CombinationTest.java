package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CombinationTest {
	@Test
	public void solution() throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/CombinationInput.txt"));
        int testcases = sc.nextInt();

        for(int cases = 0; cases < testcases; cases++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            Combination combination = new Combination(n, m);
            combination.printSolution();
        }
        sc.close();
	}
}