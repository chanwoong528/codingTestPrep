package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main15663 {

	public static int arr[];
	public static int result[];
	public static boolean visited[];

	public static int n;
	public static int m;

	public static LinkedHashSet<String> ans = new LinkedHashSet<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		StringBuilder sb1 = new StringBuilder();
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		back(0);
		Iterator<String> iter = ans.iterator();
		while (iter.hasNext()) {
			sb1.append(iter.next()).append("\n");
		}
		System.out.println(sb1);

	}

	public static void back(int count) {
		StringBuilder sb = new StringBuilder();
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			String temp = sb.toString();
			
				ans.add(temp);
			

			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];
				back(count + 1);
				visited[i] = false;
			}
		}

	}
}
