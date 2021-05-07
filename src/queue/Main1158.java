package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1158 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		LinkedList<Integer> q = new LinkedList<>();
		for (int i = 1; i <= n; i++) {
			q.add(i);
		}
		// System.out.println(q.toString());
		sb.append("<");
		while (!q.isEmpty()) {

			for (int i = 0; i < k - 1; i++) {
				q.offer(q.poll());
			}
			if (q.size() == 1) {

				sb.append(q.poll()).append(">");
			} else {
				sb.append(q.poll()).append(", ");
			}

		}

		System.out.println(sb);
	}

}
