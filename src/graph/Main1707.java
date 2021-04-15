package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1707 {
	static int[] visited; // 1 == red, 0== not visited, -1 blue;
	static ArrayList<ArrayList<Integer>> graph;
	static boolean check;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {
			int n = sc.nextInt();
			int e = sc.nextInt();
			graph = new ArrayList();
			visited = new int[n + 1];

			for (int i = 0; i < n + 1; i++) {
				graph.add(new ArrayList<Integer>()); // ³ëµå °¹¼ö
				visited[i] = 0;
				check = true;
			}
			for (int i = 0; i < e; i++) {

				int e1 = sc.nextInt();
				int e2 = sc.nextInt();
				graph.get(e1).add(e2);
				graph.get(e2).add(e1);

			}

			for (int i = 1; i < n + 1; i++) {
				if (check == false) {
					break;
				}
				if (visited[i] == 0) {
					bfs(i, 1);
				}

			}
			System.out.println(check ? "YES" : "NO");
		}

	}

	static void bfs(int start, int color) {
		Queue<Integer> q = new LinkedList<>();
		q.add(start);
		visited[start] = color; // !=0 visited
		while (!q.isEmpty() && check) {
			int node = q.poll();
			for (int i = 0; i < graph.get(node).size(); i++) {
				if (visited[graph.get(node).get(i)] == 0) {
					q.add(graph.get(node).get(i));
					visited[graph.get(node).get(i)] = visited[node] * -1;
				} else if (visited[node] + visited[graph.get(node).get(i)] != 0) {
					// blue ==-1 red ==1 red +blue ==0 else not bigraph
					check = false;
					return;
				}

			}
		}

	}
}
