package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9251 {
	public static char[] str1;
	public static char[] str2;

	public static int[][] memo;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		str1 = br.readLine().toCharArray();
		str2 = br.readLine().toCharArray();
		memo = new int[str1.length][str2.length];
		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				memo[i][j] = -1;
			}
		}

		System.out.println(Lcs(str1.length - 1, str2.length - 1));
	}

	static int Lcs(int x, int y) {
		if (x < 0 || y < 0) {
			return 0;
		}
		if (memo[x][y] == -1) {
			memo[x][y] = 0;
			if (str1[x] == str2[y]) {
				memo[x][y] = Lcs(x - 1, y - 1) + 1;
			} else {
				memo[x][y] = Math.max(Lcs(x - 1, y), Lcs(x, y - 1));
			}
		}

		return memo[x][y];
	}

}
