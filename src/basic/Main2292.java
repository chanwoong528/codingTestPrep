package basic;

import java.util.Scanner;

public class Main2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt();

		long count = 0;
		long result = 1;

		while (true) {
			long temp = 1;

			if (result < n) {
				count++;
				temp = result;
				result = temp + (count * 6);

			} else {

				break;
			}

		}
		System.out.println(count + 1);

	}

}
