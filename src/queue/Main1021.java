package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main1021 {
	static LinkedList<Integer> dq;

	public static void main(String[] args) throws IOException {

		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int n = Integer.parseInt(st.nextToken());

		dq = new LinkedList();
		for (int i = 1; i <= n; i++) {
			dq.add(i);
		}
		System.out.println();
		System.out.println(dq.toString());
		
		
		int k = Integer.parseInt(st.nextToken());

		int target[] = new int[k];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < k; i++) {

			target[i] = Integer.parseInt(st.nextToken());
		}
	

		int count = 0;
		for (int i = 0; i < target.length; i++) {
			boolean found = false;
			while (found != true) {
				
				if (dq.peekFirst() == target[i] || dq.peekLast() == target[i]) {
				
					if (dq.peekFirst() == target[i]) {
						dq.pollFirst();
						found = true;
						System.out.println(dq.toString());
						break;
					} else {
						dq.pollLast();
						found = true;
						count++;
						System.out.println(dq.toString());
						break;
					}

				} else {
					if (Math.abs(0 - dq.indexOf(target[i])) >= Math.abs(dq.size() - dq.indexOf(target[i]))) {
						// right
						count = count+1;
						right();
						System.out.println(dq.toString());
						
					} else {
						count = count+1;
						left();
						System.out.println(dq.toString());
						
					}
				}
				System.out.println(count);
			}

		}
		System.out.println(count);

	}

	public static void right() {
		int temp = dq.pollLast();
		dq.addFirst(temp);
	}

	public static void left() {
		int temp = dq.pollFirst();
		dq.addLast(temp);
	}

}
