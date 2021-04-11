package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Main1449 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[]arr = new int [n];

		for (int i = 0; i < n; i++) {
			arr[i]= sc.nextInt(); 

		}
		Arrays.sort(arr);
		
		 int start = arr[0];
		 int count = 1; 
		for(int i = 1; i <arr.length;i++) {
			
			
			if(l>=(arr[i]-start+1)) {
				
				continue; 
				
			}
			else {
				start = arr[i];
				count++;
			}
			
				
						
			
		}
		System.out.println(count);

	
	}

}
