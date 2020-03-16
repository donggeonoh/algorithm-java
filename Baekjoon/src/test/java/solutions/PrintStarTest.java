package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ohdonggeon on 2020/03/15 8:28 PM
 * Dankook UNIV. Computer Science
 */
public class PrintStarTest {

	@Test
	public void printSolution() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/PrintStarInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			PrintStar star = new PrintStar(sc.nextInt());
			star.printSolution();
		}
	}
}