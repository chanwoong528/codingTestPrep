package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main15652 {

	public static int arr[];
	public static int n;
	public static int m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n + 1];
		back(0, 1);
		System.out.println(sb);
	}

	public static void back(int count, int val) {
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		for (int i = val; i <= n; i++) {
			arr[count] = i;
			back(count + 1, i);
		}

	}
}
