package basic;

import java.util.Scanner;

public class Main1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		long fixCost = sc.nextInt(); 
		long perCost = sc.nextInt(); 
		long price = sc.nextInt(); 
		
	
		
	
		
		if(perCost >= price) {
			System.out.print(-1);
			
		}	
		else {
			System.out.print(fixCost/(price-perCost)+1);
		}
		
			
			


	}

}
