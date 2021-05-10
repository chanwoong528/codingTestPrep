package backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1759 {

	public static int n;
	public static int m;

	public static String arr[];
	public static String result[];
	public static boolean visited[];
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new String[m];
		result = new String[n];
		visited = new boolean[m];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr[i] = st.nextToken();
		}
		Arrays.sort(arr);
		back(0, 0);

		bw.close();

	}

	public static void back(int count, int index) throws IOException {
		if (count == n) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) {

				sb.append(result[i]);

			}
			String str = sb.toString();
			if (containsC(str) && containsV(str)) {
				bw.write(str);
				bw.newLine();
			}

			return;
		}
		for (int i = index; i < m; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];

				back(count + 1, i);
				visited[i] = false;
			}

		}
	}

	public static boolean containsC(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o'
					&& str.charAt(i) != 'u') {
				count++;
			}
		}
		if (count > 1) {
			return true;
		}
		return false;
	}

	public static boolean containsV(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				return true;
			}
		}
		return false;
	}

}
