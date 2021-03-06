package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main1037 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num; i++) {

			int temp = Integer.parseInt(st.nextToken());
			if (temp < min) {
				min = temp;
			}
			if (temp > max) {
				max = temp;
			}
		}

		System.out.println(min * max);
	}

}
