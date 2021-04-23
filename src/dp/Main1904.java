package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1904 {
	public static int memo[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new int[1000001];
		System.out.println(count(n));
	}

	public static int count(int n) {
		int result;
		if (memo[n] != 0) {
			return memo[n];
		} else if (n == 1)
			result = 1 % 15746;
		else if (n == 2)
			result = 2 % 15746;
		else if (n == 3)
			result = 3 % 15746;
		else {
			result = count(n - 1) + count(n - 2);
			memo[n] = result % 15746;
		}
		return result % 15746;
	}

}
