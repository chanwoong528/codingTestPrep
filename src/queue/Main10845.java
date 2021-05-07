package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main10845 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> dq = new LinkedList();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String cmd = st.nextToken();

			if (cmd.equals("push")) {
				dq.offer(Integer.parseInt(st.nextToken()));

			}

			if (cmd.equals("pop")) {
				if (!dq.isEmpty()) {
					sb.append(dq.poll()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}

			}
			if (cmd.equals("front")) {
				if (!dq.isEmpty()) {
					sb.append(dq.peekFirst()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}

			}
			if (cmd.equals("back")) {
				if (!dq.isEmpty()) {
					sb.append(dq.peekLast()).append("\n");
				} else {
					sb.append(-1).append("\n");
				}

			}

			if (cmd.equals("size")) {
				sb.append(dq.size()).append("\n");
			}
			if (cmd.equals("empty")) {
				if (dq.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}

			}

		}
		System.out.print(sb);
		br.close();

	}

}
