package solutions;

import org.junit.Test;

import java.io.*;
import java.util.StringTokenizer;

import static org.junit.Assert.*;

/**
 * Created by ohdonggeon on 2020/03/23 7:46 PM
 * Dankook UNIV. Computer Science
 */
public class ChessTest {

	@Test
	public void getAnswer() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/ChessIput.txt")));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
		int testcases = Integer.parseInt(tokenizer.nextToken());

		for(int cases = 0; cases < testcases; cases++) {
			tokenizer = new StringTokenizer(reader.readLine());
			int row = Integer.parseInt(tokenizer.nextToken());
			int col = Integer.parseInt(tokenizer.nextToken());
			char[][] board = new char[row][col];

			for(int i = 0; i < row; i++) {
				tokenizer = new StringTokenizer(reader.readLine());
				String temp = tokenizer.nextToken();
				for(int j = 0; j < col; j++) {
					board[i][j] = temp.charAt(j);
				}
			}
			Chess chess = new Chess(row, col, board);
			tokenizer = new StringTokenizer(reader.readLine());

			int expected = chess.getAnswer();
			int actual = Integer.parseInt(tokenizer.nextToken());
			assertEquals(expected, actual);
		}
	}
}