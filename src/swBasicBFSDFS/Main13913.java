package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main13913 {
	static class Node {
		public Node prev;
		public int val;

		public Node(int val, Node prev) {
			this.prev = prev;
			this.val = val;
		}

	}

	public static StringBuilder sb = new StringBuilder();
	public static int[] map;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		map = new int[100001];
		int curPos = Integer.parseInt(st.nextToken());
		int goalPos = Integer.parseInt(st.nextToken());
		bfs(curPos, goalPos);

	}

	public static void bfs(int cur, int goal) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(cur, null));
		map[cur] = 1;

		while (!q.isEmpty()) {
			Node now = q.poll();
			if (now.val == goal) {

				System.out.println(map[goal] - 1);
				recur(now);
				System.out.println(sb);
				break;
			}
			if (now.val * 2 <= 100000 && map[now.val * 2] == 0) {
				q.add(new Node(now.val * 2, now));
				map[now.val * 2] = map[now.val] + 1;

			}
			if (now.val - 1 >= 0
					&& (map[now.val - 1] == 0 || map[now.val + 1] > 0 && map[now.val - 1] > map[now.val] + 1)) {
				q.add(new Node(now.val - 1, now));
				map[now.val - 1] = map[now.val] + 1;

			}
			if (now.val + 1 <= 100000
					&& (map[now.val + 1] == 0 || map[now.val + 1] > 0 && map[now.val + 1] > map[now.val] + 1)) {
				q.add(new Node(now.val + 1, now));
				map[now.val + 1] = map[now.val] + 1;

			}

		}

	}

	public static void recur(Node p) {
		if (p.prev != null) {
			recur(p.prev);
		}
		sb.append(p.val).append(" ");

	}

}
