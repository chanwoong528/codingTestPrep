package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main3055 {
	static class Point {
		public int row;
		public int col;
		public int turn;

		public Point(int r, int c, int t) {
			this.row = r;
			this.col = c;
			this.turn = t;
		}
	}

	public static char map[][];
	public static boolean visitedB[][];

	public static int r;
	public static int c;
	public static int dr[] = { 0, 0, 1, -1 };
	public static int dc[] = { 1, -1, 0, 0 };
	public static Queue<Point> qB = new LinkedList<>();
	public static Queue<Point> qW = new LinkedList<>();
	public static int count;
	public static int goalR;
	public static int goalC;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new char[r][c];
		visitedB = new boolean[r][c];

		for (int i = 0; i < r; i++) {
			String str = br.readLine();
			for (int j = 0; j < c; j++) {
				char temp = str.charAt(j);
				map[i][j] = temp;
				if (temp == 'S') {
					qB.add(new Point(i, j, 0));
					visitedB[i][j] = true;
				}
				if (temp == '*') {
					qW.add(new Point(i, j, 0));
				}
				if (temp == 'D') {
					goalR = i;
					goalC = j;
				}
			}
		}
	
		bfsB();
		System.out.println(count == 0 ? "KAKTUS" : count);
	}

	public static void bfsW(int count) {

		while (!qW.isEmpty()) {
			if (qW.peek().turn == count) {
				Point nowW = qW.poll();
				for (int i = 0; i < 4; i++) {
					int nextR = nowW.row + dr[i];
					int nextC = nowW.col + dc[i];
					if (nextR >= 0 && nextC >= 0 && nextR < r && nextC < c) {
						if ((map[nextR][nextC] != 'X' && map[nextR][nextC] != 'D' && map[nextR][nextC] != '*')) {
							map[nextR][nextC] = '*';
							qW.add(new Point(nextR, nextC, nowW.turn + 1));

						}
					}

				}

			} else {
				break;
			}
		}

	}

	public static void bfsB() {
		int cnt = -1;
		
		while (!qB.isEmpty()) {

			// System.out.println("cnt: " + cnt);
			Point nowB = qB.poll();
			if (goalC == nowB.col && goalR == nowB.row) {
				count = nowB.turn;
			
				return;
			}
			if (nowB.turn > cnt) {
				cnt = nowB.turn;
				bfsW(cnt);
			}
			for (int i = 0; i < 4; i++) {
				int nextR = nowB.row + dr[i];
				int nextC = nowB.col + dc[i];

				if (nextR >= 0 && nextC >= 0 && nextR < r && nextC < c) {

					if ((map[nextR][nextC] == 'D' || map[nextR][nextC] == '.') && visitedB[nextR][nextC] == false) {
						visitedB[nextR][nextC] = true;

						qB.add(new Point(nextR, nextC, nowB.turn + 1));
					}
				}

			}
		}
	}

}