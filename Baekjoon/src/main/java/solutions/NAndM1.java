package solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by ohdonggeon on 2020/03/25 9:36 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/15649
 * Desc : 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램 작성
 * Input : N, M (1 <= N, M <= 8)
 * Output : M개를 고른 수열
 */
public class NAndM1 {

	private static int range;
	private static int[] sequence;

	private NAndM1() {

	}

	public static void printAnswer(int n, int m) {
		range = n;
		sequence = new int[m];
		getSequence(0);
	}

	private static void getSequence(int index) {
		if(index == sequence.length) {
			System.out.println(Arrays.toString(sequence));
			return;
		}

		for(int seqNum = 1; seqNum < sequence.length; seqNum++) {
			if(isPossible(index, seqNum)) {
				getSequence(index + 1);
			} else {
				break;
			}
		}
	}

	private static boolean isPossible(int index, int seqNum) {
		for(int seqIndex = 0; seqIndex < index; seqIndex++) {
			if(sequence[seqIndex] == seqNum) {
				return false;
			}
		}

		return true;
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int n = Integer.parseInt(tokenizer.nextToken());
		int m = Integer.parseInt(tokenizer.nextToken());

		NAndM1.printAnswer(n, m);

		reader.close();
	}
}