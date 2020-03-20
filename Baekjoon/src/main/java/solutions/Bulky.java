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
	}

	public int[] getAnswer() {
		getAnswer(0, 0);
		return answer;
	}

	private void getAnswer(int index, int selected) {

	}

}