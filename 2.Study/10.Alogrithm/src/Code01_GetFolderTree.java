package class06;

import java.util.TreeMap;

public class Code01_GetFolderTree {

	public static class Node {
		public String name;
		public TreeMap<String, Node> nextMap;

		public Node(String name) {
			this.name = name;
			nextMap = new TreeMap<>();
		}
	}

	public static void print(String[] folderPaths) {
		if (folderPaths == null || folderPaths.length == 0) {
			return;
		}
		// 根据字符串，把前缀树建立好，头节点为head
		Node head = generateFolderTree(folderPaths);
		
		// 打印
		printProcess(head, 0);
	}

	public static Node generateFolderTree(String[] folderPaths) {
		Node head = new Node(""); // 系统根目录, 前缀树头节点
		for (String foldPath : folderPaths) { // 拿出每一个绝对路径
			String[] paths = foldPath.split("\\\\"); // java 特性，用一个"\"做分割的意思
			Node cur = head;
			for (int i = 0; i < paths.length; i++) {
				if (!cur.nextMap.containsKey(paths[i])) {
					cur.nextMap.put(paths[i], new Node(paths[i]));
				}
				cur = cur.nextMap.get(paths[i]);
			}
		}
		return head;
	}

	// head节点，当前在level层
	public static void printProcess(Node node, int level) {
		if (level != 0) {
			// 2 * (level - 1)
			System.out.println(get2nSpace(level) + node.name);
		}
		for (Node next : node.nextMap.values()) {
			printProcess(next, level + 1);
		}
	}

	public static String get2nSpace(int n) {
		String res = "";
		for (int i = 1; i < n; i++) {
			res += "  ";
		}
		return res;
	}

	public static void main(String[] args) {
		
		//    "a\b\c"
		String test = "a\\b\\c";
		
		System.out.println(test);
		
		//  "a\b\c"    "\"    a,b,c
		String[] arr = test.split("\\\\"); //    \\\\    \\   \
		for(String str : arr) {
			System.out.println(str);
		}
	}

}
