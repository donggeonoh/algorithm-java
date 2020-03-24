package solutions;

/**
 * Created by ohdonggeon on 2020/03/24 9:52 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/1436
 * Desc : 6이 적어도 3개 이상 연속으로 들어가는 숫자 중에서, N 번째의 숫자를 구하여라. (666, 1666, 2666 ...)
 * Input : N (10,000 보다 작거나 같은 자연수)
 * Output : N 번째의 6이 적어도 3개 이상 들어가는 수
 */
public class MovieDirectorShawm {

	private final int input;

	private static String answer = "666";

	MovieDirectorShawm(int input) {
		this.input = input;
	}

	public int getAnswer() {
		int times = 0;

		while (times != input) {
			if (answer.contains("666")) {
				if (times + 1 == input) {
					break;
				}
				times++;
			}
			answer = String.valueOf(Integer.parseInt(answer) + 1);
		}

		return Integer.parseInt(answer);
	}
}