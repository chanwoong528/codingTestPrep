package basic;

import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result[] = new String[n]; 
		int t = 0;
		String str = "";
		for (int i = 0; i < n; i++) {
			t = sc.nextInt();
			str = sc.nextLine();
			String temp = "";
			for (int j = 0; j < str.length(); j++) {

				char test = str.charAt(j);
				temp = temp + Character.toString(test).repeat(t);

			}

			result[i]=temp;

		}
		for (int i = 0; i < n; i++) {
		System.out.println(result[i].trim());	
		}

	}

}
