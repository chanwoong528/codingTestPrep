package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15649 {

	public static int arr[];
	public static boolean visited[];
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		visited = new boolean[n + 1];
		back(0, m, n);
		System.out.println(sb);
	}

	public static void back(int count, int m, int n) {
		if (count == m) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != 0) {
					sb.append(arr[i]).append(" ");
				}

			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				arr[count] = i;
				back(count + 1, m, n);
				visited[i] = false;
			}

		}

	}

}
