package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by ohdonggeon on 2020/03/18 9:00 PM
 * Dankook UNIV. Computer Science
 */
public class DecompositionSumTest {

	@Test
	public void printSolution() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/DecompositionInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int input = sc.nextInt();
			DecompositionSum decompositionSum = new DecompositionSum(input);
			int expected = decompositionSum.getSolution();
			int actual = sc.nextInt();

			assertEquals(expected, actual);
		}
		sc.close();
	}
}