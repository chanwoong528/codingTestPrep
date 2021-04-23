package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1149 {
	public static int[][] memo;
	public static int[][] cost;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		cost = new int[n][3];
		memo = new int[n][3];

		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());
			cost[i][0] = Integer.parseInt(st.nextToken());
			cost[i][1] = Integer.parseInt(st.nextToken());
			cost[i][2] = Integer.parseInt(st.nextToken());

		}
		
		memo[0][0] = cost[0][0];
		memo[0][1] = cost[0][1];
		memo[0][2] = cost[0][2];

		System.out.println(Math.min(paint(n - 1, 0), Math.min(paint(n - 1, 1), paint(n - 1, 2))));
	}

	public static int paint(int n, int color) {// 0 red, 1 green, 2 blue

		if (n >= 0 && memo[n][color] == 0) {
			if (color == 0) {// red

				memo[n][0] = Math.min(paint(n - 1, 1), paint(n - 1, 2)) + cost[n][0];
			} else if (color == 1) {// green
				memo[n][1] = Math.min(paint(n - 1, 0), paint(n - 1, 2)) + cost[n][1];

			} else {// blue
				memo[n][2] = Math.min(paint(n - 1, 0), paint(n - 1, 1)) + cost[n][2];
			}

		}
		return memo[n][color];
	}
}
