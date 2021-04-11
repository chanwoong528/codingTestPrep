package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;


public class Main1339 {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException {

	
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alpha = new int[26];
		
		int n = Integer.parseInt(br.readLine());

		for (int j = 0; j < n; j++) {

			String line = br.readLine();
			
			for (int i = 0; i < line.length(); i++) {

				int temp = (int) Math.pow(10, line.length() - 1 - i);
				int index = ((int) line.charAt(i)) - 65;

				alpha[index] = alpha[index] + temp;
			}

			

		}
		Arrays.sort(alpha);
		int sum = 0;
		int mult = 9; 
		for (int i = alpha.length-1; i >=0; i--) {
			if(alpha[i]==0) {
				break;//no more alphabet needs to be found
			}
			else {
				sum = sum +alpha[i]*mult;
				mult--;
			}
			
		}
		System.out.println(sum);

	}
	
}
