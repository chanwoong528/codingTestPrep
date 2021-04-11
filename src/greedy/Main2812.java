package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Stack;

public class Main2812 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] strArr = line.split(" ");

		int n = Integer.parseInt(strArr[0]);
		int k = Integer.parseInt(strArr[1]);

		String numLine = br.readLine();

		stack.push((int) numLine.charAt(0) - '0');
		int cnt = 0;
		boolean flag = true;

		for (int i = 1; i < numLine.length(); i++) {
			int num = numLine.charAt(i) - '0';

			while (!stack.isEmpty() && flag) {
				// ���ڸ� K�� ������ ��� Ż��
				if (cnt == k) {
					flag = false;
					break;
				}
				// ���ÿ� ����ִ� ������ ch�� ū ��� ����
				if (stack.peek() < num) {
					stack.pop();
					cnt += 1;
				}
				// �ݴ��� ��� �ݺ��� Ż��
				else if (stack.peek() >= num) {
					break;
				}

			}
			stack.push(num);
		}
		StringBuilder sb = new StringBuilder();
		// �ݺ����� �������� �����ؾߵ� ���� ������ �������� ���� ���
		if (cnt < k) {
			// ���� ����� ���� ���� �A��ŭ�� �߰�
			int gap = k - cnt;
			for (int i = 0; i < stack.size() - gap; i++) {
				sb.append(stack.get(i));
			}
		} else {
			for (int i = 0; i < stack.size(); i++) {
				sb.append(stack.get(i));
			}
		}

		System.out.println(sb.toString());

//		for (int i = 0; i < n; i++) {
//
//			int num = (int) numLine.charAt(i) - '0';
//
//			if (stack.isEmpty()) {
//
//				stack.push(num);
//				System.out.println("push" + stack.peek());
//				count++;
//
//			}
//
//			else {    //5       
//				if (target-stack.size()<(n - i)) {
//					if (stack.peek() > num) {
//
//						stack.push(num);
//						System.out.println("push" + stack.peek());
//						count++;
//
//					}
//					if (stack.peek() < num) {
//						System.out.println("pop" + stack.peek());
//						stack.pop();
//						stack.push(num);
//						System.out.println("push" + stack.peek());
//					}
//
//				}
//				else {
//					stack.push(num);
//					System.out.println("push" + stack.peek());
//				}
//
//			}
//
//		}
		// System.out.println("count" + count);

	}

}
