package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1654 {

	public static long lans[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());// target have to make n number of lines
		lans = new long[k];
		for (int i = 0; i < k; i++) {
			lans[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(lans);
		System.out.println(maxLanLength(lans, n));
	}

	public static long maxLanLength(long[] arr, int n) {
		long start = 1;
		long end = arr[arr.length - 1];
		long mid = 0; // 잘린지점
		long count = 0;
		long result = 0;
		while (start <= end) {
			count = 0;
			mid = (start + end) / 2;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] >= mid) {
					count = count + (arr[i] / mid);
					System.out.println("count" + count + " " + arr[i] + " " + mid);

				}
			}
			if (count < n) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			if (count >= n) {
				result = (result < mid) ? mid : result;
				
			}

		}

		return result;
	}

}
