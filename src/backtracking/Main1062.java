package backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1062 {

	public static int n;
	public static int k;
	public static boolean[] visited = new boolean[26];
	public static String word[];
	public static int max = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		word = new String[n];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			str = str.replace("anta", "");
			str = str.replace("tica", "");
			word[i] = str;
		}
		visited['a' - 'a'] = true;
		visited['c' - 'a'] = true;
		visited['i' - 'a'] = true;
		visited['n' - 'a'] = true;
		visited['t' - 'a'] = true;
		if(k <5) {
			max = 0; 
		}
		back(0, 0);
		System.out.println(max);

	}

	public static void back(int count, int idx) {
		if (count == k - 5) {
			int numRead = 0;
			for (int i = 0; i < n; i++) {
				boolean readable = true;
				for (int j = 0; j < word[i].length(); j++) {
					if (visited[word[i].charAt(j) - 'a'] == false) {
						readable = false;
						break;
					}

				}
				if (readable == true) {
					numRead++;
				}

			}
			if (numRead > max) {
				max = numRead;
			}

			return;
		}
		for (int i = idx; i < 26; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				back(count + 1, i);
				visited[i] = false;
			}
		}
	}

}
