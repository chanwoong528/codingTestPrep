package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main1874 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[n];
		Stack<Integer> s = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(br.readLine());
			arr[i] = val;
		}

		int index = 0;
		for (int i = 1; i <= arr.length; i++) {
			s.push(i);
			sb.append("+ \n"); 
			while (!s.isEmpty()&&s.peek() == arr[index]) {
				s.pop();
				index++;
				sb.append("- \n");

			}

		}
		if (!s.isEmpty()) {
			System.out.println("NO");
		}
		else {
			System.out.println(sb);
				
		}
		br.close();
	}

}
