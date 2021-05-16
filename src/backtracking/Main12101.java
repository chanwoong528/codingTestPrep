package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main12101 {
	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static int n;
	public static int k;
	public static int cnt;
	public static boolean flag = false; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		visited = new boolean[n+1];
		back(0, 0);
		if(flag==false) {
			System.out.println(-1); 
		}
	}

	public static void back(int count, int sum) {
		
		
		if (sum > n) {
			return;
		}
		if (sum == n) {
			cnt++;
			if (cnt == k) {
				flag = true; 
				for (int i = 0; i < count - 1; i++) {
					System.out.print(arr[i] + "+");
				}
				System.out.print(arr[count - 1]);
				return;
			}
		}

		for (int i = 1; i <= 3; i++) {

			arr[count] = i;
			back(count + 1, sum + i);

		}

	}

}
