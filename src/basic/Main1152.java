package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1152 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str = bf.readLine();
		
		String[] strList = str.split(" ");
		
		int result = strList.length;
			if(strList.length==0) {
				result = 0; 
			}
			if(strList.length!=0&&strList[0].isBlank()) {
				result = strList.length-1; 
			}
		
		
		System.out.println(result);

	}

}
