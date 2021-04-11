package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main1758 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int tip[] = new int[n];
		
		for(int i =0; i <n ; i++) {
			tip[i]= sc.nextInt();
		}
		Arrays.sort(tip);
		int rank =0; 
		long sum = 0; 
		for(int i = tip.length-1; i>=0; i--) {
			rank++;
			int money = tip[i]-(rank-1);
			if(money >= 0) {
				sum = sum + money; 
				
			}
			else {
				break;
				}
			
			
		}
		System.out.println(sum);
		
		
		
	}

}
