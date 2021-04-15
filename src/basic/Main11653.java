package basic;

import java.util.Scanner;

public class Main11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 2;

		while (n > 1) {
			if (n % count == 0) {
				System.out.println(count);
				n = n / count;

			}
			else {
				count++;
			}

		}

	}

}
