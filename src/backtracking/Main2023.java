package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2023 {
	public static int n;
	public static StringBuilder sb = new StringBuilder(); 

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		back("",0);

		System.out.println(sb); 
	}

	public static void back(String str, int count) {
		if (count == n) {
			sb.append(str).append("\n");
			return;
		}
		for (int i = 1; i <= 9; i++) {
			int temp = Integer.parseInt((str + i));
			if (isPrime(temp) == true) {
				back(str + i, count + 1);

			}

		}

	}

	public static boolean isPrime(int val) {
		if (val == 1)
			return false;
		for (int i = 2; i <= Math.sqrt(val); i++) {
			if (val % i == 0) {
				return false;
			}

		}

		return true;
	}

}
