package solutions;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by ohdonggeon on 2020/03/15 8:28 PM
 * Dankook UNIV. Computer Science
 */
public class PrintStarTest {

	@Test
	public void printSolution() {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int input = Integer.parseInt(reader.readLine());

			PrintStar solution = new PrintStar(input);
			solution.printSolution();

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}