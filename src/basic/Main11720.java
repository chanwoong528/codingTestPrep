package basic;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();

		//System.out.println(n);
		//System.out.println(str);
		int total = 0;
		for (int i = 0; i < str.length(); i++) {
			char add = str.charAt(i);
			total = total + Character.getNumericValue(add);

		}

		System.out.println(total);

	}

}
