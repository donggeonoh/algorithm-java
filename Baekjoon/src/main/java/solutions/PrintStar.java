package solutions;

import java.util.Arrays;
import java.util.InputMismatchException;

/**
 * Created by ohdonggeon on 2020/03/15 8:12 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/step/19
 * Desc : 별 찍기 (재귀함수 이용)
 * input : 숫자 N (N은 3의 거듭제곱 ex 3^x)
 * output : 재귀 패턴 출력
 */
public class PrintStar {

	private char[][] map;
	private final int input;

	PrintStar(int input) {
		if (input % 3 != 0) {
			throw new InputMismatchException("You must input a power of 3.");
		}

		this.map = new char[input][input];
		this.input = input;

		for(char[] mapArrays : map) {
			Arrays.fill(mapArrays, ' ');
		}
	}

	public void printSolution() {
		setStar(0, 0, input);
		printStar();
	}

	private void setStar(int row, int col, int size) {

		if (size == 1) {
			map[row][col] = '*';
			return;
		}

		int m = size / 3;
		int count = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				count++;
				if (count != 5) {
					setStar(row + i * m, col + j * m, m);
				}
			}
		}
	}

	private void printStar() {
		for (char[] mapArrays : map) {
			for (char item : mapArrays) {
				System.out.print(item);
			}
			System.out.println();
		}
	}
}
