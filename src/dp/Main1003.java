package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1003 {
	private static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		arr = new int[2];
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(fibonacci(n) + " " + fibonacci(n + 1));

		}

	}

	public static int fibonacci(int x) {
		int first = 1;
		int second = 0;
		int result = 1;
		if (x == 0) {
			return 1;
		} else if (x == 1) {
			return 0;
		} else {
			for (int i = 1; i <= x; i++) {
				first = second;
				second = result;
				result = first + second;

			}
		}

		return first;
	}
}
