package greedy;
import java.util.Scanner;

public class Main2389 {
//2839
	public static void main(String[] args) {
		int total = 0;  
        int count = 0;
        Scanner sc = new Scanner(System.in);
       total = sc.nextInt();
        
       while(total>= 0) {
    	   if(total %5==0) {
    		   count = count +total/5;
    		   total = 0; 
    	   break; 
    	   }
    	   else {
    		    total = total -3;
    		    count++;
    		    
    	   }
    	   if(total<0) {
    		   count = -1;
    		   break; 
    	   }
    	   
    	   
    	   
       }
			System.out.println(count);
			//  System.out.println("total:"+total);
		  
		
	}

}
