package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14889 {

	public static int arr[][];
	public static boolean visited[];
	public static int n;
	public static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
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
		back(0, 0);
		System.out.println(min);

	}

	public static void back(int count, int index) {
		if (count == n / 2) {
			int start = 0;
			int link = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (visited[i] == false && visited[j] == false) {
						start = start + arr[i][j] + arr[j][i];
					}
					if (visited[i] == true && visited[j] == true) {
						link = link + arr[i][j] + arr[j][i];
					}
				}
			}
			int result = Math.abs(start - link);
			if (result < min) {
				min = result;
			}

			return;
		}
		for (int i = index; i < arr.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				back(count + 1, i + 1);
				visited[i] = false;
			}
		}

	}

}
