package bruteforce;

import java.util.Scanner;

public class Main2231 {
	

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt(); 
		 
		 
		int result = 0;
		for(int i = 0; i<n; i++) {
			int sum = 0;
			int original = i; 
			while(original!=0) {
				sum += original % 10;	// 각 자릿수 더하기
				original /= 10;
			}
			if(sum +i ==n) {
				result = i; 
				break; 
			}
		}
	System.out.print(result);
		
		
		
		
	}

}
