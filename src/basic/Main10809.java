package basic;

import java.util.Scanner;

public class Main10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] alpha = new int[26];
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		//System.out.println(str);

		for (int i = 0; i < alpha.length; i++) {

			alpha[i] = -1;

		}
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

		//	System.out.print(temp + "" + ((int) temp - 97) + " ");
			if (alpha[(int) temp - 97] == -1)
				alpha[(int) temp - 97] = i;
		}
		//System.out.println();

		for (int i = 0; i < alpha.length; i++) {

			System.out.print(alpha[i] + " ");

		}
		//int test = (int) 'a' - 97;
		//System.out.println(test);
	}

}
