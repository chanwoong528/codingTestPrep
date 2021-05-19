package barkingDog;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10808 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();

		int[] alpha = new int[26];

		for (int i = 0; i < str.length(); i++) {
			int index = str.charAt(i) - 'a';
			alpha[index]++;
		}
		for (int i = 0; i < alpha.length; i++) {
			sb.append(alpha[i]).append(" ");
		}
		System.out.println(sb);

	}

}
