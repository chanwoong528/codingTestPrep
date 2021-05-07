package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1182 {

	static int s;
	static int count;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int arr[] = new int[n];

		s = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		dfs(0, 0, arr);
		if (s == 0) {
			count = count - 1;
		}
		System.out.println(count);

	}

	public static void dfs(int start, int sum, int[] arr) {
		if (sum == s) {
			count++;
		}
		for (int i = start; i < arr.length; i++) {

			dfs(i + 1, sum + arr[i], arr);

		}
	}

}
