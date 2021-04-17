package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main11866 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> q = new LinkedList(); 
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		while(!q.isEmpty()) {
			for(int i = 1; i <=k; i++) {
				if(i == k) {
					int result = q.poll();
					sb.append(result).append(",").append(" ");
				}else {
					int temp= q.poll();
					q.offer(temp);
				}
				
			
				
			}
			
			
		}
		sb.insert(0, "<");
		sb.setLength(sb.length()-2);
		sb.insert(sb.length(), ">");
		System.out.print(sb);
	}

}
