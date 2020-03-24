package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by ohdonggeon on 2020/03/24 10:03 PM
 * Dankook UNIV. Computer Science
 */
public class MovieDirectorShawmTest {

	@Test
	public void getAnswer() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/MovieDirectorShawmInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int input = sc.nextInt();

			MovieDirectorShawm shawm = new MovieDirectorShawm(input);
			int expected = shawm.getAnswer();
			int actual = sc.nextInt();

			assertEquals(expected, actual);
		}

		sc.close();
	}
}