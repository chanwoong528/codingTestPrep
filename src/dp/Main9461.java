package dp;

import java.util.Scanner;

public class Main9461 {
	private static long[] memo;

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		memo = new long[101];
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();

			sb.append(fiboMemo(n)).append("\n");
		}
		System.out.println(sb);
		// TODO Auto-generated method stub

	}

	public static long fiboMemo(int n) {
		long result;
		if (memo[n] != 0) {
			return memo[n];
		} else if (n == 1 || n == 2 || n == 3) {
			result = 1;
		} else {
			result = fiboMemo(n - 2) + fiboMemo(n - 3);
			memo[n] = result;

		}
		return result;

	}
}
