package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main14888 {
	public static int n;
	public static int arr[];
	public static int op[];

	public static int min = Integer.MAX_VALUE;
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		op = new int[4];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < op.length; i++) {
			op[i] = Integer.parseInt(st.nextToken());
		}

		back(1, arr[0]);
		
		System.out.println(max);
		System.out.println(min);

	}

	public static void back(int count, int sum) {

		if (count == n) {

			if (sum > max) {
				max = sum;
			}
			if (sum < min) {
				min = sum;
			}
			return;
		}
		for (int i = 0; i < 4; i++) {
			if (op[i] > 0) {

				op[i]--;

				if (i == 0) {
					back(count + 1, sum + arr[count]);
				}
				if (i == 1) {
					back(count + 1, sum - arr[count]);
				}
				if (i == 2) {
					back(count + 1, sum * arr[count]);
				}
				if (i == 3) {
					back(count + 1, sum / arr[count]);
				}

				op[i]++;
			}

		}

	}

}
