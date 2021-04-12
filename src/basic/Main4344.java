package basic;

import java.util.Scanner;

public class Main4344 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ave[] = new int[n];
		double counter[] = new double[n];
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			int score[] = new int[num];
			int total = 0;

			for (int j = 0; j < num; j++) {
				score[j] = sc.nextInt();
				total = total + score[j];
			}
			ave[i] = total / num;
			int count = 0;
			for (int j = 0; j < num; j++) {
				if (ave[i] < score[j]) {
					count++;
				}
				double result = (double) count / num;

				counter[i] = result * 100;

			}

		}
		for (int i = 0; i < n; i++) {
			System.out.println(String.format("%.3f", counter[i]) + "%");
		}

	}

}
