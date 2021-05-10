package backtracking;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main15665 {

	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static int n;
	public static int m;

	public static LinkedHashSet<String> ans = new LinkedHashSet<>();

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		arr = new int[n];
		result = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		back(0,0);
		Iterator<String> iter = ans.iterator();
		while (iter.hasNext()) {
			bw.write(iter.next());
			bw.newLine();
		}
		bw.close();

	}

	public static void back(int count, int idx) {

		StringBuilder sb = new StringBuilder();
		if (count == m) {
			for (int i = 0; i < m; i++) {
				sb.append(result[i]).append(" ");
			}
			String temp = sb.toString();
			ans.add(temp);
			return;
		}
		for (int i = idx; i < n; i++) {

			result[count] = arr[i];
			back(count + 1, i);

		}

	}

}
