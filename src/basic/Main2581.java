package basic;

import java.util.Scanner;

public class Main2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m - n+1];

		int start = n;
		for (int i = 0; i <= m - n; i++) {

			if (isPrime(start)) {
				arr[i] = start;
			}

			start++;

		}
		long result = 0;
		int min = m + 1;
		for (int i = 0; i <= m - n; i++) {

			result = result + arr[i];
			if (arr[i] != 0 && arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println(result == 0 ? "-1" : result);
		System.out.println(min == (m + 1) ? "" : min);
	}

	static boolean isPrime(int num) {

		if (num == 1) {
			return false;
		}
		if(num ==2) {
			return true; 
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}

		}

		return true;
	}
}
