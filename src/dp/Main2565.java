package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main2565 {
	public static int[][] pole;
	public static int[] memo;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		pole = new int[n][2];
		memo = new int[n];
		StringTokenizer st;
		for (int i = 0; i < pole.length; i++) {
			st = new StringTokenizer(br.readLine());
			pole[i][0] = Integer.parseInt(st.nextToken());
			pole[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(pole, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
//		for (int i = 0; i < pole.length; i++) {
//
//			System.out.println(pole[i][0] + " " + pole[i][1]);
//
//		}

		int max = 0;
		for (int i = 0; i < pole.length; i++) {
			max = Math.max(find(i), max);
		}
		System.out.println(n - max);

	}

	public static int find(int n) {

		if (memo[n] == 0) {
			memo[n] = 1;

			for (int i = n + 1; i < memo.length; i++) {
				if (pole[n][1] < pole[i][1]) {
					memo[n] = Math.max(memo[n], find(i) + 1);
				}
			}

		}
		return memo[n];
	}

}
