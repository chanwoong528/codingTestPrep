package basic;

import java.util.Scanner;

public class Main9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int k = 0; k < t; k++) {

			int n = sc.nextInt();
			boolean[] prime = new boolean[n + 1];
			for (int i = 0; i < prime.length; i++) {
				if (isPrime(i) != -1) {
					prime[i] = true;
				}

			}
			int min = 10000;
			int p2 = 0;
			int p1 = 0;
			int diff = 0;
			int minP1 = 0;
			int minP2 = 0;
			for (int i = 1; i < prime.length; i++) {
				if (prime[i] == true) {
					if (isPrime(n - i) != -1) {
						p1 = n - i;
						p2 = i;
						diff = Math.abs(p1 - p2);

						if (min > diff) {
							min = diff;

							minP1 = p1;
							minP2 = p2;

						}
					}

				}
			}
			System.out.println( minP2 + " " + minP1);

		}

	}

	public static int isPrime(int num) {
		if (num <= 1) {
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
