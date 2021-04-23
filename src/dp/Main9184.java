package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main9184 {

	private static int[][][] memo;

	public static void main(String[] args) throws IOException {
		memo = new int[51][51][51];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			if (a == -1 && b == -1 && c == -1) {
				break;
			} else {
				sb.append("w(").append(a).append(", ").append(b).append(", ").append(c).append(") = ")
						.append(w(a, b, c)).append("\n");

			}

		}
		System.out.println(sb);
	}

	public static int w(int a, int b, int c) {
		int result;

		if (inRange(a, b, c) && memo[a][b][c] != 0) {
			return memo[a][b][c];
		}

		else if (a <= 0 || b <= 0 || c <= 0) {
			result = 1;
		} else if (a > 20 || b > 20 || c > 20) {
			result = w(20, 20, 20);
			memo[20][20][20] = result;

		}

		else if (a < b && b < c) {
			result = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
			memo[a][b][c] = result;
		} else {
			result = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
			memo[a][b][c] = result;

		}
		return result;
	}

	static boolean inRange(int a, int b, int c) {
		return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
	}
}
