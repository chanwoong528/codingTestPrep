package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2206 {
	static boolean visited[][][];
	static int graph[][];
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static int m;
	static int n;
	static int result = Integer.MAX_VALUE;

	public static class Pos {
		int x;
		int y;
		int count;
		int drill;

		Pos(int y, int x, int count, int drill) {
			this.y = y;
			this.x = x;
			this.count = count;
			this.drill = drill;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();

		graph = new int[n][m];
		visited = new boolean[2][n][m];

		sc.nextLine();

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					graph[i][j] = 1;

				}
			}
		} // -----------------input----------------------
		bfs();

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < m; j++) {

				System.out.print(graph[i][j]);
			}
			System.out.println();
		}

	}

	static void bfs() {
		Queue<Pos> q = new LinkedList();
		q.offer(new Pos(0, 0, 1, 0));

		visited[0][0][0] = true;
		visited[1][0][0] = true;
		while (!q.isEmpty()) {
			Pos cur = q.poll();

			if (cur.y == n - 1 && cur.x == m - 1) {
				System.out.println(cur.count);
				return;

			}
			for (int i = 0; i < 4; i++) {
				int nextY = cur.y + dy[i];
				int nextX = cur.x + dx[i];

				if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < m) {

					if (graph[nextY][nextX] == 1) {// wall
						if (visited[1][nextY][nextX] == false && cur.drill == 0) {

							// graph[nextY][nextX] =cur.count;
							q.offer(new Pos(nextY, nextX, cur.count + 1, 1));
							visited[1][nextY][nextX] = true;
						}
					} else { //graph[nextY][nextX] == 0
						if (visited[cur.drill][nextY][nextX] == false) {
							q.offer(new Pos(nextY, nextX, cur.count + 1, cur.drill));
							visited[cur.drill][nextY][nextX] = true;
							// graph[nextY][nextX] =cur.count;

						}
					}

				}

			}
		}
		System.out.println(-1);
	}

}
