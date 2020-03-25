package solutions;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

/**
 * Created by ohdonggeon on 2020/03/25 10:19 PM
 * Dankook UNIV. Computer Science
 */
public class NAndM1Test {

	@Test
	public void printAnswer() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/NAndM1Input.txt")));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(tokenizer.nextToken());
		int m = Integer.parseInt(tokenizer.nextToken());

		NAndM1.printAnswer(n, m);

		System.out.println("====== ACTUAL ======");

		for (int i = 0; i < 24; i++) {
			System.out.println(reader.readLine());
		}

		reader.close();
	}
}