package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by donggeon on 2020/03/06
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/11729
 * Desc : 하노이의 탑 최소 옮긴 횟수와 이동 경로를 출력하여라
 * Input : 원판의 갯수
 */
public class Solution11729 {

	private static final int NUM_POLE = 3;

	private int[][] poles;
	private int plate = 0;

	private int answer = 0;
	private List<String> routes = new ArrayList<>();

	public Solution11729(int input) {
		plate = input;
		poles = new int[NUM_POLE][input];
		answer = 0;

		for (int row = 0; row < plate; row++) {
			poles[0][row] = row + 1;
		}
	}

	public void printAnswerByStack() {
		getAnswerByStack(0, 1, 2, plate);
		System.out.println(answer);
		for (String route : routes) {
			System.out.println(route);
		}
	}

	public void printAnswerByRF() {
		getAnswerByRF(0, 1, 2, plate);
		System.out.println(answer);
		for (String route : routes) {
			System.out.println(route);
		}
	}

	private void getAnswerByStack(int from, int by, int to, int n) {

		Stack<Integer> stack = new Stack<>();

		while (true) {
			while (n > 1) {
				stack.push(to);
				stack.push(by);
				stack.push(from);
				stack.push(n);
				n--;
				stack.push(to);
				to = by;
				by = stack.pop();
			}

			answer++;
			storeRoute(from, to);

			if (!stack.isEmpty()) {
				n = stack.pop();
				from = stack.pop();
				by = stack.pop();
				to = stack.pop();

				answer++;
				storeRoute(from, to);

				n--;
				stack.push(from);
				from = by;
				by = stack.pop();
			} else {
				break;
			}
		}
	}

	private void getAnswerByRF(int from, int by, int to, int n) {
		if (n == 1) {
			answer++;
			storeRoute(from, to);
			return;
		}

		getAnswerByRF(from, to, by, n - 1);
		answer++;
		storeRoute(from, to);
		getAnswerByRF(by, from, to, n - 1);
	}

	private void storeRoute(int from, int to) {
		String route = (from + 1) + " " + (to + 1);
		routes.add(route);
	}
}