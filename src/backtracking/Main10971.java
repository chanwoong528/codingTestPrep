package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10971 {
	public static int arr[][];
	public static boolean visited[];
	public static int min = Integer.MAX_VALUE;
	public static int n;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		back(0, 0, 0);
		System.out.println(min);

	}

	public static void back(int count, int sum, int start) {
		if (count == n) {
			if (sum < min) {
				min = sum;
			}

			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false && arr[start][i] != 0 && (count != n - 1 || i == 0)) {
				visited[i] = true;
				sum = sum + arr[start][i];
				back(count + 1, sum, i);
				sum = sum - arr[start][i];
				visited[i] = false;
			}
		}

	}

}
