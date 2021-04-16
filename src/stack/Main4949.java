package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main4949 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Stack<Character> s = new Stack<Character>();
		boolean correct = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String str = br.readLine();
			if (str.equals("."))
				break;
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == '[' || str.charAt(i) == '(') {
					s.push(str.charAt(i));
				}
				if (str.charAt(i) == ']') {
					if (s.isEmpty()) {
						correct = false;
						break;
					} else {
						char check = s.pop();
						if (check != '[') {
							correct = false;
							break;
						}
					}
				}

				if (str.charAt(i) == ')') {
					if (s.isEmpty()) {
						correct = false;
						break;
					} else {
						char check = s.pop();
						if (check != '(') {
							correct = false;
							break;
						}
					}
				}
				if (s.isEmpty()) {
					correct = true;

				} else {
					correct = false;
				}

			}
			s.clear();
			System.out.println(correct ? "yes" : "no");

		}
	}
}