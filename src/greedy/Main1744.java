package greedy;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1744 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {

			arr[i] = sc.nextInt();
		}
		// print
		PriorityQueue<Integer> posPq = new PriorityQueue<>((x, y)-> Integer.compare(y, x));
		PriorityQueue<Integer> negPq = new PriorityQueue<>();
		
		for(int i = 0; i<n; i++) {
			if(arr[i]>0) {
				posPq.add(arr[i]);
			}
			else {
				negPq.add(arr[i]);
			}
		}
		int result = 0; 
		int negResult=0; 
		while(!negPq.isEmpty()) {
			
			int nstart = negPq.poll();
			//System.out.println("nstart"+nstart);
			if(!negPq.isEmpty()) {
	
				negResult = negResult + nstart*negPq.poll();  	
			//	System.out.println(negResult);	
			}
			else {
				negResult=negResult + nstart;
			//	System.out.println(negResult);
			}
			 
								
		}
		int posResult=0; 
		while(!posPq.isEmpty()) {
			int start = posPq.poll();
			//System.out.println("start"+start);
			if(!posPq.isEmpty() && posPq.peek()!=1) {
				
				posResult = posResult+ (start*posPq.poll());  
				//System.out.println(posResult);
			}else {
				posResult = posResult + start;
			//	System.out.println(posResult);
			}
			
			
		}
	//	System.out.println(negResult);
		//System.out.println(posResult);
		result = posResult+negResult; 
		System.out.println(result);
		
		
		
	
			
			
		
	

		
	}

}
