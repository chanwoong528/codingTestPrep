package swBasicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main10430 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int first = (a + b) % c;
		int second = ((a % c) + (b % c)) % c;
		int third = (a * b) % c;
		int fourth = ((a % c) * (b % c)) % c;

		sb.append(first).append("\n").append(second).append("\n").append(third).append("\n").append(fourth).append("\n");

		System.out.println(sb); 
	}
}
