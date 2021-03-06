package backtracking;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2580 {
	public static int board[][] = new int[9][9];;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());

			}
		}

		back(0, 0);

	}

	public static void back(int row, int col) {
		if (col == 9) {

			back(row + 1, 0);

			return;
		}
		if (row == 9) {
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
			System.exit(0);

		}

		if (board[row][col] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibleNum(row, col, i)) {
					board[row][col] = i;

					back(row, col + 1);

				}
			}
			board[row][col] = 0;// 다시 초기화
			return;
		}

		back(row, col + 1);

	}

	public static boolean possibleNum(int row, int col, int value) {
		for (int i = 0; i < 9; i++) {
			if (board[row][i] == value) {
				return false;
			}

		}
		for (int i = 0; i < 9; i++) {// 가로
			if (board[i][col] == value) {
				return false;
			}
		}

		int firstrow = (row / 3) * 3;
		int firstcol = (col / 3) * 3;

		for (int i = firstrow; i < firstrow + 3; i++) {
			for (int j = firstcol; j < firstcol + 3; j++) {
				if (board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}

}
