package greedy;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main1715 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		 int n = sc.nextInt(); 
		 int total =0;
		  
		
		 for(int i = 0; i< n; i++) {
			 int numCard = sc.nextInt();
			pq.add(numCard);
		 }
	while(pq.size()>1) {
		
		int first = pq.poll();
		int second = pq.poll(); 
		total = total + first+second;
		pq.add(first+second);
		
	}
	
		 
		System.out.print(total);

	}

}
