package priorityQ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main11279 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Queue<Integer> q = new PriorityQueue<>((x, y) -> y - x);

		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x == 0) {
					if(!q.isEmpty()) {
						System.out.println(q.poll());
					}
					else {
						System.out.println(x);
					}
			}
			else {
				q.add(x);
			}
			
		}

	}

}
