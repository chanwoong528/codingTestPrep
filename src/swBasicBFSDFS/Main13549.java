package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main13549 {

	public static int map[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		map = new int[100001];
		int curPos = Integer.parseInt(st.nextToken());
		int goalPos = Integer.parseInt(st.nextToken());

		bfs(curPos, goalPos);

		for (int i = 0; i <= goalPos; i++) {

			System.out.print(map[i] + " ");

		}
	}

	public static void bfs(int cur, int goal) {
		Queue<Integer> q = new LinkedList<>();
		q.add(cur);
		map[cur] = 1;
		while (!q.isEmpty()) {
			int now = q.poll();
			if (cur == goal) {
				break;
			}
			if (now * 2 <= 100000 && map[now * 2] == 0) {
				q.add(now * 2);
				map[now * 2] = map[now];
			}
			if (now - 1 >= 0 && (map[now - 1] == 0 || map[now + 1] > 0 && map[now - 1] > map[now] + 1)) {
				q.add(now - 1);
				map[now - 1] = map[now] + 1;
			}
			if (now + 1 <= 100000 && (map[now + 1] == 0 || map[now + 1] > 0 && map[now + 1] > map[now] + 1)) {
				q.add(now + 1);
				map[now + 1] = map[now] + 1;
			}
			

		}
		System.out.println(map[goal] - 1);
	}

}
