package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main9012 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Character> s = new Stack<Character>();
		boolean correct = false;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					s.push(str.charAt(j));
				}
				if (str.charAt(j) == ')') {
					if (s.isEmpty()) {
						correct = false;
						break;
					} else {
						s.pop();
					}
				}

				if (s.isEmpty()) {
					correct = true;

				} else {
					correct = false;
				}

			}
			s.clear();
			System.out.println(correct ? "YES" : "NO");

		}

		br.close();

	}

}
