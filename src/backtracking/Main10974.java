package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10974 {
	public static int arr[];
	public static boolean visited[];
	public static int n;
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n + 1];
		visited = new boolean[n + 1];
		back(1);
		System.out.println(sb); 
	}

	public static void back(int count) {

		if (count == n + 1) {

			for (int i = 1; i <= n; i++) {
				sb.append(arr[i]).append(" ");

			}
			sb.append("\n");

			return;
		}
		for (int i = 1; i <= n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				arr[count] = i;
				back(count + 1);
				visited[i] = false;
			}
		}

	}

}
