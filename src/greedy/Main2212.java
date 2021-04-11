package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main2212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		int k = sc.nextInt(); 
		int []location = new int[n];
		int []diff = new int[n-1];
		
		for(int i = 0; i < n ; i++) {
			location[i] = sc.nextInt(); 
			
		}
		Arrays.sort(location);
		for(int i = 0; i < n-1; i ++) {
			diff[i]= Math.abs(location[i]-location[i+1]);
		}
		Arrays.sort(diff);
		int sum = 0;
		
		
		for(int i = n-k-1; i>=0; i--) {
			
			sum = sum+diff[i];
		}
		System.out.println(sum);
		
	}

}
