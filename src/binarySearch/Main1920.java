package binarySearch;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Main1920 {

	public static int arr1[];
	public static int arr2[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		arr1 = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {

			arr1[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {

			arr2[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr1);
		for (int i = 0; i < arr2.length; i++) {

			sb.append(checkDup(arr1, arr2[i])).append("\n");

		}
		System.out.println(sb);

	}

	public static int checkDup(int[] arr1, int num) {
		int start = 0;
		int end = arr1.length - 1;
		int mid = 0;

		while (start <= end) {
			mid = (start + end) / 2;
			if (arr1[mid] == num) {
				return 1;
			} else if (arr1[mid] > num) {
				end = mid - 1;
			} else if (arr1[mid] < num) {
				start = mid + 1;
			}
		}
		return 0;

	}

}
