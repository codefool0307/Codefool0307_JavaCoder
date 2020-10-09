package class06;

public class Code03_BiggestSubBSTInTree {

	public static class Node {
		public int value;
		public Node left;
		public Node right;

		public Node(int data) {
			this.value = data;
		}
	}

	// x无关 左、右 上面最大二叉搜索子树大小 maxBSTSize
	// x有关 左、右是不是搜索二叉树， 左 max 右 min

	public static class ReturnData {
		public int maxBSTSize;
		public boolean isAllBST;
		public int max;
		public int min;

		public ReturnData(int a, boolean b, int c, int d) {
			maxBSTSize = a;
			isAllBST = b;
			max = c;
			min = d;
		}
	}

	public static ReturnData process(Node x) {
		if (x == null) {
			return null;
		}
		ReturnData leftData = process(x.left);
		ReturnData rightData = process(x.right);

		int maxBSTSize = 0;
		boolean isAllBST = false;

		int p1 = Integer.MIN_VALUE;
		if (leftData != null) {
			p1 = leftData.maxBSTSize;
		}
		int p2 = Integer.MIN_VALUE;
		if (rightData != null) {
			p2 = rightData.maxBSTSize;
		}

		int p3 = Integer.MIN_VALUE;

		if ((

		(leftData == null) || (leftData != null && leftData.isAllBST && leftData.max < x.value))

				&&

				((rightData == null) || (rightData != null && rightData.isAllBST && rightData.min > x.value)

				)) {

			p3 = (leftData != null ? leftData.maxBSTSize : 0)

					+ (rightData != null ? rightData.maxBSTSize : 0) + 1;

			isAllBST = true;
		}
		
		maxBSTSize = Math.max(p1, Math.max(p2, p3));

		int max = x.value;
		int min = x.value;
		if (leftData != null) {
			max = Math.max(max, leftData.max);
			min = Math.min(min, leftData.min);
		}
		if (rightData != null) {
			max = Math.max(max, rightData.max);
			min = Math.min(min, rightData.min);
		}
		return new ReturnData(maxBSTSize, isAllBST, max, min);

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

		Node head = new Node(6);
		head.left = new Node(1);
		head.left.left = new Node(0);
		head.left.right = new Node(3);
		head.right = new Node(12);
		head.right.left = new Node(10);
		head.right.left.left = new Node(4);
		head.right.left.left.left = new Node(2);
		head.right.left.left.right = new Node(5);
		head.right.left.right = new Node(14);
		head.right.left.right.left = new Node(11);
		head.right.left.right.right = new Node(15);
		head.right.right = new Node(13);
		head.right.right.left = new Node(20);
		head.right.right.right = new Node(16);

		printTree(head);
		// Node bst = getMaxBST(head);
		// printTree(bst);

	}

}
