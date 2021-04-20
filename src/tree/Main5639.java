package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main5639 {
	public static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}

		public void insertNode(int val) {

			if (val < this.data) {
				if (this.left == null) {
					this.left = new Node(val);
				} else {
					this.left.insertNode(val);
				}

			} else {
				if (this.right == null) {
					this.right = new Node(val);
				} else {
					this.right.insertNode(val);
				}
			}

		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int rootData = Integer.parseInt(br.readLine());
		Node root = new Node(rootData);
		String input;
		while (true) {
			input = br.readLine();
			if (input == null || input.equals("")) {
				break;
			}
			rootData = Integer.parseInt(input);
			root.insertNode(rootData);

		}
		postOrder(root);

	}

	public static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.println(root.data);

		}
	}
}
