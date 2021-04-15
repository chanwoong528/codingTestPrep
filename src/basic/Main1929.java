package basic;

import java.util.Scanner;

public class Main1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int start = n+1;
	
		while(start<=m) {
			
			

			if (isPrime(start) != -1) {
				System.out.println(start);
				
			}

			start++;

		}
		

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
