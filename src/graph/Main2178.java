package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main2178 {
	static boolean visited[][];
	static int graph[][];
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int row;
	static int col;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		col = sc.nextInt();
		row = sc.nextInt();
		graph = new int[col][row];
		visited = new boolean[col][row];
		sc.nextLine();

		for (int i = 0; i < col; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '1') {
					graph[i][j] = 1;
				}

			}
		}
		bfs(0, 0);

		System.out.println(graph[col - 1][row - 1]);



	}

	static void bfs(int y, int x) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { y, x });

		while (!q.isEmpty()) {
			int[] now = q.poll();
			visited[y][x] = true;
			for (int i = 0; i < dx.length; i++) {
				int ���� = now[1] + dx[i];
				int ���� = now[0] + dy[i];
				if (���� >= 0 && ���� >= 0 && ���� < row && ���� < col) {
					if (graph[����][����] == 1 && visited[����][����] == false) {
						q.add(new int[] { ����, ���� });
						visited[����][����] = true;
						graph[����][����] = graph[now[0]][now[1]] + 1;
					}

				}

			}

		}

	}

}
