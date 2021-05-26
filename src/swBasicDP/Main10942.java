package swBasicDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10942 {
	public static int arr[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		arr = new int[2001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int m = Integer.parseInt(br.readLine());
		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int begin = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			sb.append(isPalin(begin, last)).append("\n");

		}
		System.out.println(sb);

	}

	public static int isPalin(int start, int end) {

		while (start <= end) {

			if (arr[start] != arr[end]) {
				return 0;
			}
			start++;
			end--;

		}
		return 1;

	}

}
