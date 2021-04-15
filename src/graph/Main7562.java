package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main7562 {
	static boolean visited[][];
	static int graph[][];
	static int[] dx = { 2, 1, -1, -2, -2, -1, 1, 2 };
	static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static int n;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int k =0; k< t; k++) {
			n = sc.nextInt();
			graph = new int[n][n];
			visited = new boolean[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					graph[i][j] = 0;
				}
			}
			int startX = sc.nextInt();
			int startY = sc.nextInt();
			int endX = sc.nextInt();
			int endY = sc.nextInt();

			
			bfs(startX, startY, endX, endY);
		}
		
	

	}

	static void bfs(int starX, int startY, int endX, int endY) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] { startY, starX });
		while (!q.isEmpty()) {
			int[] cur = q.poll();
			visited[cur[0]][cur[1]] = true;
			
			if(cur[0]==endY&&cur[1]==endX) {
				System.out.println(graph[cur[0]][cur[1]]);
				break; 
			}
			for (int i = 0; i < dx.length; i++) {
				int nextY = cur[0] + dy[i];
				int nextX = cur[1] + dx[i];
				
				if (nextY >= 0 && nextY < n && nextX >= 0 && nextX < n) {
					if (graph[nextY][nextX] == 0 && visited[nextY][nextX] == false) {
						q.add(new int[] { nextY, nextX });
						visited[nextY][nextX] = true;
						graph[nextY][nextX] = graph[cur[0]][cur[1]] + 1;
					}
				}

			}

		}

	}

}
