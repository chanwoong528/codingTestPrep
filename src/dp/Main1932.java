package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1932 {
	public static int[][] tri;
	public static Integer[][] memo;
	public static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		tri = new int[n][n];
		memo = new Integer[n][n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < i + 1; j++) {
				tri[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		for (int i = 0; i < n; i++) {
			memo[n - 1][i] = tri[n - 1][i];
		}
		System.out.println(find(0, 0));
	}

	static int find(int d, int index) {
		if (d == n - 1) {
			return memo[d][index];
		}
		if (memo[d][index] == null) {
			memo[d][index] = Math.max(find(d + 1, index), find(d + 1, index + 1)) + tri[d][index];
		}

		return memo[d][index];
	}

}
