package solutions;

import java.util.Scanner;

/**
 * Created by ohdonggeon on 2020/03/18 8:56 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2231
 * Desc : 분해합은 숫자와 각 자리의 숫자를 더한 값을 분해합이라고 한다. 분해합을 출력하여라. (ex- 245 : 245 + 2 + 4 + 5 = 256)
 * Input : 숫자 N
 * Output : 분해합
 */

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecompositionSum decompositionSum = new DecompositionSum(sc.nextInt());
		System.out.println(decompositionSum.getSolution());
	}
}
public class DecompositionSum {

	private final int input;
	private static int answer = 0;

	DecompositionSum(int input) {
		this.input = input;
	}

	public int getSolution() {
		decompositionSum(input);
		return answer;
	}

	private void decompositionSum(int digit) {
		if(digit == 0) {
			return;
		}
		int decompositionSum = digit + sumEachDigit(digit);

		if(decompositionSum == input) {
			answer = digit;
		}

		decompositionSum(--digit);
	}

	private int sumEachDigit(int digit) {
		String digitStr = String.valueOf(digit);
		int digitLength = digitStr.length();
		int digitSum = 0;

		for(int index = 0; index < digitLength; index++) {
			digitSum += Integer.parseInt(String.valueOf(digitStr.charAt(index)));
		}
		return digitSum;
	}
}