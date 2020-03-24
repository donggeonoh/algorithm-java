package solutions;

/**
 * Created by ohdonggeon on 2020/03/23 7:40 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/1018
 * Desc : 8*8 체스판을 만드려면 다시 칠해야 하는 정사각형의 최소 갯수를 구하시오.
 * Input : N, M 크기의 보드 (8 <= N, M <= 50)
 * Output : 다시 칠해야하는 정사각형의 최소 갯수
 */
public class Chess {

	private static final char[][] W_CHESS = {
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'}};

	private static final char[][] B_CHESS = {
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'},
			{'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W'},
			{'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B'}};

	private static final int SIZE_CHESS = 8;
	private static int answer = Integer.MAX_VALUE;

	private final char[][] board;

	private final int row;
	private final int col;

	Chess(char[][] board, int row, int col) {
		this.board = board;
		this.row = row;
		this.col = col;
	}

	public int getAnswer() {
		int rangeRow = row - SIZE_CHESS;
		int rangeCol = col - SIZE_CHESS;

		for (int bRow = 0; bRow <= rangeRow; bRow++) {
			for (int bCol = 0; bCol <= rangeCol; bCol++) {
				int repainted = Math.min(getRepainted(bRow, bCol, W_CHESS), getRepainted(bRow, bCol, B_CHESS));

				if (answer > repainted) {
					answer = repainted;
				}
			}
		}

		return answer;
	}

	private int getRepainted(int row, int col, char[][] chess) {
		int repainted = 0;

		for (int bRow = row, cRow = 0; cRow < SIZE_CHESS; bRow++, cRow++) {
			for (int bCol = col, cCol = 0; cCol < SIZE_CHESS; bCol++, cCol++) {
				if (board[bRow][bCol] != chess[cRow][cCol]) {
					repainted++;
				}
			}
		}

		return repainted;
	}
}