package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ohdonggeon on 2020/03/16 10:22 PM
 * Dankook UNIV. Computer Science
 */
public class FibonacciNumberTest {

	@Test
	public void printSolution() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/FibonacciNumberInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			FibonacciNumber number = new FibonacciNumber(sc.nextInt());
			number.printSolution();
		}
	}
}