package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1012 {
	static int graph[][];
	static boolean visited[][];
	static int ����;
	static int ����;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int test = 0; test < t; test++) {
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			���� = sc.nextInt();
			���� = sc.nextInt();
			
			graph = new int[����][����];
			visited = new boolean[����][����];
			int num = sc.nextInt();
			for (int i = 0; i < num; i++) {
				int x = sc.nextInt();
				int y = sc.nextInt();

				graph[y][x] = 1;

			}

			for (int i = 0; i < ����; i++) {
				for (int j = 0; j < ����; j++) {
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
		if (x < (���� - 1) && visited[y][x + 1] == false && graph[y][x + 1] == 1) {
			count = dfs(y, x + 1);
		}
		if (x > 0 && visited[y][x - 1] == false && graph[y][x - 1] == 1) {
			count = dfs(y, x - 1);
		}
		if (y < (���� - 1) && visited[y + 1][x] == false && graph[y + 1][x] == 1) {
			count = dfs(y + 1, x);
		}
		if (y > 0 && visited[y - 1][x] == false && graph[y - 1][x] == 1) {
			count = dfs(y - 1, x);
		}
		return count;

	}

}
