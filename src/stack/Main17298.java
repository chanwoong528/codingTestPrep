package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main17298 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		Stack<Integer> s = new Stack<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder(); 
		for (int i = 0; i < n; i++) {

			arr[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {

			while (!s.isEmpty() && arr[s.peek()] < arr[i]) {
				arr[s.peek()] = arr[i];
				s.pop();

			}
			s.push(i);
			
		}
		while(!s.isEmpty()) {
			arr[s.pop()] = -1;
			
		}
		for (int i = 0; i < n; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);

	}

}
