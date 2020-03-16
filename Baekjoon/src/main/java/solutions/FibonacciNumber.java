package solutions;

import java.util.InputMismatchException;

/**
 * Created by ohdonggeon on 2020/03/16 9:32 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/10870
 * Desc : 파보나치의 수를 구하시오. (재귀 구현)
 * Input : N (N >= 2)
 * Output : N 번째 파보나치의 수
 */
public class FibonacciNumber {

	private final int input;

	FibonacciNumber(int input) {
		if (input < 0) {
			throw new InputMismatchException("The input value must be greater than zero.");
		}
		this.input = input;
	}

	public void printSolution() {
		System.out.println(getSolution(input));
	}

	private int getSolution(int input) {
		if (input == 1) {
			return 1;
		} else if (input == 0) {
			return 0;
		}

		return getSolution(input - 1) + getSolution(input - 2);
	}
}