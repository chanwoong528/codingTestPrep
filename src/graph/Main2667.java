package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2667 {
	static int graph[][];
	static boolean visited[][];
	static int n;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		graph = new int[n][n];
		visited = new boolean[n][n];

		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			for (int j = 0; j < n; j++) {
				if (str.charAt(j) == '1') {

					graph[i][j] = 1;
				}
			}

		}
		//----------------------------------------------------------
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == false && graph[i][j] == 1) {
					arrList.add(dfs(i, j));
				}

			}
		}
		Collections.sort(arrList);
		System.out.println(arrList.size());
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));

		}

	}

	static int dfs(int x, int y) {
		int count = 1;
		if (visited[x][y] == true) {
			return 0;
		}
		visited[x][y] = true;
		if (x < (n - 1) && visited[x + 1][y] == false && graph[x + 1][y] == 1) {
			count = count + dfs(x + 1, y);
		}
		if (x > 0 && visited[x - 1][y] == false && graph[x - 1][y] == 1) {
			count = count + dfs(x - 1, y);
		}
		if (y < (n - 1) && visited[x][y + 1] == false && graph[x][y + 1] == 1) {
			count = count + dfs(x, y + 1);
		}
		if (y > 0 && visited[x][y - 1] == false && graph[x][y - 1] == 1) {
			count = count + dfs(x, y - 1);
		}
		return count;

	}

}
