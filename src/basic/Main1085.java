package basic;

import java.util.Scanner;

public class Main1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[4];
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		w = w - x;
		h = h - y;
		arr[0] = x;
		arr[1] = y;
		arr[2] = w;
		arr[3] = h;

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 4; i ++) {
		 if(min>arr[i]) {
			 min = arr[i];
		 }
		}

		System.out.println(min);
	}

}
