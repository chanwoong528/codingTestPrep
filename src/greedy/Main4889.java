package greedy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main4889 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> result = new ArrayList<Integer>();
		while (sc.hasNextLine()) {

			Stack<Character> stack = new Stack<Character>();
			String str = sc.nextLine();
			int count = 0;
			if (str.charAt(0) == '-') {
				break;
			}
			for (int i = 0; i < str.length(); i++) {

				if (stack.isEmpty() && str.charAt(i) == '}') {
					stack.push('{');
					count++;

				} else if (str.charAt(i) == '}') {
					stack.pop();
				} else {
					stack.push('{');
				}
			}

			count = count + stack.size() / 2;
			// System.out.println("count: " + count);
			result.add(count);
		}
		for (int i = 0; i < result.size(); i++) {
			System.out.println((i + 1) + ". " + result.get(i));

		}

	}

}
