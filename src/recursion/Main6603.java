package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main6603 {
	static boolean visited[];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			if (n == 0) {
				break;
			}
			int arr[] = new int[n];
			visited = new boolean[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());

			}

			dfs(0, 0, arr);
			sb.append("\n");

		}
		System.out.println(sb);

	}

	public static void dfs(int start, int depth, int arr[]) {

		if (depth == 6) {
			for (int i = 0; i < visited.length; i++) {
				if (visited[i] == true) {

					sb.append(arr[i] + " ");
				}

			}
			sb.append("\n");
			return;
		}

		for (int i = start; i < visited.length; i++) {
			visited[i] = true;
			dfs(i + 1, depth + 1, arr);
			visited[i] = false;

		}
	}

}
