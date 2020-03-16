package solutions;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by ohdonggeon on 2020/03/16 8:39 PM
 * Dankook UNIV. Computer Science
 */
public class FactorialTest {

	@Test
	public void printAnswer() throws IOException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/FactorialInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int input = sc.nextInt();

			Factorial solution = new Factorial(input);
			solution.printAnswer();
		}
		sc.close();
	}
}