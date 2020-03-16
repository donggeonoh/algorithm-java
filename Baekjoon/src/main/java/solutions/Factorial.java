package solutions;

import java.math.BigInteger;
import java.util.InputMismatchException;

/**
 * Created by ohdonggeon on 2020/03/16 8:11 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/10872
 * Desc : 팩토리얼 값을 구하시오. (재귀로 구현)
 * Input : 정수 N(0 <= N <= 12)
 * Output : N!
 */
public class Factorial {

	private final BigInteger input;

	Factorial(int input) {
		if (input < 0) {
			throw new InputMismatchException("The input value must be greater than zero.");
		}
		this.input = new BigInteger(String.valueOf(input));
	}

	private static BigInteger getAnswer(BigInteger input) {
		if(input.compareTo(BigInteger.ONE) <= 0) {
			return BigInteger.ONE;
		}
		return input.multiply(getAnswer(input.subtract(BigInteger.ONE)));
	}

	public void printAnswer() {
		System.out.println(getAnswer(input).abs());
	}
}