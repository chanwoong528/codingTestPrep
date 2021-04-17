package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main2164 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		LinkedList<Integer> q = new LinkedList();
		for (int i = 1; i <= n; i++) {
			q.offer(i);
		}
		int result = 0;
		if (q.size() == 1) {
			result = q.peek();
		} else {
			while (q.size() > 1) {
				int first = q.poll();
				int second = q.poll();
				q.offer(second);
				result = q.peek();

			}
		}

		System.out.println(result);

	}

}
