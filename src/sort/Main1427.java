package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1427 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int arr[] = new int[10];
		int n = Integer.parseInt(br.readLine());
		while (n != 0) {
			arr[n % 10]++;
			n /= 10;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			while (arr[i] != 0) {
				sb.append(i);
				arr[i]--;
			}
		}
		System.out.print(sb);
	}

}
