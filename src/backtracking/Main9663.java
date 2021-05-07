package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9663 {
	public static int count;
	public static int n;
	public static boolean[][] board;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		board = new boolean[n][n];
		dfs(0);
		System.out.println(count);
	}

	public static void dfs(int start) {
		if (start == n) {
			count++;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(board[i][j] ? 1 : 0);
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < n; i++) {

			if (canLand(start, i)) {

				board[i][start] = true;
				dfs(start + 1);
				board[i][start] = false;

			}

		}
	}

	public static boolean canLand(int x, int y) {

		for (int i = 0; i < n; i++) {
			if (i <= y && board[i][x] == true) {
				return false;
			}
			if (i <= x && board[y][i] == true) {
				return false;
			}
			if ((x + i < n && y + i < n) && (board[y + i][x + i] == true)) {
				return false;
			}
			if ((x - i >= 0 && y + i < n) && (board[y + i][x - i] == true)) {
				return false;
			}
			if ((x + i < n && y - i >= 0) && (board[y - i][x + i] == true)) {
				return false;
			}
			if ((x - i >= 0 && y - i >= 0) && (board[y - i][x - i] == true)) {
				return false;
			}
		}
		return true;

	}

}
