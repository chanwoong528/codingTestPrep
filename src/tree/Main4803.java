package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main4803 {
	static ArrayList<ArrayList<Integer>> graph;
	static boolean[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int testCase = 1;
		while (true) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			if (n == 0 && e == 0) {
				break;
			}
			graph = new ArrayList<>();
			for (int i = 0; i <= n; i++) {
				graph.add(new ArrayList<>());
			}

			for (int i = 0; i < e; i++) {
				st = new StringTokenizer(br.readLine());
				int e1 = Integer.parseInt(st.nextToken());
				int e2 = Integer.parseInt(st.nextToken());
				graph.get(e1).add(e2);
				graph.get(e2).add(e1);
			}

			visited = new boolean[n + 1];
			int count = 0;
			for (int i = 1; i <= n; i++) {
				if (visited[i] == false) {
					count = count + isTree(i);
				}
			}

			if (count == 0) {
				System.out.println("Case " + testCase++ + ":" + " No trees.");
			} else if (count == 1) {
				System.out.println("Case " + testCase++ + ":" + " There is one tree.");
			} else {
				System.out.println("Case " + testCase++ + ":" + " A forest of " + count + " trees.");
				}
		}

	}

	public static int isTree(int start) {
		Queue<Integer> q = new LinkedList<>();
		int numNode = 0;
		int numEdge = 0;
		q.add(start);
		visited[start] = true;
		while (!q.isEmpty()) {
			int cur = q.poll();
			numNode = numNode + 1;

			for (int i = 0; i < graph.get(cur).size(); i++) {
				numEdge = numEdge + 1;

				if (visited[graph.get(cur).get(i)] == false) {
					q.add(graph.get(cur).get(i));
					visited[graph.get(cur).get(i)] = true;
				}
			}

		}
		return (numEdge / 2) + 1 == numNode ? 1 : 0;

	}

}
