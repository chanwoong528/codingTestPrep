package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1260 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		int root = sc.nextInt();
		ArrayList<ArrayList<Integer>> graph = new <ArrayList<Integer>>ArrayList();

		for (int i = 1; i <= n + 1; i++) {
			graph.add(new <Integer>ArrayList()); // ³ëµå °¹¼ö
		}
		for (int i = 0; i < e; i++) {

			int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			graph.get(e1).add(e2);
			graph.get(e2).add(e1);

		}
		boolean[] visited = new boolean[n + 1];
		

		for (int i = 1; i < n + 1; i++) {
			Collections.sort(graph.get(i));

		
		}
		dfs(graph, visited, root);
		for (int i = 1; i < n + 1; i++) {
			visited[i] = false;
		}
		System.out.println();
		bfs(graph, visited, root);
		// System.out.println(graph.get(root).toString());
	}

	static void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int root) {
		Queue<Integer> q = new LinkedList<>();
		q.add(root);
		visited[root] = true;
		while (!q.isEmpty()) {
			root = q.poll();
			System.out.print(root+" ");

			for (int i = 0; i < graph.get(root).size(); i++) {
				if (visited[graph.get(root).get(i)] == false) {
					q.add(graph.get(root).get(i));
					visited[graph.get(root).get(i)] = true;
				}
			}
		}

	}

	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int root) {

		if (visited[root] == true) {
			return;
		}
		System.out.print(root+" ");
		visited[root] = true;

		for (int i = 0; i < graph.get(root).size(); i++) {
			if (visited[graph.get(root).get(i)] == false) {
				dfs(graph, visited, graph.get(root).get(i));
			}
		}

	}

}
