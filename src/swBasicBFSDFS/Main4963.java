package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main4963 {
	public static boolean visited[][];
	public static int map[][];
	public static int dx[] = { 0, 0, 1, -1, 1, -1, 1, -1 };
	public static int dy[] = { 1, -1, 0, 0, 1, -1, -1, 1 };
	public static int colMap;
	public static int rowMap;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			colMap = Integer.parseInt(st.nextToken());
			rowMap = Integer.parseInt(st.nextToken());
			if (colMap == 0 && rowMap == 0) {
				break;
			}

			map = new int[rowMap][colMap];
			visited = new boolean[rowMap][colMap];
			for (int i = 0; i < rowMap; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < colMap; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int count = 0;
			for (int i = 0; i < rowMap; i++) {
				for (int j = 0; j < colMap; j++) {
					if (visited[i][j] == false && map[i][j] == 1) {
						dfs(i, j);
						count++;
					}

				}

			}
			sb.append(count).append("\n");

		}
		System.out.println(sb);

	}

	public static void dfs(int row, int col) {
		visited[row][col] = true;
		for (int i = 0; i < 8; i++) {
			int newRow = row + dy[i];
			int newCol = col + dx[i];
			if (newRow >= 0 && newCol >= 0 && newRow < rowMap && newCol < colMap && visited[newRow][newCol] == false
					&& map[newRow][newCol] == 1) {

				dfs(newRow, newCol);
			}
		}
	}

}
