package divideNconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2630 {
	public static int board[][];
	public static int whiteNum;
	public static int blueNum;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {

				board[i][j] = Integer.parseInt(st.nextToken());
			}

		}
		checkNumPaper(0, 0, n);

		System.out.println(whiteNum);
		System.out.println(blueNum);

		br.close();

	}

	public static void checkNumPaper(int row, int col, int size) {
		if (checkColor(row, col, size) == true) {
			if (board[row][col] == 0) {
				whiteNum++;
			} else {
				blueNum++;
			}
			return;
		}
		int newS = size / 2;

		checkNumPaper(row, col, newS);
		checkNumPaper(row + newS, col, newS);
		checkNumPaper(row, col + newS, newS);
		checkNumPaper(row + newS, col + newS, newS);

	}

	public static boolean checkColor(int row, int col, int size) {
		int color = board[row][col]; // 0 white;

		for (int i = row; i < row + size; i++) {
			for (int j = col; j < col + size; j++) {
				if (board[i][j] != color) {
					return false;
				}
			}
		}
		return true;

	}

}
