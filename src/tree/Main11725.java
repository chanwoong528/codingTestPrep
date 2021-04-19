package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main11725 {
	public static boolean[] visited;
	public static int[] parent;
	public static ArrayList<ArrayList<Integer>> graph;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = n - 1;
		graph = new <ArrayList<Integer>>ArrayList();
		visited = new boolean[n + 1];
		parent = new int[n + 1];
		for (int i = 1; i <= n + 1; i++) {
			graph.add(new <Integer>ArrayList()); // ³ëµå °¹¼ö
		}
		for (int i = 1; i <= e; i++) {
			int e1 = sc.nextInt();
			int e2 = sc.nextInt();
			graph.get(e1).add(e2);
			graph.get(e2).add(e1);

		}
	
		bfs(1);
		for (int i = 2; i <= n; i++) {
			System.out.println(parent[i]);
		}
	}

	

	static void bfs(int node) {
		Queue<Integer> q = new LinkedList<>();
		q.add(node);
		visited[node] = true;
		while (!q.isEmpty()) {
			node = q.poll();
			for (int i = 0; i < graph.get(node).size(); i++) {
				if (visited[graph.get(node).get(i)] == false) {
					parent[graph.get(node).get(i)] = node;

					q.add(graph.get(node).get(i));
					visited[graph.get(node).get(i)] = true;
				}
			}
		}

	}

}
