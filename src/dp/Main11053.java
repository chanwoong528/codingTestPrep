package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11053 {
	public static int arr[];
	public static int memo[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		memo = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			find(i);
		}

		int max = memo[0];

		for (int i = 1; i < memo.length; i++) {
			if (max < memo[i]) {
				max = memo[i];
			}
		}
		System.out.println(max);

	}

	public static int find(int n) {

		if (memo[n] == 0) {
			memo[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) {
					memo[n] = Math.max(memo[n], find(i) + 1);
				}
			}
		}
		return memo[n];

	}

}
