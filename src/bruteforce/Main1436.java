package bruteforce;

import java.util.Scanner;

public class Main1436 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int target = 666;
		int count = 1; 
		int n = sc.nextInt(); 
		while(count != n) {
			target++; 
			if(String.valueOf(target).contains("666")) {
				count++;
			}
			
		}
		System.out.println(target); 
		
	}

}
