package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean input[] = new boolean[20000002];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int idx = Integer.parseInt(st.nextToken());
			input[idx + 10000000] = true;

		}
		int x = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < x; i++) {
			int index = Integer.parseInt(st.nextToken());
			if (input[index + 10000000] == true) {
				sb.append(1);
			} else {
				sb.append(0);
			}
			sb.append(" ");
		}
		System.out.println(sb);

	}

}
