package solutions;

import java.util.Arrays;

/**
 * Created by ohdonggeon on 2020/04/01 8:57 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/9663
 * Desc : N X N 의 체스판에서 퀸 N개를 서로 공격 할 수 없게 놓는 경우의 수를 출력한다.
 * Input : N (1 <= N < 15)
 * Output : 서로 공격 할 수 없는 Queen 의 모든 경우의 수
 */
public class Queen {

	private static int QUEEN_EXIST = 1;
	private static int QUEEN_NOT_EXIST = 0;
	private static int SIZE;

	private static int[][] chessboard;
	private static int answer = 0;

	private Queen() {

	}

	public static int getSolution(int queen) {
		chessboard = new int[queen][queen];
		SIZE = queen;

		getNumberOfCases(0, 0, 0);

		return answer;
	}

	private static void getNumberOfCases(int queen, int row, int col) {
		if (queen == SIZE) {
			System.out.println(Arrays.deepToString(chessboard));
			answer++;
			return;
		}

		for(int boardRow = row; boardRow < SIZE; boardRow++) {
			for(int boardCol = col; boardCol < SIZE; boardCol++) {
				if(isPossible(boardRow, boardCol)) {
					chessboard[boardRow][boardCol] = QUEEN_EXIST;
					getNumberOfCases(queen + 1, boardRow + 1, boardCol + 1);
					chessboard[boardRow][boardCol] = QUEEN_NOT_EXIST;
				}
			}
		}
	}

	private static boolean isPossible(int row, int col) {
		for(int boardRow = 0; boardRow < SIZE; boardRow++) {
			for(int boardCol = 0; boardCol < SIZE; boardCol++) {
				if(chessboard[boardRow][boardCol] == QUEEN_EXIST) {
					double value = Math.abs((double) (boardCol - col) / (boardRow - row));
					System.out.println(value);
					if(value == 0 || value == 1) {
						System.out.println("false");
						return false;
					}
				}
			}
		}

		return true;
	}
}

class Main {
	public static void main(String[] args) {
		System.out.println(Queen.getSolution(4));
	}
}