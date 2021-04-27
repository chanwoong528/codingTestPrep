package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1912 {
	public static int max;
	public static int[] memo;
	public static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		memo = new int[n];
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			memo[i] = Integer.MIN_VALUE;
		}

		memo[0] = arr[0];
		max = arr[0];
		addSum(n - 1);
		System.out.println(max);

		for (int i = 0; i < n; i++) {
			System.out.print(memo[i] + " ");
		}

	}

	public static int addSum(int val) {
		if (memo[val] == Integer.MIN_VALUE) {

			memo[val] = Math.max(addSum(val - 1) + arr[val], arr[val]);
			if (max < memo[val]) {
				max = memo[val];
			}
		}
		return memo[val];
	}

}
