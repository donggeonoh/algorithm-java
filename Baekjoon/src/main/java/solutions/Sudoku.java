package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by ohdonggeon on 2020/04/06 10:38 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2580
 * Desc : 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력
 * Input : 9줄에 한 칸씩 띄어진 숫자가 입력된다. (9 X 9) 단, 빈칸은 0이 입력된다.
 * Output : 스도쿠를 완성한다.
 */
public class Sudoku {

	public static final int SIZE = 9;
	public static final int EMPTY = 0;

	private static int[][] sudoku;

	private Sudoku() {

	}

	public static void printSolution(int[][] input) {
		sudoku = input;

		printSolution(0, 0);
	}

	private static void printSolution(int row, int col) {
		if(row == SIZE) {
			System.out.println(Arrays.deepToString(sudoku));
			return;
		}

		if(col == SIZE) {
			printSolution(row + 1, 0);
			return;
		}

		for (int sRow = row; sRow < SIZE; sRow++) {
			for (int sCol = col; sCol < SIZE; sCol++) {
				if (sudoku[row][col] == EMPTY) {
					for (int num = 1; num <= 9; num++) {
						if (isPossible(row, col, num)) {
							sudoku[row][col] = num;
							printSolution(row, col + 1);
						}
					}
				}
			}
		}
	}

	private static boolean isPossible(int row, int col, int sNum) {
		if (isSameNumberHorizontal(row, sNum)) {
			return false;
		}

		if (isSameNumberVertical(col, sNum)) {
			return false;
		}

		if (isSameNumberRange(row, col, sNum)) {
			return false;
		}

		return true;
	}

	private static boolean isSameNumberHorizontal(int row, int num) {
		for (int col = 0; col < SIZE; col++) {
			if (sudoku[row][col] == num) {
				return true;
			}
		}

		return false;
	}

	private static boolean isSameNumberVertical(int col, int num) {
		for (int row = 0; row < SIZE; row++) {
			if (sudoku[row][col] == num) {
				return true;
			}
		}

		return false;
	}

	private static boolean isSameNumberRange(int row, int col, int num) {
		row = (row / 3) * 3;
		col = (col / 3) * 3;

		for (int sRow = row; sRow < row + 3; sRow++) {
			for (int sCol = col; sCol < col + 3; sCol++) {
				if (sudoku[sRow][sCol] == num) {
					return true;
				}
			}
		}

		return false;
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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