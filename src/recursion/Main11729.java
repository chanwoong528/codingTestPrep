package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11729 {
	public static StringBuilder sb = new StringBuilder();
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Hanoi(n, 1, 2, 3);
		System.out.println(count);
		System.out.println(sb);
	}

	public static void Hanoi(int n, int start, int mid, int to) {
		if (n == 1) {
			count++;
			sb.append(start + " " + to + "\n");
			return;
		}
		Hanoi(n - 1, start, to, mid);

		sb.append(start + " " + to + "\n");
		count++;
		
		Hanoi(n - 1, mid, start, to);

	}

}
