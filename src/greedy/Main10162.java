package greedy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main10162 {

	public static void main(String[] args) {
		
		int time = 0; 
		int count = 0; 
		int []arr = {300,60,10};
		int five = 0;
		int one = 0; 
		int ten = 0; 
		
		Scanner sc = new Scanner(System.in);
	    time = sc.nextInt();
	    for(int i =0; i < arr.length; i++) {
	    	int x = 0;
	    	if(time%arr[i]<arr[i]) {
	    	//	System.out.println(time%arr[i]+" "+arr[i]);
	    		
	    		x = time/arr[i];
	    		if(arr[i]==300&&x!=0) {
	    			five=+x;
	    		}
	    		if(arr[i]==60&&x!=0) {
	    			one=+x;
	    		}
	    		if(arr[i]==10&&x!=0) {
	    			ten=+x;
	    		}
	    		count = count+x;
	    		time = time - x*arr[i]; 
	   // 		System.out.println(count+" "+time+" "+x);
	    	}if(time!=0)
	    	{
	    		count = -1; 
	    	}
	    	
	    
	    }
	    System.out.println(time==0?(five+" "+one+" "+ten):-1);
	  
	    
				
			
			
		 
		
		

	}

}
