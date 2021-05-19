package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1697 {

	static int graph[] = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sujin = sc.nextInt();
		int sis = sc.nextInt();

		bfs(sujin, sis);

	for(int i = 0; i <17; i++) {
		
		System.out.print(graph[i]+" " );
		
	}

	}

	static void bfs(int sujin, int sis) {
		Queue<Integer> q = new LinkedList<>();

		q.add(sujin);

		graph[sujin] = 1;

		while (!q.isEmpty()) {
			int now = q.poll();

			if (now == sis) {
				break;

			}
			if (now + 1 <= 100000 && graph[now + 1] == 0) {
				q.add(now + 1);

				graph[now + 1] = graph[now] + 1;
			}
			if (now - 1 >= 0 && graph[now - 1] == 0) {
				q.add(now - 1);

				graph[now - 1] = graph[now] + 1;
			}
			if (now * 2 <= 100000 && graph[now * 2] == 0) {
				q.add(now * 2);

				graph[now * 2] = graph[now] + 1;
			}

		}
		System.out.println(graph[sis] - 1);

	}
}
