package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main18870 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[n];
		int temp[] = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
			temp[i] = arr[i];
		}

		Arrays.sort(temp);
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count = 0;
		for (int i = 0; i < n; i++) {

			if (!hm.containsKey(temp[i])) {
				hm.put(temp[i], count);
				count++;
			}

		}
		for (int i = 0; i < n; i++) {

			sb.append(hm.get(arr[i])).append(" ");
		}
		System.out.print(sb);
	}

}
