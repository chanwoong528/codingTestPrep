package greedy;

import java.util.Scanner;

public class Main19939 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int k = sc.nextInt();
		int total = n; 
		int count = 0;  
		for(int i =0; i < k; i++) {
			count++;
	 
			total = total-count; 
			//System.out.println("total"+ total);
	//		System.out.println("i"+i+" " +k);
			
		}
		if(total <0) {
			System.out.println(-1);
		}
		else if(total%k==0) {
			System.out.print(k-1);
		}
		else if(total %k!=0) {
			System.out.print(k);
		}
		
	
		
	
		
		
		// 5 max 5  > 3! ==-1 
		// n < k! ==> true
		//3   1+2+3
		
//		System.out.println(n);
//		System.out.println(k);
		
	}

}
