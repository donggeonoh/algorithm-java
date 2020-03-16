package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by donggeon on 2020/03/06
 * Dankook UNIV. Computer Science
 * Source :
 * Desc :
 */
public class TowerOfHanoiTest {

	@Test
	public void solution() {
		try {
			Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/TowerOfHanoiInput.txt"));
			int testcases = sc.nextInt();
			for(int cases = 0; cases < testcases; cases++) {
				int input = sc.nextInt();
				TowerOfHanoi solution = new TowerOfHanoi(input);
				solution.printAnswerByRF();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}