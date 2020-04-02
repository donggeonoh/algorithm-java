package solutions;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;

/**
 * Created by ohdonggeon on 2020/04/02 10:33 PM
 * Dankook UNIV. Computer Science
 */
public class QueenTest {

	@Test
	public void getAnswer() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/QueenInput.txt")));
		int testcases = Integer.parseInt(reader.readLine());

		for(int cases = 0; cases < testcases; cases++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			int token = Integer.parseInt(tokenizer.nextToken());
			System.out.print(token + " ");
			int expected = Queen.getAnswer(token);
			token = Integer.parseInt(tokenizer.nextToken());
			int actual = token;
			System.out.println(token);
			assertEquals(expected, actual);
		}
		reader.close();
	}
}