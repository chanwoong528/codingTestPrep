package dp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1003_memo {

	private static long[] memo;

	public static void main(String[] args) {

		memo = new long[4000];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long startTime = System.currentTimeMillis();
		System.out.println(fiboMemo(n));
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		System.out.println("Execution time in milliseconds: " + timeElapsed);

//		startTime = System.currentTimeMillis();
//		System.out.println(fibo(n));
//		endTime = System.currentTimeMillis();
//		timeElapsed = endTime - startTime;
//		System.out.println("Execution time in milliseconds: " + timeElapsed);

	}

	public static long fiboMemo(int n) {
		long result;
		if (memo[n] != 0) {
			return memo[n];
		}
		if (n == 1 || n == 2) {
			result = 1;

		} else {
			result = fiboMemo(n - 1) + fiboMemo(n - 2);
			memo[n] = result;

		}
		return result;

	}

	public static long fibo(int n) {
		long result;
		if (n == 1 || n == 2) {
			result = 1;
		} else {
			result = fibo(n - 1) + fibo(n - 2);
		}

		return result;
	}

}
