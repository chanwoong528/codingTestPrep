package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2606 {
	
public static int count; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		boolean visited[] = new boolean[n + 1];
		
		ArrayList<ArrayList<Integer>> graph = new <ArrayList<Integer>>ArrayList();

		for (int i = 1; i <= n + 1; i++) {
			// start from 1 to avoid index of 0;
			graph.add(new <Integer>ArrayList());
		}
		for (int i = 0; i < e; i++) {
			int e1 = sc.nextInt();
			int e2 = sc.nextInt();

			graph.get(e1).add(e2);
			graph.get(e2).add(e1);
		}
		for (int i = 1; i < n + 1; i++) {
			Collections.sort(graph.get(i));
			// System.out.println(graph.get(i).toString());
		}
		dfs(graph, visited, 1);
		
		
		System.out.println((count-1));
	}

	public static void bfs() {

	}

	public static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int startN) {
		
		if (visited[startN] == true) {
			return;
		}
		
		count++;
		//System.out.print(startN +"   ");
				
		visited[startN] = true;
		
		for(int i = 0; i < graph.get(startN).size();i++) {
			if(visited[graph.get(startN).get(i)]==false) {
				
				dfs(graph, visited, graph.get(startN).get(i));
				
			}
			
		}
	}

}
