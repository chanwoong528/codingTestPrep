package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main1038 {
	public static int n;
	public static ArrayList<Long> list = new ArrayList<>();

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		if (n > 1022) {
			System.out.println(-1);
		}else if(n<=10){
			System.out.println(n);
			
		}
		else {
			for (int i = 0; i < 10; i++) {
				back(i, 1);
			}
			Collections.sort(list);
			System.out.println(list.get(n));
		}

	}

	public static void back(long val, int count) {

		if (count > 10) {
			// 9876543210 == 10
			return;
		}
		list.add(val);

		for (int i = 0; i < val % 10; i++) {
			back(val * 10 + i, count + 1);

		}

	}

}
