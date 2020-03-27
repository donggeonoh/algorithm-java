package solutions;

/**
 * Created by ohdonggeon on 2020/03/27 9:00 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/15650
 * Desc : 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열을 출력하여라.
 * Input : N, M (1 <= M <= N <= 8)
 * Output : 중복되지 않는 수열 출력
 */
public class NAndM2 {

	private static int[] answer;
	private static boolean[] visited;

	private static int range;
	private static int length;

	private NAndM2() {

	}

	public static void printSequence(int n, int m) {
		range = n;
		length = m;
		answer = new int[length];
		visited = new boolean[range + 1];

		getSequence(0, 0);
	}

	private static void getSequence(int index, int count) {
		if(index == length) {
			for(int element : answer) {
				System.out.print(element + " ");
			}
			System.out.println();
			return;
		}

		for(int element = count + 1; element <= range; element++) {
			answer[index] = element;
			getSequence(index + 1, element);
		}
	}
}