package solutions;

/**
 * Created by ohdonggeon on 2020/03/17 8:20 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/2798
 * Desc : 카드의 합이 21을 넘지 않는 한도 내에서, 카드의 합을 최대한 크게 만드는 값을 출력하시오
 * Input : 카드의 갯수, 한도 값, 카드에 쓰여져 있는 수
 * Output : 카드를 선택해서 한도 내 가장 큰 숫자
 */
public class Blackjack {

	private static final int PICK_NUMBER = 3;

	private final int cardSize;
	private final int limit;
	private final int[] cards;

	private static int answer;
	private static int value;

	Blackjack(int cardSize, int limit, int[] cards) {
		this.cardSize = cardSize;
		this.limit = limit;
		this.cards = cards;
	}

	public int getAnswer() {
		//getAnswer(0, 0, 0, new boolean[cardSize]);
		combination(0, 0);
		return answer;
	}

	private void combination(int index, int selected) {
		if(selected == PICK_NUMBER) {
			if(value <= limit) {
				answer = Math.max(answer, value);
			}
			return;
		}

		if(index == cardSize) {
			return;
		}

		value += cards[index];
		combination(index + 1, selected + 1);
		value -= cards[index];
		combination(index + 1, selected);
	}

	private void getAnswer(int value, int cur, int pick, boolean[] visited) {
		if(value > limit || pick > PICK_NUMBER) {
			return;
		}

		if(pick == PICK_NUMBER) {
			answer = Math.max(answer, value);
		}

		for(int index = cur; index < cardSize; index++) {
			if(visited[index]) {
				return;
			}
			value += cards[index];
			pick++;
			visited[index] = true;
			getAnswer(value, index + 1, pick, visited);
			value -= cards[index];
			pick--;
			visited[index] = false;
		}
 	}
}