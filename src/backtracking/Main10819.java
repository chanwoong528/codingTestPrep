package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10819 {

	public static int arr[];
	public static boolean visited[];
	public static int n;
	public static int result;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

		}

	}

	public static void back(int count) {
		if (count == n) {
			return;
		}
		
		for(int i = 0; i<n; i++) {
			if(visited[i] ==false) {
				visited[i] = true; 
				
			}
			
		}
	
	}

}
