package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by ohdonggeon on 2020/03/20 8:38 PM
 * Dankook UNIV. Computer Science
 */
public class BulkyTest {

	@Test
	public void getAnswer() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/BulkyInput.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int size = sc.nextInt();
			int[] weight = new int[size];
			int[] height = new int[size];

			for(int length = 0; length < size; length++) {
				weight[length] = sc.nextInt();
				height[length] = sc.nextInt();
			}

			Bulky bulky = new Bulky(weight, height, size);
			int[] answer = bulky.getAnswer(0, 0);
			System.out.println(Arrays.toString(answer));

			for(int value = 0; value < size; value++) {
				assertEquals(sc.nextInt(), answer[value]);
			}
		}
	}
}