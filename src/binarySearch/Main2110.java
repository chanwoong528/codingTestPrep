package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2110 {

	public static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		System.out.println(solution(n, c));
	}

	public static int solution(int n, int c) {

		int start = 1;
		int end = arr[arr.length - 1] - 1;
		int mid = 0;

		while (start <= end) {

			mid = (start + end) / 2;

			if (!canInstall(mid, c)) {

				end = mid - 1;
			} else {

				start = mid + 1;
			}

		}
		return mid;
	}

	public static boolean canInstall(int dis, int c) {

		int firstPoint = arr[0];
		c = c - 1;
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] - firstPoint >= dis) {
				firstPoint = arr[i];
				c--;
				if (c <= 0) {
					return true;
				}
			}

		}

		return false;

	}

}
