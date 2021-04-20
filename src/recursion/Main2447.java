package recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main2447 {
	public static boolean map[][];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		map = new boolean[n][n];

		makeStar(0, 0, n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (map[i][j] == true) {
					bw.write("*");
				} else {
					bw.write(" ");
				}

			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static void makeStar(int row, int col, int length) {
		if (length == 1) {
			map[row][col] = true;

		} else {
			
			int newL = length / 3;

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i != 1 || j != 1) {
						makeStar(row + newL * i, col + newL * j, newL);

					}
				}
			}

		}
	}

}
