package basic;

import java.util.Scanner;

public class Main2562 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		boolean []arr = new boolean[42];
		for (int i = 0; i < 10; i++) {
			arr[sc.nextInt()%42]= true;
		}

		
		int count = 0;
		for (int i = 0; i < 42; i++) {
			if(arr[i]==true) {
				count++;
			}
			
		}
	

	
System.out.print(count);
		
	}

}
