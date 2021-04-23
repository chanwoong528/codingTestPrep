package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10814 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String arr[][] = new String[n][3];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {

			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();// age
			arr[i][1] = st.nextToken();// name
			arr[i][2] = String.valueOf(i);// early register
		}
		Arrays.sort(arr, new java.util.Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if (Integer.parseInt(o1[0]) == Integer.parseInt(o2[0])) {// age
					return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);//register date
				}

				return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
			}

		});
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");

		}
		System.out.println(sb);

	}

}
