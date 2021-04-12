package basic;

import java.util.Scanner;

public class Main1546 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		double max = -100;

		for (int i = 0; i < n; i++) {
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		double sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + (arr[i] / max);

		}
		
	//	System.out.println(max);
	//	System.out.println(sum);
		System.out.println((sum/n)*100);
	}
}
