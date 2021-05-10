package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2661 {
	public static int n;
	public static boolean found = false;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		backTrack(1, "1");

	}

	public static void backTrack(int count, String str) {
		if (found == true) {
			return;
		}
		if (n == count) {
			System.out.println(str);
			found = true;
			return; 
		} else {
			for (int i = 1; i <= 3; i++) {
				if (able(str + i)) {
					backTrack(count + 1, str + i);
				}
			}
		}

	}

	public static boolean able(String str) {
		int start = str.length() - 1;
		int end = str.length();
		int mid = str.length() / 2;
		for (int i = 1; i <= mid; i++) {
			if (str.subSequence(start - i, end - i).equals(str.subSequence(start, end))) {
				return false;

			}
			start = start - 1;

		}
		return true;

	}

}
