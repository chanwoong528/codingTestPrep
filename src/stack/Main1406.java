package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String input = br.readLine();
		Stack<Character> ls = new Stack<>();
		Stack<Character> rs = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			ls.add(input.charAt(i));
		}

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String cmd = br.readLine();
			if (cmd.contains("P")) {
				ls.add(cmd.charAt(2));
			} else {
				if (cmd.equals("L")) {
					if (!ls.isEmpty()) {
						rs.add(ls.pop());
					}
				}
				if (cmd.equals("D")) {
					if (!rs.isEmpty()) {
						ls.add(rs.pop());
					}
				}
				if (cmd.equals("B")) {
					if (!ls.isEmpty()) {
						ls.pop();
					}
				}

			}

		}
		while (!ls.isEmpty()) {
			rs.add(ls.pop());

		}
		while (!rs.isEmpty()) {
			sb.append(rs.pop());
		}
		System.out.println(sb);
	}

}
