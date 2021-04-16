package basic;

import java.util.Scanner;

public class Main4153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		while (true) {

			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			if(a==0) {
				break; 
			}
			if (a * a + b * b == c * c||a * a  == c * c + b * b|| b * b ==a * a + c * c)
			{	System.out.println("right");}
			
			else {
				System.out.println("wrong");
			}

		}

	}

}
