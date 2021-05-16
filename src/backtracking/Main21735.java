package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//¸øÇ° 
public class Main21735 {
	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static int n;
	public static int m;
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		visited = new boolean[n];
		result = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		back(0,0); 
		System.out.println(max); 
	}

	public static void back(int count, int index) {
		if (count == m) {
			int sum = 1;
			for (int i = 0; i < m; i++) {
				sum = sum + result[i];
			}
			if (sum > max) {
				max = sum;
			}
			return;
		}
		for (int i = index; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];
				back(count + 1, i);
				visited[i] = false;
			}
		}
	}

}
