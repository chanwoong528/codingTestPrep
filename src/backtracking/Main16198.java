package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Collections;
import java.util.StringTokenizer;

public class Main16198 {
	public static int arr[];
	public static int result[];
	public static boolean visited[];
	public static ArrayList<Integer> list = new ArrayList<>();
	public static int n;
	public static int m;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		visited = new boolean[n];
		result = new int[m];
		StringBuilder sb = new StringBuilder(); 
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		back(0); 
		Collections.sort(list);
		if(list.size()==0) {
			sb.append(-1);  
		}
		else {
			for(int i = 0; i <list.size();i++) {
				sb.append(list.get(i)).append(" "); 
			}
		}
		System.out.println(sb); 
	}

	public static void back(int count) {
		if (count == m) {
			int sum = 0;
			for (int i = 0; i < m; i++) {
				sum = sum + result[i];

			}
			if (isPrime(sum)&&!list.contains(sum)) {
				list.add(sum);
			}

			return;

		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				result[count] = arr[i];
				back(count + 1);
				visited[i] = false;

			}
		}

	}

	public static boolean isPrime(int val) {
		if(val == 1) {
			return false; 
		}
		for (int i = 2; i <= Math.sqrt(val); i++) {
			if (val % i == 0) {
				return false;

			}

		}
		return true;

	}

}
