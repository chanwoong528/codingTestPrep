package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10867 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		boolean[] arr = new boolean[2002];
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int idx = Integer.parseInt(st.nextToken());
			if (arr[idx+1000] == false) {
				arr[idx+1000] = true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == true) {
				sb.append(i-1000).append(" ");
			}
		}
		System.out.println(sb); 
	}

}
