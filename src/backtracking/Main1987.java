package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1987 {

	public static char arr[][];

	public static int n;
	public static int m;
	public static boolean visited[];
	public static int max = Integer.MIN_VALUE;
	public static int[] dx = { 0, 0, 1, -1 };
	public static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new char[n][m];
		visited = new boolean[26];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}
		back(0, 0, 1);
		System.out.println(max);

	}

	public static void back(int x, int y, int count) {

		visited[arr[x][y] - 'A'] = true;
		for (int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			if (nextX >= 0 && nextY >= 0 && nextX < n && nextY < m) {
				if (visited[arr[nextX][nextY] - 'A'] == false) {
					back(nextX, nextY, count + 1);
				}
			}

		}
		visited[arr[x][y] - 'A'] = false;
		if (max < count) {
			max = count;
		}
	}

}
