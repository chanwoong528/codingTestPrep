package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1012 {
	static int graph[][];
	static boolean visited[][];
	static int 가로;
	static int 세로;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int test = 0; test < t; test++) {
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			가로 = sc.nextInt();
			세로 = sc.nextInt();
			
			graph = new int[세로][가로];
			visited = new boolean[세로][가로];
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				graph[y][x] = 1;

			}

			for (int i = 0; i < 세로; i++) {
				for (int j = 0; j < 가로; j++) {
					if (visited[i][j] == false && graph[i][j] == 1) {
						arrList.add(dfs(i, j));
					}
				}

			}

			
			Collections.sort(arrList);
			
			System.out.println(arrList.size());
		}
		

	}

	static int dfs(int y, int x) {
		int count = 0;
		if (visited[y][x] == true) {
			return 0;
		}

		visited[y][x] = true;
		if (x < (가로 - 1) && visited[y][x + 1] == false && graph[y][x + 1] == 1) {
			count = dfs(y, x + 1);
		}
		if (x > 0 && visited[y][x - 1] == false && graph[y][x - 1] == 1) {
			count = dfs(y, x - 1);
		}
		if (y < (세로 - 1) && visited[y + 1][x] == false && graph[y + 1][x] == 1) {
			count = dfs(y + 1, x);
		}
		if (y > 0 && visited[y - 1][x] == false && graph[y - 1][x] == 1) {
			count = dfs(y - 1, x);
		}
		return count;

	}

}
