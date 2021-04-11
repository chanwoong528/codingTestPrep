package greedy;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main11000 {

	static class Lecture implements Comparable<Lecture> {

		int start;
		int end;

		private Lecture(int start, int end) {
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Lecture o) {
			return this.start - o.start;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Lecture[] hour = new Lecture[n];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < n; i++) {
			int sTime = sc.nextInt();
			int eTime = sc.nextInt();

			hour[i] = new Lecture(sTime, eTime);

		}
		Arrays.sort(hour);
		int index = 0;
		pq.add(hour[0].end);
		
		for (int i = 1; i < n; i++) {
			if(pq.peek()<= hour[i].start) {
				pq.poll();
			}
			pq.add(hour[i].end);
		}

		// print
		for (int i = 0; i < n; i++) {

	 //System.out.println(hour[i].start + " " + hour[i].end);
			
		}
System.out.println(pq.size());
	}

}
