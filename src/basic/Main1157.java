package basic;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main1157 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		int alpha[] = new int[26];

		for (int i = 0; i < str.length(); i++) {
			
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				alpha[str.charAt(i) - 'A']++;	
			}
    
			else {	
				alpha[str.charAt(i) - 'a']++;
			}

		}
		int max = 0;
		char result = '?';
		for (int i = 0; i < 26; i++) {
			if (alpha[i] > max) {
				max = alpha[i];

				result = (char) (65 + i);
			} else if (alpha[i] == max) {
				result = '?';
			}

		}
		System.out.println(result);

	}

}
