package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main12015 {
	private static int[] arr;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		arr = new int[n];
		ArrayList<Integer> listSize = new ArrayList<>();
		listSize.add(0);
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			if (listSize.get(listSize.size() - 1) < arr[i]) {

				System.out.println("add " + (listSize.size() - 1) + ":" + arr[i]);

				listSize.add(arr[i]);

			} else {
				int start = 1;
				int end = listSize.size() - 1;
				int mid = 0;
				while (start < end) {
					mid = (start + end) / 2;
					if (listSize.get(mid) < arr[i]) {
						start = mid + 1;
					} else {
						end = mid;
					}
				}
				listSize.set(end, arr[i]);
				System.out.println("set " + end + ":" + arr[i]);
			}

		}
		System.out.println("result:" + (listSize.size() - 1));
		System.out.println("result:" + (listSize.toString()));
	}

}
