
package basic;

import java.util.Scanner;

public class Main4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;

		while (n != 0) {

			n = sc.nextInt();
			int m = n * 2;
			int start = n + 1;
			int result = countPrime(n, m, start);
			if (n == 0) {
				break;
			}
			System.out.println(result);

		}

	}

	static int countPrime(int n, int m, int start) {
		int count = 0;
		while (start <= m) {

			if (isPrime(start) != -1) {
				count++;

			}

			start++;

		}
		return count;

	}

	static int isPrime(int num) {

		if (num == 1) {
			return -1;
		}
		if (num == 2) {
			return num;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return -1;
			}

		}

		return num;
	}

}
