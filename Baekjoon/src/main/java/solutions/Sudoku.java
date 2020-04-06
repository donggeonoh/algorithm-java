package solutions;

/**
 * Created by ohdonggeon on 2020/04/06 10:38 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2580
 * Desc : 스도쿠 판에 쓰여 있는 숫자들의 정보가 주어질 때 모든 빈 칸이 채워진 최종 모습을 출력
 * Input : 9줄에 한 칸씩 띄어진 숫자가 입력된다. (9 X 9) 단, 빈칸은 0이 입력된다.
 * Output : 스도쿠를 완성한다.
 */
public class Sudoku {

	private static int[][] sudoku;

	private Sudoku() {

	}

	public static void printSolution(int[][] input) {
		sudoku = input;

		printSolution();
	}

	private static void printSolution() {

	}
}
