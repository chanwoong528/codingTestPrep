package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main10597 {
	public static boolean[] arr;
	public static int length;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		arr = new boolean[50];
		length = str.length();

		for (int i = 0; i < str.length(); i++) {
			String index = Character.toString(str.charAt(i));

			if (arr[Integer.parseInt(index)] == true || Integer.parseInt(index) == 0) {
				index = index + str.charAt(i + 1);
				arr[Integer.parseInt(index)] = true;

			} else {
				arr[Integer.parseInt(index)] = true;

			}
			System.out.println(index);
		}

	}

	public static void back(int count, int index) {
		if (count == length) {

			return;
		}

		for (int i = index; i < length; i++) {
		}
	}

}
