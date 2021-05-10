package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2580 {
	public static int board[][];
	public static int countZero;

	public static void main(String[] args) throws IOException {
		board = new int[9][9];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
				if (board[i][j] == 0) {
					countZero++;
				}
			}
		}
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		back(0, 0);
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void back(int x, int y) {
		if (x == 9) {
			back(0, y+1);
			return;
		}
		

	
		if (board[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (possibleNum(x, y, i)) {
					board[x][y] = i;
					back(x,y+1);
				}
			}
			board[x][y] = 0;// 다시 초기화
			return;
		}

		back(x, y + 1);

	}

	public static boolean possibleNum(int x, int y, int value) {

		for (int i = 0; i < 9; i++) {// 가로
			if (board[i][y] == value) {
				return false;
			}
		}
		for (int i = 0; i < 9; i++) {
			if (board[x][i] == value) {
				return false;
			}

		}
		int firstX = (x / 3) * 3;
		int firstY = (y / 3) * 3;
		for (int i = firstX; i < firstX + 3; i++) {
			for (int j = firstY; i < firstY + 3; i++) {
				if (board[i][j] == value) {
					return false;
				}
			}
		}
		return true;
	}

}
