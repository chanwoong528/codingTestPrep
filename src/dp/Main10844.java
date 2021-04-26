package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10844 {
	public static Long[][] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new Long[n + 1][10];
		for (int i = 0; i < 10; i++) {
			memo[1][i] = (long) 1;
		}
		long result = 0;
		for (int i = 1; i <= 9; i++) {
			result = result + find(n, i);
		}
		System.out.println(result % 1000000000);

	}

	public static long find(int digit, int val) {
		if (digit == 1) {
			return memo[digit][val];
		}
		if (memo[digit][val] == null) {
			if (val == 0) {
				memo[digit][val] = find(digit - 1, 1);
			} else if (val == 9) {
				memo[digit][val] = find(digit - 1, 8);
			} else {
				memo[digit][val] = find(digit - 1, val - 1) + find(digit - 1, val + 1);
			}
		}

		return memo[digit][val] % 1000000000;

	}

}
