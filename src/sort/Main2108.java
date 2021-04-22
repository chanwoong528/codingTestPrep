package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[8001];
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int sort[] = new int[n];
		for (int i = 0; i < n; i++) {

			int val = Integer.parseInt(br.readLine());
			if (val < min) {
				min = val;
			}
			if (val > max) {
				max = val;
			}
			System.out.println(sum + ":" + val);
			sum = sum + (val);
			
			arr[val + 4000]++;
		}
		
		int maxCount = 0;
		int result = 0;
		int index = 0;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxCount) {
				maxCount = arr[i];
				result = i - 4000;
				flag = true;
			} else if (maxCount == arr[i] && flag == true) {
				flag = false;
				result = i - 4000;
			}
			while (arr[i] > 0) {
				sort[index] = i - 4000;
				index++;
				arr[i]--;
			}

		}

		System.out.println(Math.round(((double)sum/n)));
		System.out.println(sort[n / 2]);
		System.out.println(result);
		System.out.println(max - min);
	}

}
