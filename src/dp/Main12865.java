package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12865 {
	public static int max;
	public static int w[];
	public static int v[];
	public static Integer memo[][];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		w = new int[n];
		v = new int[n];
		memo = new Integer[n][k + 1];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			w[i] = Integer.parseInt(st.nextToken());
			v[i] = Integer.parseInt(st.nextToken());

		}

		System.out.println(find(n - 1, k));

//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j <= k; j++) {
//				if (memo[i][j] != null)
//					System.out.print(memo[i][j] + " ");
//				else
//					System.out.print("0 ");
//			}
//			System.out.println();
//		}

	}

	public static int find(int n, int k) {

		if (n < 0)
			return 0;

		if (memo[n][k] == null) {

			if (w[n] > k) {

				memo[n][k] = find(n - 1, k);
			} else {

				memo[n][k] = Math.max(find(n - 1, k), find(n - 1, k - w[n]) + v[n]);

			}

		}

		return memo[n][k];
	}

}
