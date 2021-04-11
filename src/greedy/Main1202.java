package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1202 {

	static class Stone implements Comparable<Stone> {
		int weight;
		int price;

		private Stone(int weight, int price) {
			this.weight = weight;
			this.price = price;
		}

		@Override
		public int compareTo(Stone o) {
			return this.weight - o.weight;
		}
	}

	public static void main(String[] args) {
		// n -> ������ �������� ���� -> m ���� v ��
		// c -> ���濡 ������ �ִ� ���� 1�� ������ ����

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		Stone[] stoneList = new Stone[n];
		int[] bag = new int[k];
		for (int i = 0; i < n; i++) {

			int m = sc.nextInt();
			int v = sc.nextInt();
			stoneList[i] = new Stone(m, v);

		}
		for (int i = 0; i < k; i++) {
			int bagM = sc.nextInt();

			bag[i] = bagM;

		}
		
		Arrays.sort(stoneList);
		Arrays.sort(bag);
		
		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> Integer.compare(y, x));//�ִ� ������ ����
		int index = 0;
		long result = 0;
		for (int i = 0; i < k; i++) {

			while (index < n && stoneList[index].weight <= bag[i]) {
				pq.add(stoneList[index].price);
				index++;
			}
			if (!pq.isEmpty()) {
				result = result + pq.poll();
			}

		}
		System.out.println(result);
	

//    print ����
//		for (int i = 0; i < n; i++) {
//			System.out.print(stoneList[i].weight+" "+stoneList[i].price);
//			System.out.println(); 
//		}
//		
//		int max = 0; 
//		
//		for (int i = 0; i < k; i++) {
//			 max = bag[k-1];
//			System.out.print(bag[i]);
//			System.out.println(); 
//		}
//		System.out.println(max);
	}

}
