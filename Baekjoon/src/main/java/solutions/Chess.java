package solutions;

import java.io.*;
import java.util.StringTokenizer;

/**
 * Created by ohdonggeon on 2020/03/23 7:40 PM
 * Dankook UNIV. Computer Science
 * Source : https://www.acmicpc.net/problem/1018
 * Desc : 8*8 체스판을 만드려면 다시 칠해야 하는 정사각형의 최소 갯수를 구하시오.
 * Input : N, M 크기의 보드 (8 <= N, M <= 50)
 * Output : 다시 칠해야하는 정사각형의 최소 갯수
 */
public class Chess {

	private char[][] board;

	private final int row;
	private final int col;

	Chess(char[][] board, int row, int col) {
		this.board = board;
		this.row = row;
		this.col = col;
	}

	public int getAnswer() {

		return 0;
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

		int row = Integer.parseInt(tokenizer.nextToken());
		int col = Integer.parseInt(tokenizer.nextToken());

		char[][] board = new char[row][col];

		for(int i = 0; i < row; i++) {
			String temp = reader.readLine();
			for(int j = 0; j < col; j++) {
				board[i][j] = temp.charAt(j);
			}
		}

		Chess chess = new Chess(row, col, board);
		System.out.println(chess.getAnswer());
	}
}
