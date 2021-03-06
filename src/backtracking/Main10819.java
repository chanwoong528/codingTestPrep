package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10819 {

	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static int n;
	public static int sum;
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		back(0);
		System.out.println(max);

	}

	public static void back(int count) {

		if (count == n) {
			 sum = 0;
			for (int i = 0; i < n - 1; i++) {
				sum = sum + Math.abs(result[i] - result[i + 1]);
			}
			if (sum > max) {
				max = sum;
			}

			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];
				back(count + 1);
				visited[i] = false;
			}

		}

	}

}
