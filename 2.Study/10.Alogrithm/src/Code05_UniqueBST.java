package class02;

import java.util.List;
import java.util.LinkedList;

public class Code05_UniqueBST {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}

	public static int process(int n) {
		if (n < 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}

		int res = 0;
		for (int leftNum = 0; leftNum < n - 1; leftNum++) {
			int leftWays = process(leftNum);
			int rightWays = process(n - 1 - leftNum);
			res += leftWays * rightWays;
		}
		return res;
	}

	public static int numTrees(int n) {
		if (n < 2) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i < n + 1; i++) { // 节点个数为i的时候
			for (int j = 1; j < i + 1; j++) { // 左侧节点个数为j-1，右侧节点个数为i-j
				dp[i] += dp[j - 1] * dp[i - j];
			}
		}
		return dp[n];
	}

	// 假设一共有n个节点，节点值依次1~n
	// list里面装的是不同结构的树的头
	public static List<Node> generateTrees(int n) {
		return generate(1, n);
	}

	// 节点值是 start .. end，形成所有不同的结构返回
	public static List<Node> generate(int start, int end) {
		List<Node> res = new LinkedList<Node>();
		if (start > end) {
			res.add(null);
		}
		Node head = null;
		for (int i = start; i < end + 1; i++) { // 节点值为i的节点，当头节点
			head = new Node(i);
			List<Node> lSubs = generate(start, i - 1);
			List<Node> rSubs = generate(i + 1, end);
			for (Node l : lSubs) {
				for (Node r : rSubs) {
					head.left = l;
					head.right = r;
					res.add(cloneTree(head));
				}
			}
		}
		return res;
	}

	public static Node cloneTree(Node head) {
		if (head == null) {
			return null;
		}
		Node res = new Node(head.value);
		res.left = cloneTree(head.left);
		res.right = cloneTree(head.right);
		return res;
	}

	// for test -- print tree
	public static void printTree(Node head) {
		System.out.println("Binary Tree:");
		printInOrder(head, 0, "H", 17);
		System.out.println();
	}

	public static void printInOrder(Node head, int height, String to, int len) {
		if (head == null) {
			return;
		}
		printInOrder(head.right, height + 1, "v", len);
		String val = to + head.value + to;
		int lenM = val.length();
		int lenL = (len - lenM) / 2;
		int lenR = len - lenM - lenL;
		val = getSpace(lenL) + val + getSpace(lenR);
		System.out.println(getSpace(height * len) + val);
		printInOrder(head.left, height + 1, "^", len);
	}

	public static String getSpace(int num) {
		String space = " ";
		StringBuffer buf = new StringBuffer("");
		for (int i = 0; i < num; i++) {
			buf.append(space);
		}
		return buf.toString();
	}

	public static void main(String[] args) {
		int n = 4;
		System.out.println(numTrees(n));
		List<Node> res = generateTrees(n);
		for (Node node : res) {
			printTree(node);
		}
	}

}
