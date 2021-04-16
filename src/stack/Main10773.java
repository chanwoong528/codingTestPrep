package stack;

import java.util.Scanner;
import java.util.Stack;

public class Main10773 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack<Integer> s = new Stack<Integer>(); 
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt(); 
			if(val != 0) {
				s.push(val);
				
			}
			else {
				s.pop(); 
			}
			
		}
		int result = 0; 
		while(!s.isEmpty()) {
			
			result = result+s.pop(); 
			
		}
		System.out.println(result);
		
	}

}
