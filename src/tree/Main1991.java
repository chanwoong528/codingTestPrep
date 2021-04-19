package tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1991 {
	static class Node {
		char data;
		Node left;
		Node right;

		Node(char data) {
			this.data = data;
		}

	}

	static class Tree {
		Node root;

		public void createNode(char data, char leftD, char rightD) {
			if (root == null) {
				if (data != '.') {
					root = new Node(data);
				}
				if (leftD != '.') {
					root.left = new Node(leftD);
				}
				if (rightD != '.') {
					root.right = new Node(rightD);
				}

			} else
				searchNode(root, data, leftD, rightD);

		}

		public void searchNode(Node root, char data, char leftD, char rightD) {
			if (root == null) {
				return; // no root means no tree;
			} else if (root.data == data) {
				if (leftD != '.') {
					root.left = new Node(leftD);
				}
				if (rightD != '.') {
					root.right = new Node(rightD);
				}
			} else {
				searchNode(root.left, data, leftD, rightD);
				searchNode(root.right, data, leftD, rightD);

			}

		}

		public void preOrder(Node root) {
			// (루트) (왼쪽 자식) (오른쪽 자식)
			System.out.print(root.data);
			if (root.left != null) {
				preOrder(root.left);
			}
			if (root.right != null) {
				preOrder(root.right);
			}
		}

		public void inOrder(Node root) {
			// (왼쪽 자식) (루트) (오른쪽 자식)
			if (root.left != null) {
				inOrder(root.left);
			}
			System.out.print(root.data);
			if (root.right != null) {
				inOrder(root.right);
			}

		}

		public void postOrder(Node root) {
			// (왼쪽 자식) (오른쪽 자식) (루트)
			if (root.left != null) {
				postOrder(root.left);
			}
			if (root.right != null) {
				postOrder(root.right);
			}

			System.out.print(root.data);
		}
	

	}

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		Tree t = new Tree();
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			char center = st.nextToken().charAt(0);
			char left = st.nextToken().charAt(0);
			char right = st.nextToken().charAt(0);
			t.createNode(center, left, right);

		}
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
	}

}
