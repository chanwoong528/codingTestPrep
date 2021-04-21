package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2805 {
	public static long[] tree;
	public static long max = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());// target have to make n number of lines
		tree = new long[k];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < k; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			if (tree[i] > max) {
				max = tree[i];
			}
		}
		System.out.println(getTree(tree, n));

	}

	public static long getTree(long[] arr, int n) {

		long start = 0;
		long end = max;
		long mid = 0;

		long total = 0;
		long result = 0;
		while (start <= end) {

			total = 0;
			mid = (start + end) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (tree[i] >= mid) {
					total = total + (arr[i] - mid);
					 System.out.println("total" + total + " " + arr[i] + " " + mid);
				}
			}
			if (total < n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (total >= n) {
				result = (result < mid) ? mid : result;

			}

		}
		return result;
	}
}
