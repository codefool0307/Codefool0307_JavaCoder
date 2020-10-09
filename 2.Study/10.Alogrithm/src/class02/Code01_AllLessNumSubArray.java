package class02;

import java.util.*;

public class Code01_AllLessNumSubArray {

	static List<List<String>> mergeAccount(List<List<String>> accounts) {
		Map<String, String> emailToName = new HashMap();
		Map<String, ArrayList<String>> graph = new HashMap();
		for (List<String> account: accounts) {
			String name = "";
			for (String email: account) {
				if (name == "") {
					name = email;
					continue;
				}
				graph.computeIfAbsent(email, x-> new ArrayList<String>()).add(account.get(1));
				graph.computeIfAbsent(account.get(1), x-> new ArrayList<String>()).add(email);
				emailToName.put(email, name);
			}
		}

		Set<String> seen = new HashSet();
		List<List<String>> ans = new ArrayList();
		for (String email: graph.keySet()) {
			if (!seen.contains(email)) {
				seen.add(email);
				Stack<String> stack = new Stack();
				stack.push(email);
				List<String> component = new ArrayList();
				while (!stack.empty()) {
					String node = stack.pop();
					component.add(node);
					for (String nei: graph.get(node)) {
						if (!seen.contains(nei)) {
							seen.add(nei);
							stack.push(nei);
						}
					}
				}
				Collections.sort(component);
				component.add(0, emailToName.get(email));
				ans.add(component);
			}
		}
		return ans;
	}
	}



	public static String remove(String str) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			char everyWord = str.charAt(i);
			int firstindex = str.indexOf(everyWord);
			int lastindex = str.lastIndexOf(everyWord);
			if (lastindex==firstindex||firstindex==i){
				sb.append(everyWord);
			}
			return sb.toString();

		}
	}
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()){
			if (c=='('){
				stack.push(')');
			}else if (c=='['){
				stack.push(']');
			}else if (c=='{'){
				stack.push('}');
			}else if (stack.isEmpty()||stack.pop()!=c) {
				return false;
			}
		}
		return stack.isEmpty();

	}
	public static int getNum(int[] arr, int num) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		LinkedList<Integer> qmin = new LinkedList<Integer>();
		LinkedList<Integer> qmax = new LinkedList<Integer>();
		int L = 0;
		int R = 0;
		int res = 0;
		while (L < arr.length) { // L是开头位置
			while (R < arr.length) { // R是最后一个达标位置的再下一个
				while (!qmin.isEmpty() && arr[qmin.peekLast()] >= arr[R]) {
					qmin.pollLast();
				}
				qmin.addLast(R);
				while (!qmax.isEmpty() && arr[qmax.peekLast()] <= arr[R]) {
					qmax.pollLast();
				}
				qmax.addLast(R);
				if (arr[qmax.getFirst()] - arr[qmin.getFirst()] > num) {
					break;
				}
				R++;
			}
			res += R - L;
			if (qmin.peekFirst() == L) {
				qmin.pollFirst();
			}
			if (qmax.peekFirst() == L) {
				qmax.pollFirst();
			}
			L++;
		}
		return res;
	}

	// for test
	public static int[] getRandomArray(int len) {
		if (len < 0) {
			return null;
		}
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = (int) (Math.random() * 10);
		}
		return arr;
	}

	// for test
	public static void printArray(int[] arr) {
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] arr = getRandomArray(30);
		int num = 5;
		printArray(arr);
		System.out.println(getNum(arr, num));

	}

}
