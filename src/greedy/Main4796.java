package greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List; 

public class Main4796  {

	
	
	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		boolean stop = false;
		int count = 0; 
		List<Integer> result = new ArrayList<>(); 
		while(stop!= true) {
		
			String line = br.readLine();
			String[] strArr = line.split(" ");
			int l = Integer.parseInt(strArr[0]);
			int p = Integer.parseInt(strArr[1]);
			int v = Integer.parseInt(strArr[2]);
			if(l==0&&p==0&&v==0) {
				
				stop = true; 
				break; 
			}
			
			int numNight = v/p; 
			
			int temp = (v%p); 
				if (temp > l) {
					temp = l; 
				}
			
			int total = l*numNight+temp;
			result.add(total);
			
		//	System.out.println("Case "+count+": "+total);			
		}
for(int i=0; i <result.size();i++) {
	System.out.println("Case "+(i+1)+": "+result.get(i));
}
		
		}
		
}
