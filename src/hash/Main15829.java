package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main15829 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String input = br.readLine();
		long sum = 0;
		long mod = 1234567891;
		long r = 1;
		for (int i = 0; i < n; i++) {
			int temp = (int) input.charAt(i) - 96;
			
			sum = (sum + (temp * r)) % mod;
			r = (r * 31) % mod;
		}
		System.out.println(sum);
	}

}
