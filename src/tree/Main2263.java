package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import tree.Main1991.Node;
import tree.Main1991.Tree;

public class Main2263 {

	static int n;
	static int inOrder[];
	static int postOrder[];
	static int pos[];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		inOrder = new int[n+1];
		postOrder = new int[n+1];
		pos = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			inOrder[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			postOrder[i] = Integer.parseInt(st.nextToken());
		}
		for (int i = 0; i < n; i++) {
			pos[inOrder[i]] = i;

		}

		int root = postOrder[n - 1];
		preOrder(0, n - 1, 0, n - 1);

	}

	public static void preOrder(int iStart, int iEnd, int pStart, int pEnd) {

		if (iStart > iEnd || pStart > pEnd)
			return;
		int root = postOrder[pEnd];
		System.out.print(root+" ");
		int inOrderRootIdx = pos[root];
		int numLeftInOrder = inOrderRootIdx - iStart;
		preOrder(iStart, inOrderRootIdx-1, pStart, pStart+numLeftInOrder-1);
		preOrder(inOrderRootIdx+1, iEnd, pStart+numLeftInOrder, pEnd-1);

	}
}
