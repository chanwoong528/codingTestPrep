package swBasicBFSDFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main14226 {
	public static int emo[][];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		emo = new int[1000][2];
		int curNum = 1;
		int goalNum = Integer.parseInt(br.readLine());

	}

	public static void bfs(int cur, int goal) {
		Queue<Integer> q = new LinkedList<>();
		q.add(cur);
		while(!q.isEmpty()) {
			int clipBoardEmo = q.poll(); 

			if(cur == goal) {
				break; 
			}
			// 복사하고 붙이기  +2
		
			
			// 가지고있는거 붙이기 +1
			
			// 지우기  +1
		
			
		}
		
			
	}

}
