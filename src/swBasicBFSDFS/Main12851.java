package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main12851 {

	public static int map[];
	public static int count;
	public static int min = Integer.MAX_VALUE;
	public static int dx[] = { -1, 1, 2 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		map = new int[100001];

		int curPos = Integer.parseInt(st.nextToken());
		int goalPos = Integer.parseInt(st.nextToken());

		if (curPos == goalPos) {
			System.out.println(0);
			System.out.println(1);
		} else {
			bfs(curPos, goalPos);

			System.out.println(min);

			System.out.println(count);

		}
	}

	public static void bfs(int c, int g) {
		Queue<Integer> q = new LinkedList<>();
		q.add(c);
		map[c] = 1;

		while (!q.isEmpty()) {
			int cur = q.poll();
			if (min < map[cur]) {
				return;
			}
			for (int i = 0; i < 3; i++) {
				int newCur;
				if (i == 2) {
					newCur = cur * dx[i];
				} else {
					newCur = cur + dx[i];
				}

				if (newCur >= 0 && newCur <= 100000) {
					if (newCur == g) {
						count++;
						min = map[cur];
					}
					if (map[newCur] == 0 || map[newCur] == map[cur] + 1) {
						q.add(newCur);
						map[newCur] = map[cur] + 1;
					}
				}

			}

		}

	}

}
