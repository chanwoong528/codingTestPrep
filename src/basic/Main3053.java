package basic;

import java.util.Scanner;

public class Main3053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double r = sc.nextDouble();

		double result1 = r * r * 2;
		double result2 = r * r * Math.PI;

		System.out.println(result2);
		System.out.println(result1);
	
	}
}
