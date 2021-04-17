package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main5430 {

	public static void main(String[] args) throws IOException {

		// R = > revese , d delete

		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int k = 0; k < t; k++) {

			String cmd = br.readLine();
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String temp = st.nextToken();
			temp = temp.substring(1, temp.length() - 1);
			st = new StringTokenizer(temp, ",");
			LinkedList<Integer> dq = new LinkedList();

			for (int i = 0; i < n; i++) {
				dq.add(Integer.parseInt(st.nextToken()));
			}
			boolean rev = false;
			boolean err = false;
			for (int i = 0; i < cmd.length(); i++) {

				char cmdCh = cmd.charAt(i);
				if (cmdCh == 'R') {
					rev = !rev;
				}
				if (cmdCh == 'D') {
					if (!dq.isEmpty()) {
						if (rev == true) {
							dq.pollLast();
						} else {
							dq.pollFirst();
						}

					} else {
						err = true;

						break;
					}

				}

			}
			if (err) {
				sb.append("error\n");
			} else {
				sb.append("[");

				while (!dq.isEmpty()) {
					if (rev == true) {
						sb.append(dq.pollLast()).append(dq.isEmpty() ? "" : ",");
					} else {
						sb.append(dq.pollFirst()).append(dq.isEmpty() ? "" : ",");
					}

				}
				sb.append("]\n");
			}

		}

		System.out.println(sb);
	}

}
