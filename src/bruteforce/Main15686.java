package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main15686 {
	public static int realMin = Integer.MAX_VALUE;
	static ArrayList<int[]> corChicken;
	static ArrayList<int[]> distance;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int city[][] = new int[n + 1][n + 1];

		corChicken = new ArrayList<>();
		ArrayList<int[]> corPeople = new ArrayList<>();
		distance = new ArrayList<>();

		for (int i = 1; i < n + 1; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j < n + 1; j++) {
				city[i][j] = Integer.parseInt(st.nextToken());
				if (city[i][j] == 2) {

					int cor[] = { i, j };
					corChicken.add(cor);
				}
				if (city[i][j] == 1) {

					int cor[] = { i, j };
					corPeople.add(cor);
				}
			}
		}

		for (int k = 0; k < corChicken.size(); k++) {

			int[] peo = new int[corPeople.size()];
			for (int i = 0; i < corPeople.size(); i++) {

				peo[i] = Math.abs(corChicken.get(k)[0] - corPeople.get(i)[0])
						+ Math.abs(corChicken.get(k)[1] - corPeople.get(i)[1]);

			}
			distance.add(peo);

		}
		getMin(0, 0, new int[m][corPeople.size()]);
		System.out.println(realMin);

	}

	public static void getMin(int index, int depth, int[][] arr) {
		if (depth == arr.length) {
			int sum = 0;
			for (int i = 0; i < arr[0].length; i++) {
				int min = Integer.MAX_VALUE;
				for (int j = 0; j < arr.length; j++) {

					if (min > arr[j][i]) {
						min = arr[j][i];
					}
				}

				sum = sum + min;
			}

			if (sum < realMin) {

				realMin = sum;
			}

		} else {
			for (int i = index; i < distance.size(); i++) {
				arr[depth] = distance.get(i);
				getMin(i + 1, depth + 1, arr);

			}

		}

	}

}
