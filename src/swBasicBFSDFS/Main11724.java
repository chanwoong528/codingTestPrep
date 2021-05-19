package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11724 {
	public static boolean visited[];
	public static ArrayList<ArrayList<Integer>> graph = new <ArrayList<Integer>>ArrayList();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());

		for (int i = 0; i <= n; i++) {
			graph.add(new <Integer>ArrayList()); // ³ëµå °¹¼ö
		}
		visited = new boolean[n + 2];
		for (int i = 0; i < e; i++) {
			st = new StringTokenizer(br.readLine());
			int e1 = Integer.parseInt(st.nextToken());
			int e2 = Integer.parseInt(st.nextToken());
			graph.get(e1).add(e2);
			graph.get(e2).add(e1);

		}
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (visited[i] == false) {
				dfs(i);
				count++;
			}
		}
		System.out.println(count);
	}

	public static void dfs(int start) {
		visited[start] = true;
		for (int i = 0; i < graph.get(start).size(); i++) {
			if (visited[graph.get(start).get(i)] == false) {
				dfs(graph.get(start).get(i));
			}
		}

	}

}
