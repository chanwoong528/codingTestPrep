package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1463 {

	public static int memo[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new int[n + 1];

		System.out.println(findCounttopDown(n));

	}

	public static int findCounttopDown(int n) {
		if (n == 1||n==0) {
			// System.out.println("n==1 " + n + " " + memo[n]);
			return 0;
		}
		if (memo[n] > 0) {
			// System.out.println("n>>0 " + n + " " + memo[n]);
			return memo[n];
		}

		if (n % 3 == 0 && n % 2 == 0) {
			memo[n] = Math.min(findCounttopDown(n / 3), Math.min(findCounttopDown(n - 1), findCounttopDown(n / 2))) + 1;
		} else if (n % 2 == 0) {
			// System.out.println("n=%2 " + n + " " + memo[n]);
			memo[n] = Math.min(findCounttopDown(n / 2), findCounttopDown(n - 1)) + 1;
		} else if (n % 3 == 0) {
			// System.out.println("n=%3 " + n + " " + memo[n]);
			memo[n] = Math.min(findCounttopDown(n / 3), findCounttopDown(n - 1)) + 1;
		} else {
			memo[n] = findCounttopDown(n - 1) + 1;
		}

		return memo[n];
	}
}
