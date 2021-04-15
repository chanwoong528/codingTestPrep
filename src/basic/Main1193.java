package basic;

import java.io.IOException;
import java.util.Scanner;

public class Main1193 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int c, N = 0;
		while ((c = System.in.read()) > 13)
			N = 10 * N + c - 48;
		int line = 0;
		int cnt = 0;
		while (cnt < N) {
			line++;
			cnt = line * (line + 1) / 2;
		}

		if (line % 2 != 0) {
			int top = 1 + (cnt - N);
			int bottom = line - (cnt - N);
			System.out.println(top + "/" + bottom);
		} else {
			int top = line - (cnt - N);
			int bottom = 1 + (cnt - N);
			System.out.println(top + "/" + bottom);
		} 

	}

}
