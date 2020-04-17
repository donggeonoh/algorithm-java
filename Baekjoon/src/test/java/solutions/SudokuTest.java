package solutions;

import org.junit.Test;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by ohdonggeon on 2020/04/06 10:41 PM
 * Dankook UNIV. Computer Science
 */
public class SudokuTest {

	@Test
	public void printSolution() throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(new File("/Users/ohdonggeon/Sources/Algorithm/Baekjoon/src/test/java/testcases/SudokuInput.txt")));
		int[][] input = new int[Sudoku.SIZE][Sudoku.SIZE];

		for (int row = 0; row < Sudoku.SIZE; row++) {
			StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
			for (int col = 0; col < Sudoku.SIZE; col++) {
				input[row][col] = Integer.parseInt(tokenizer.nextToken());
			}
		}



		Sudoku.printSolution(input);
		reader.close();
	}
}