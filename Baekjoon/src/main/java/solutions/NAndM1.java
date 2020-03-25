package solutions;

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
		if (index == sequence.length) {
			for (int element : sequence) {
				System.out.print(element + " ");
			}
			System.out.println();
			return;
		}

		for (int seqNum = 1; seqNum <= range; seqNum++) {
			if (isPossible(index, seqNum)) {
				sequence[index] = seqNum;
				getSequence(index + 1);
			}
		}
	}

	private static boolean isPossible(int index, int seqNum) {
		for (int seqIndex = 0; seqIndex < index; seqIndex++) {
			if (sequence[seqIndex] == seqNum) {
				return false;
			}
		}

		return true;
	}
}