package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2156 {

	public static int[] arr;
	public static Integer[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		memo = new Integer[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		memo[0] = arr[0];
		memo[1] = arr[1];

		if (n >= 2) {
			memo[2] = arr[1] + arr[2];
		}
		System.out.println(find(n));
	}

	public static int find(int n) {
		if (memo[n] == null) {

			memo[n] = Math.max(Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n], find(n-1));

		}

		return memo[n];

	}

}
