package solutions;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by ohdonggeon on 2020/03/27 10:08 PM
 * Dankook UNIV. Computer Science
 */
public class NAndM2Test {

	@Test
	public void printSequence() throws FileNotFoundException {
		Scanner sc = new Scanner(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/NAndM2Input.txt"));
		int testcases = sc.nextInt();

		for(int cases = 0; cases < testcases; cases++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();

			NAndM2.printSequence(n, m);
			System.out.println("actual : " + str);
		}
	}
}