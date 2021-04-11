package greedy;
import java.util.Scanner;


public class Main5585 {

	
	public static void main(String[] args) {
		int [] arr = {500,100,50,10,5,1};
		int total = 1000; 
		Scanner sc = new Scanner(System.in);
	      int cost = sc.nextInt();
	      int count = 0; 
	      total = total -cost; 
	     
	      for(int i = 0; i < arr.length; i++) {
	    	  int coin = 0; 
	    	  if(total%arr[i] <= arr[i]) {
	    		  coin = total/arr[i];
	    		  count = count+coin; 
	    		  total = total - (arr[i]*coin);
	    		//  System.out.println("arr: "+ ""+arr[i]+" "+coin);
	    		  
			//      System.out.println("total: "+total);
			  //    System.out.println("count: "+count);
			      
			      
	    	  }
	    	  
	    	  
	      }
	      
	      System.out.println(count);
	      
	      
	}

}
