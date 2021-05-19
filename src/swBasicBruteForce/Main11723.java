package swBasicBruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main11723 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> set = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> all = new ArrayList<>();
		for (int i = 1; i <= 20; i++) {
			all.add(i);
		}

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String cmd = st.nextToken();

			if (cmd.equals("add")) {
				int temp = Integer.parseInt(st.nextToken());
				if (!set.contains(temp)) {
					set.add(temp);
				}
			}
			if (cmd.equals("remove")) {
				int temp = Integer.parseInt(st.nextToken());
				if (set.contains(temp)) {
					set.remove((Integer) temp);
				}
			}
			if (cmd.equals("check")) {
				int temp = Integer.parseInt(st.nextToken());
				if (set.contains(temp)) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}

			}
			if (cmd.equals("toggle")) {
				int temp = Integer.parseInt(st.nextToken());
				if (set.contains(temp)) {
					set.remove((Integer) temp);
				} else {
					set.add(temp);
				}

			}
			if (cmd.equals("all")) {
				set = new ArrayList<>();
				set.addAll(all);
			}
			if (cmd.equals("empty")) {
				set = new ArrayList<>();

			}
		}

		System.out.println(sb);

	}

}
