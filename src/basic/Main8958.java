package basic;

import java.util.Scanner;

public class Main8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String result[] = new String[n + 1];
		for (int i = 0; i <= n; i++) {
			result[i] = sc.nextLine();

		}

		for (int i = 1; i < result.length; i++) {
			int total = 0;

			int counter = 0;
			for (int j = 0; j < result[i].length(); j++) {

				if (result[i].charAt(j) == 'O') {
					counter++;
					total = total + counter;
					// System.out.println(counter);

				}
				if (result[i].charAt(j) == 'X') {
					counter = 0;
					// System.out.println(counter);
				}

			}
			System.out.println(total);
		}

//		for (int i = 0; i <= n; i++) {
//			for (int j = 0; j < result[i].length(); j++) {
//				
//				int count = 0;
//				if (result[i].charAt(j) == '0') {
//					count++;
//					total = total + count;
//				}
//				if (result[i].charAt(j) == 'X') {
//					count=0; 
//				}
//				System.out.println(total); 
//			}
//			
//		}
//		
//	

	}
}
