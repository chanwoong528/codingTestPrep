package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7576 {
	static boolean visited[][];
	static int graph[][];
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	
	static int row;
	static int col;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		col = sc.nextInt();

		graph = new int[col][row];
		visited = new boolean[col][row];
		sc.nextLine();

		for (int i = 0; i < col; i++) {

			for (int j = 0; j < row; j++) {

				graph[i][j] = sc.nextInt();

			}
		}
		bfs();
		int max = 0;
		boolean flag = false;
		for (int i = 0; i < col; i++) {

			for (int j = 0; j < row; j++) {
				// System.out.print(graph[i][j] +" ");
				if (graph[i][j] > max) {
					max = graph[i][j];
				}
				if (graph[i][j] == 0) {

					flag = true;
					break;
				}
			}
			// System.out.println( );
		}
		System.out.println(flag ? -1 : (max - 1));

	}

	static void bfs() {
		Queue<int[]> q = new LinkedList<>();

		for (int i = 0; i < col; i++) {

			for (int j = 0; j < row; j++) {
				if (graph[i][j] == 1) {

					q.add(new int[] { i, j });
				}

			}
		}
		while (!q.isEmpty()) {
			int[] now = q.poll();
			visited[now[0]][now[1]] = true;
			for (int i = 0; i < dx.length; i++) {
				int 가로 = now[1] + dx[i];
				int 세로 = now[0] + dy[i];
				if (가로 >= 0 && 세로 >= 0 && 가로 < row && 세로 < col) {
					if (graph[세로][가로] == 0 && visited[세로][가로] == false) {
						q.add(new int[] { 세로, 가로 });
						visited[세로][가로] = true;
						graph[세로][가로] = graph[now[0]][now[1]] + 1;
					}

				}

			}

		}

	}
}