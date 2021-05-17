package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> s = new Stack<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			String input = br.readLine() + "\n";
			for (int j = 0; j < input.length(); j++) {
				char temp = input.charAt(j);
				if (temp == ' ' || temp == '\n') {
					while (!s.isEmpty()) {
						sb.append(s.pop());
					}
					sb.append(temp);

				} else {
					s.push(temp);
				}
			}

		}
		System.out.println(sb);

	}

}
