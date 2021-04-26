package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11054 {
	public static int arr[];
	public static int dpInc[];
	public static int dpDec[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		dpInc = new int[n];
		dpDec = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			findInc(i);
			findDec(i);
		}
		for (int i = 0; i < n; i++) {
			System.out.print(dpInc[i] + " ");

		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print(dpDec[i] + " ");

		}
		System.out.println();
		int max = 0;
		int index = 0;
		for (int i = 0; i < n; i++) {
			if (max < (dpInc[i] + dpDec[i]) - 1) {
				max = (dpInc[i] + dpDec[i]) - 1;
				index = i;
			}

		}
		//System.out.println(max + ":" + index);
		System.out.println(max);
	}

	public static int findInc(int n) {

		if (dpInc[n] == 0) {
			dpInc[n] = 1;

			for (int i = n - 1; i >= 0; i--) {
				if (arr[i] < arr[n]) {
					dpInc[n] = Math.max(dpInc[n], findInc(i) + 1);
				}
			}
		}
		return dpInc[n];

	}

	public static int findDec(int n) {

		if (dpDec[n] == 0) {
			dpDec[n] = 1;

			for (int i = dpDec.length - 1; i >= n + 1; i--) {
				if (arr[i] < arr[n]) {
					dpDec[n] = Math.max(dpDec[n], findDec(i) + 1);
				}
			}
		}
		return dpDec[n];

	}

}
