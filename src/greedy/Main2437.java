package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main2437 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int []weight = new int [n];
		int min = 1; 
		int max = 0;
		for(int i =0; i<n ; i++) {
			weight[i]= sc.nextInt(); 
			
		}
		Arrays.sort(weight);
		for(int i =0; i<n ; i++) {
			System.out.print(min+" "+weight[i]);
			System.out.println(); 
			if(min>=weight[i]) {
				
				
				min = min+weight[i]; 
			}else {
				break;
			}
			
			
		}
		System.out.print(min);
			
			
			
		

	}

}
