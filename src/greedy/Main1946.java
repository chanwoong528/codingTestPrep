package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

import java.util.Arrays;
import java.util.Comparator;


public class Main1946 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int count[];
		count = new int[t];
		for (int i = 0; i < t; i++) {

			int n = Integer.parseInt(br.readLine());
			int arr[][];
			arr = new int[n][2];
			
			for (int j = 0; j < n; j++) {
				String line = br.readLine();
				String[] strArr = line.split(" ");
				arr[j][0] = Integer.parseInt(strArr[0]);
				arr[j][1] = Integer.parseInt(strArr[1]);
			}
			Arrays.sort(arr, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					if (o1[1] == o2[1]) {
						return o1[0] - o2[0];
					}
					return o1[1] - o2[1];
				}
			});
			int temp = arr[0][0];
			for (int j = 0; j < n; j++) {
				if (temp >= arr[j][0]) {// Åë°ú
					temp = arr[j][0];
					count[i]++;
				}
			}

			
		}
		
		for(int i = 0; i <count.length; i++) {
			System.out.println(count[i]);	
		}
		
	}
}
