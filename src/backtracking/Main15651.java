package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15651 {

	public static int arr[];

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		back(0, n, m);
		System.out.println(sb);
	}

	public static void back(int count, int n, int m) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				if (arr[i] != 0) {
					sb.append(arr[i]).append(" ");
				}
			}
			sb.append("\n");
			return;
		}
		for (int i = 1; i <= n; i++) {

			arr[count] = i;
			back(count + 1, n, m);
		}

	}
}
