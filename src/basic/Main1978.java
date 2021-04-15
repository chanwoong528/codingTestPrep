package basic;

import java.util.Scanner;

public class Main1978 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count=0;
		for(int i =0; i <n; i++) {
			
			int a = sc.nextInt(); 
			if(isPrime(a)) {
				count++;
			}
			
		}
		System.out.println(count);
	}


 static boolean isPrime(int num) {
	 
	 if (num == 1) {
		 return false; 
	 }
	 
	 for(int i = 2; i <num; i++) {
		 if(num%i==0) {
			 return false;  
		 }
		 
		 
	 }
	 
	 return true; 
 } 
}
