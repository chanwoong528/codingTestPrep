package shortTermDev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main1655 {
	public static PriorityQueue<Integer> maxQ = new PriorityQueue<Integer>((x, y) -> y - x);
	public static PriorityQueue<Integer> minQ = new PriorityQueue<Integer>();

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(br.readLine());
			if (i % 2 == 0) {
				maxQ.add(temp);
			} else {
				minQ.add(temp);
			}
			if (!maxQ.isEmpty() && !minQ.isEmpty()) {
				if (maxQ.peek() > minQ.peek()) {
					int swap = maxQ.poll();
					maxQ.add(minQ.poll());
					minQ.add(swap);
				}

			}
			sb.append(maxQ.peek()).append("\n");
		}
		System.out.println(sb);

	}

}
