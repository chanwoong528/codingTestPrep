package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1966 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for (int test = 0; test < t; test++) {

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			LinkedList<int[]> q = new LinkedList();
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < n; i++) {
				q.offer(new int[] { i, Integer.parseInt(st.nextToken()) });
			}
			int count = 0;
			
			while (!q.isEmpty()) {
				int[] first = q.poll();
				boolean max = true;
				for (int i = 0; i < q.size(); i++) {

					if (first[1] < q.get(i)[1]) {
						q.offer(first);
						for (int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						max = false;
						break;
					}

				}
				if (!max) {
						continue; 
				}
				count++;
				if (first[0] == m) {
					break;
				}

			}
			sb.append(count).append("\n");

		}
		System.out.println(sb);
	}

}
