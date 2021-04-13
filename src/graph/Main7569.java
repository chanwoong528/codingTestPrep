package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7569 {

	static boolean visited[][][];
	static int graph[][][];
	static int[] dx = { 1, -1, 0, 0, 0, 0 };
	static int[] dy = { 0, 0, 1, -1, 0, 0 };
	static int[] dz = { 0, 0, 0, 0, 1, -1 };
	static int row;
	static int col;
	static int h;
	static int zeros;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();
		h = sc.nextInt();
		graph = new int[col][row][h];
		visited = new boolean[col][row][h];
		sc.nextLine();
		zeros = h * col * row;
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < col; i++) {

				for (int j = 0; j < row; j++) {

					graph[i][j][k] = sc.nextInt();
					if (graph[i][j][k] != 0) {
						zeros--;
					}

				}
			}
		}
		int max = bfs();

		if (zeros == 0) {
			System.out.println(max - 1);

		} else {
			System.out.println(-1);
		}

		for (int k = 0; k < h; k++) {
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
					System.out.print(graph[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

	static int bfs() {
		Queue<int[]> q = new LinkedList<>();
		int max = 1;
		for (int k = 0; k < h; k++) {
			for (int i = 0; i < col; i++) {

				for (int j = 0; j < row; j++) {
					if (graph[i][j][k] == 1) {

						q.add(new int[] { i, j, k });
					}

				}
			}
		}
		while (!q.isEmpty()) {
			int[] now = q.poll();
			visited[now[0]][now[1]][now[2]] = true;

	
				for (int i = 0; i < dx.length; i++) {
					int ���� = now[0] + dy[i];
					int ���� = now[1] + dx[i];
					int �е� = now[2] + dz[i];

					if (���� >= 0 && ���� >= 0 && ���� < row && ���� < col && �е� >= 0 && �е� < h) {
						if (graph[����][����][�е�] == 0 && visited[����][����][�е�] == false) {
							q.add(new int[] { ����, ����, �е� });
							visited[����][����][�е�] = true;
							graph[����][����][�е�] = graph[now[0]][now[1]][now[2]] + 1;

							if (max < graph[����][����][�е�]) {
								max = graph[����][����][�е�];
							}
							zeros--;
						}

					}

				}
			}

		

		return max;

	}
}
