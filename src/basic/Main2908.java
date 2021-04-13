package basic;

import java.util.Scanner;

public class Main2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		String first = sc.next(); 
		String second = sc.next();
		String newFirst="";
		String newSecond="";
		
		for(int i = first.length()-1; i>= 0; i--) {
			
			newFirst = newFirst + first.charAt(i);
			newSecond=newSecond+second.charAt(i);
		}
		

	System.out.println(Integer.parseInt(newFirst)>Integer.parseInt(newSecond)?newFirst:newSecond );
	
		
	
		

	}

}
