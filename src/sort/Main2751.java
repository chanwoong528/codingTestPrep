package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main2751 {
	private static int[] arr;
	private static int[] temp;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		arr = new int[n];
		temp = new int[arr.length + 1];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		mergeSort(0, arr.length - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		// PriorityQueue<Integer> q = new PriorityQueue<>();
//		for (int i = 0; i < n; i++) {
//			q.add(Integer.parseInt(br.readLine()));
//		}
//		while (!q.isEmpty()) {
//			sb.append(q.poll()).append("\n");
//			
//		}
//
//		System.out.println(sb);
//		
	}

	public static void mergeSort(int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;

			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int pStart = start;
			int qEnd = mid + 1;
			int index = pStart;
			while (pStart <= mid || qEnd <= end) {
				if (end > qEnd || (pStart <= mid && arr[pStart] < arr[qEnd])) {

					temp[index++] = arr[pStart++];
				} else {
					temp[index++] = arr[qEnd++];
				}
			}
			for (int i = start; i <= end; i++) {
				arr[i] = temp[i];
			}
		}

	}
}
