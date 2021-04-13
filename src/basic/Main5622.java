package basic;

import java.util.Scanner;

public class Main5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			switch (str.charAt(i)) {
			case 'A':
			case 'B':
			case 'C':
				count = count + 3;
				break;
			case 'D':
			case 'E':
			case 'F':
				count = count + 4;
				break;
			case 'G':
			case 'H':
			case 'I':// 2
				count = count + 5;
				break;
			case 'J':
			case 'K':
			case 'L':// 2
				count = count + 6;
				break;
			case 'M':
			case 'N':
			case 'O':// 2
				count = count + 7;
				break;
			case 'P':
			case 'Q':
			case 'R':
			case 'S':// 2
				count = count + 8;
				break;
			case 'T':
			case 'U':
			case 'V':// 2
				count = count + 9;
				break;
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':// 2
				count = count + 10;
				break;

			}

		}

		System.out.println(count);
	}

}
