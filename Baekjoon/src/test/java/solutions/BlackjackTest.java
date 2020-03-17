package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by ohdonggeon on 2020/03/17 8:49 PM
 * Dankook UNIV. Computer Science
 */
public class BlackjackTest {

	@Test
	public void printAnswer() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/BlackjackInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int cardSize = sc.nextInt();
			int limit = sc.nextInt();
			int[] cards = new int[cardSize];

			for(int index = 0; index < cardSize; index++) {
				cards[index] = sc.nextInt();
			}

			Blackjack blackjack = new Blackjack(cardSize, limit, cards);
			int expected = blackjack.getAnswer();
			int actual = sc.nextInt();

			assertEquals(expected, actual);
		}
	}
}