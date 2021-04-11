package greedy;

import java.util.Scanner;

public class Main1439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		int countOne =0;
		int countZero=0; 
		char start = str.charAt(0);
		if(start =='0') {
			
			countZero++;
		}
		else {
			countOne++;
		}
		for(int i = 0 ; i<str.length(); i++) {
		//	System.out.println(start);
				if(start==str.charAt(i)) {
					continue;
				}
				else {
					if(str.charAt(i)=='0') {
						countZero++; 
						start=str.charAt(i);
					}
					if(str.charAt(i)=='1') {
						countOne++;
						start=str.charAt(i);
					}
				}
			
			
		}
//		System.out.println("zero: "+countZero);
	//	System.out.println("one : "+countOne);
		System.out.println((countOne<countZero?countOne:countZero));
	}

}
