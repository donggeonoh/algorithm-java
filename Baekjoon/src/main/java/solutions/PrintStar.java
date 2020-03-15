package solutions;

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

	public static final int NUMBER_REPEAT = 3;

	private final int input;

	PrintStar(int input) {
		if (input % 3 != 0) {
			throw new InputMismatchException("You must input a power of 3.");
		}
		this.input = input;
	}

	public void printSolution() {
		printStar(input);
	}

	private void printStar(int input) {

		if(input == 0) {
			return;
		}

		System.out.print("*");
		printStar(input - 1);
	}

}
