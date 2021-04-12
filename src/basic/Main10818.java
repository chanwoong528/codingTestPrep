package basic;

import java.util.Scanner;

public class Main10818 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		
		int []arr = new int[n]; 
		for(int i =0; i <n; i++) {
			arr[i]= sc.nextInt();
		}
		int max = -2000000;
		int min = 2000000; 
		for(int i =0; i <n; i++) {
			if(arr[i]>=max ) {
				max = arr[i];
			}
			if(arr[i]<=min) {
				min = arr[i];
			}
			
			
			
			//System.out.print(arr[i]+" ");
		}
		System.out.println(min+" "+ max );
		
	}

}
