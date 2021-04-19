package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1967 {
	static int max = 0;
	static int index = 0;
	static int n;
	static ArrayList<ArrayList<Edge>> tree;
	static boolean[] visited;

	public static class Edge {
		int to;
		int weight;

		public Edge(int to, int weight) {
			this.to = to;
			this.weight = weight;
		}

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		tree = new ArrayList<>();
		for (int i = 1; i <= n + 1; i++) {
			tree.add(new ArrayList<>());

		}
		for (int i = 1; i < n; i++) {// to avoid vertex of '0'
			StringTokenizer st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int weight = Integer.parseInt(st.nextToken());
			Edge e1 = new Edge(to, weight);
			Edge e2 = new Edge(from, weight);
			tree.get(from).add(e1);
			tree.get(to).add(e2);

		}

		visited = new boolean[n + 1];
		dfs(1, 0);
		visited = new boolean[n + 1];
		dfs(index, 0);
		System.out.println(max);

	}

	public static void dfs(int node, int weight) {

		if (weight > max) {
			max = weight;
			index = node;

		}
		visited[node] = true;

		for (int i = 0; i < tree.get(node).size(); i++) {

			if (visited[tree.get(node).get(i).to] == false) {
				visited[tree.get(node).get(i).to] = true;
				dfs(tree.get(node).get(i).to, tree.get(node).get(i).weight + weight);
			}
		}
	}
}
