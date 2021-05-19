package swBasicBruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1476 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int ge = 0, gs = 0, gm = 0;
		int year = 0;
		while (e != ge || s != gs || m != gm) {
			ge++;
			gs++;
			gm++;
			if (ge == 16) {
				ge = 1;
			}
			if (gs == 29) {
				gs = 1;
			}
			if (gm == 20) {
				gm = 1;
			}
			year++;

		}
		System.out.println(year);

	}

}
