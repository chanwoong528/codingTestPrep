package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main10828 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();

			if (cmd.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));

			} else if (cmd.equals("top")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.peek());
				} else {
					System.out.println(-1);
				}

			}
			if (cmd.equals("pop")) {
				if (!stack.isEmpty()) {
					System.out.println(stack.pop());
				} else {
					System.out.println(-1);
				}
			}
			if (cmd.equals("size")) {
				System.out.println(stack.size());
			}
			if (cmd.equals("empty")) {
				if (stack.isEmpty()) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			}

		}
		br.close();
	}

}
