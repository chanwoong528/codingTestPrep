package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main14226 {
	public static boolean emo[][];

	static class Emoticon {
		public int screen;
		public int clipB;
		public int time;

		public Emoticon(int s, int c, int t) {
			this.screen = s;
			this.clipB = c;
			this.time = t;

		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int curNum = 1;
		int goalNum = Integer.parseInt(br.readLine());
		emo = new boolean[goalNum + 1][goalNum + 1];
		bfs(goalNum);
	}

	public static void bfs(int goal) {

		Queue<Emoticon> q = new LinkedList<>();
		q.add(new Emoticon(2, 1, 2));
		while (!q.isEmpty()) {
			Emoticon cur = q.poll();
			if (cur.screen == goal) {

				System.out.println(cur.time);
				return;
			}
			// 복사하고 +1
			if (emo[cur.screen][cur.screen] == false) {
				emo[cur.screen][cur.screen] = true;
				q.add(new Emoticon(cur.screen, cur.screen, cur.time + 1));
			}
			if (cur.screen + cur.clipB <= goal && emo[cur.screen + cur.clipB][cur.clipB] == false) {// 가지고있는거 붙이기 +1
				emo[cur.screen + cur.clipB][cur.clipB] = true;
				q.add(new Emoticon(cur.screen + cur.clipB, cur.clipB, cur.time + 1));
			}
			if (cur.screen - 1 >= 0 && emo[cur.screen - 1][cur.clipB] == false) {// 지우기 +1
				emo[cur.screen - 1][cur.clipB] = true;
				q.add(new Emoticon(cur.screen - 1, cur.clipB, cur.time + 1));
			}

		}

	}

}
