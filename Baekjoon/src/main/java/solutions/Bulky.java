package solutions;

/**
 * Created by ohdonggeon on 2020/03/20 8:23 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/7568
 * Desc : 키와 몸무게를 통해 등수를 매겨라
 * Input : 키, 몸무게, 사람 수
 * Output : 순위
 */
public class Bulky {

	private final int[] weight;
	private final int[] height;
	private final int size;

	private final int[] answer;

	Bulky(int[] weight, int[] height, int size) {
		this.weight = weight;
		this.height = height;
		this.size = size;
		this.answer = new int[size];

		for (int index = 0; index < size; index++) {
			answer[index] = 1;
		}
	}

	//재귀
	public int[] getAnswer(int outer, int inner) {
		if (outer == size) {
			return answer;
		}

		if (inner == size) {
			return getAnswer(outer + 1, 0);
		}

		if (weight[outer] > weight[inner]) {
			if (height[outer] > height[inner]) {
				answer[inner]++;
			}
		}

		return getAnswer(outer, inner + 1);
	}

	//포문
	public int[] getAnswer() {
		for (int outer = 0; outer < size; outer++) {
			for (int inner = 0; inner < size; inner++) {
				if (outer == inner) {
					continue;
				}

				if (weight[outer] > weight[inner]) {
					if (height[outer] > height[inner]) {
						answer[inner]++;
					}
				}
			}
		}
		return answer;
	}
}