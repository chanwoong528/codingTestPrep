package priorityQ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main1655 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> minQ = new PriorityQueue<>();
		Queue<Integer> maxQ = new PriorityQueue<>((x, y) -> y - x);
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (i % 2 == 0) {
				maxQ.add(x);
			} else {
				minQ.add(x);
			}

			if (!minQ.isEmpty() && !maxQ.isEmpty()) {
				if (minQ.peek() < maxQ.peek()) {
					int swap = minQ.poll();
					minQ.add(maxQ.poll());
					maxQ.add(swap);
				}

			}

			bw.write(maxQ.peek() + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}

}
