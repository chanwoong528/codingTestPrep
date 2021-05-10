package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main15654 {

	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static int n;
	public static int m;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		
		result = new int[n + 1];
		visited = new boolean[n + 1];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		back(0);
		System.out.println(sb);

	}

	public static void back(int count) {
		if (count == m) {
			for (int i = 0; i < result.length; i++) {

				if (result[i] != 0) {
					sb.append(result[i]).append(" ");
				}

			}
			sb.append("\n");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];
				back(count + 1);
				visited[i] = false;

			}
		}

	}

}
