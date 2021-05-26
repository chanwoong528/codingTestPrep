package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main1261 {
	static class Point implements Comparable<Point> {
		public int row;
		public int col;
		public int count;

		public Point(int row, int col, int count) {
			this.row = row;
			this.col = col;
			this.count = count;

		}

		@Override
		public int compareTo(Point o) {
			return count - o.count;
		}
	}

	public static int map[][];
	public static boolean visited[][];
	public static int dr[] = { 0, 0, 1, -1 };
	public static int dc[] = { 1, -1, 0, 0 };
	public static int n;
	public static int m;
	public static int breakWall;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

		
		map = new int[n + 1][m + 1];
		visited = new boolean[n + 1][m + 1];
		for (int i = 1; i <= n; i++) {
			String str = br.readLine();
			for (int j = 1; j <= m; j++) {
				map[i][j] = Character.getNumericValue(str.charAt(j - 1));

			}
		}

		bfs(1, 1);
		System.out.println(breakWall);

	}

	public static void bfs(int r, int c) {
		PriorityQueue<Point> q = new PriorityQueue<>();
		q.add(new Point(r, c, 0));
		visited[r][c] = true;

		int nextR;
		int nextC;
		while (!q.isEmpty()) {
			Point now = q.poll();
			if (now.row == n && now.col == m) {
				breakWall = now.count;
				
				break;
			}
			for (int i = 0; i < 4; i++) {
				nextR = now.row + dr[i];
				nextC = now.col + dc[i];
				if (nextR > 0 && nextC > 0 && nextR <= n && nextC <= m) {
					if (map[nextR][nextC] == 0 && visited[nextR][nextC] == false) {
						visited[nextR][nextC] = true;
						q.add(new Point(nextR, nextC, now.count));
					}
					if (map[nextR][nextC] == 1 && visited[nextR][nextC] == false) {
						visited[nextR][nextC] = true;
						q.add(new Point(nextR, nextC, now.count + 1));

					}

				}

			}

		}

	}

}
