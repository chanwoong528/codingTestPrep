package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main1167 {
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
		for (int i = 1; i <= n+1; i++) {
			tree.add(new ArrayList<>());
			
		}
		for (int i = 1; i <= n; i++) {// to avoid vertex of '0'
			StringTokenizer st = new StringTokenizer(br.readLine());
			int node = Integer.parseInt(st.nextToken());
			while (true) {
				int to = Integer.parseInt(st.nextToken());
				if (to == -1)
					break;
				int weight = Integer.parseInt(st.nextToken());

				Edge e = new Edge(to, weight);
				tree.get(node).add(e);

			}

		}
	
		visited = new boolean[n + 1];
		dfs(1, 0);
		visited = new boolean[n + 1];
		dfs(index, 0);

		System.out.println(max);
	}

	public static void dfs(int node, int weight) {
		if (visited[node]==true)return; 
		
		if (weight > max) {
			max = weight;
			index = node;
		}
		visited[node] = true;

		for (int i = 0; i < tree.get(node).size(); i++) {

			//if (visited[tree.get(node).get(i).to] == false) {
				//visited[tree.get(node).get(i).to] = true;
				dfs(tree.get(node).get(i).to, tree.get(node).get(i).weight + weight);
			//}
		}
	}

}
