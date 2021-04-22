package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1300 {
	public static int n;
	public static int k;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());

		System.out.println(bSearch(1, k));
	}

	public static long bSearch(long start, long end) {

		long count = 0;
		long ans = 0 ;
		long mid = 0;
		while (start <= end) {
			count = 0; 
			mid = (start + end) / 2;
			for (int i = 1; i <= n; i++) {
				count = count + Math.min(mid / i, n);
			}
			if (k > count) {
				start = mid + 1;
			} else {
				ans= mid; 
				end= mid-1;
			}
		}

		return ans;

	}

}
