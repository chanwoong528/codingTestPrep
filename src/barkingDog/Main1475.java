package barkingDog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1475 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int sixNineCnt = 0;
		int arr[] = new int[10];

		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);

			if (temp == '6' || temp == '9') {
				sixNineCnt++;
			}
			arr[Character.getNumericValue(temp)]++;

		}
		arr[6] = (int) Math.ceil((double) sixNineCnt / 2);
		arr[9] = (int) Math.ceil((double) sixNineCnt / 2);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		
		System.out.println(max);

	}

}
