package greedy;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main2217 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      
			int n = sc.nextInt();
	        int []arr = new int[n];
	        int max = 0;
	        for(int i = n-1; i >=0; i--) {
	    	 arr[i]= sc.nextInt();
	    	 
	        }
	    	 
	        Arrays.sort(arr); 
//	     3
//	     1   3
//	     10  30
//	     15  45
	     
	     
	     
	    int count = 1;
	    max = count*arr[0];
	        for(int i =arr.length-1;  i>=0; i--) {
		    	 
	        	      	
	        	 if(max <count*arr[i]) {
	        		 
	        		 max = count*arr[i];
	        		 
	        	 }
		    	 //System.out.println(arr[i] +" "+ max+ "i"+count);
		    	 count++;
	        }
	        System.out.println(max );
	}

}
