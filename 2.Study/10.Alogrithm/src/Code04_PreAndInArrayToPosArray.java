package class06;

import java.util.HashMap;

public class Code04_PreAndInArrayToPosArray {

	public static int[] getPostArray(int[] pre, int[] in) {
		if (pre == null) {
			return null;
		}
		int N = pre.length;
		int[] pos = new int[N];
		set(pre, in, pos, 0, N - 1, 0, N - 1, 0, N - 1);
		return pos;
	}

	public static void set(int[] pre, int[] in, int[] pos, int prei, int prej, int ini, int inj, int posi, int posj) {
		if (prei > prej) {
			return;
		}
		if (prei == prej) { // 只剩下一个数了，直接填
			pos[posi] = pre[prei];
		}
		pos[posj] = pre[prei];
		int find = ini;
		for (; find <= inj; find++) {
			if (in[find] == pre[prei]) {
				break;
			}
		}
		// in ini..find-1 find+1...inj
		set(pre, in, pos, prei + 1, prei + find - ini, ini, find - 1, posi, posi + find - ini - 1);
		set(pre, in, pos, prei + find - ini + 1, prej, find + 1, inj, posi + find - ini, posj - 1);
	}

	// 没有重复值
	public static int[] getPosArray(int[] pre, int[] in) {
		if (pre == null || in == null) {
			return null;
		}
		int len = pre.length;
		int[] pos = new int[len];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < len; i++) {
			map.put(in[i], i);
		}
		setPos(pre, 0, len - 1, in, 0, len - 1, pos, len - 1, map);
		return pos;
	}

	// 返回值
	// 整棵树依次填写在后续数组s中，从右往左
	// 整棵树都填完之后，后续应该填的位置，作为返回值，返回
	public static int setPos(int[] pre, int pi, int pj, int[] in, int ni, int nj, int[] s, int si,
			HashMap<Integer, Integer> map) {
		if (pi > pj) { // 无效范围时，什么也不做
			return si;
		}
		s[si--] = pre[pi];
		int i = map.get(pre[pi]); // 头节点在中序序列中的位置
		// 中序中，找到了头这个值，所在何处，所以，知道，右树，左树分别是多大
		// pre[pj - nj + i + 1 .. pj] 对应上 in[i + 1, nj]
		// 是右树的，先序和中序的结果
		// si
		si = setPos(pre, pj - nj + i + 1, pj, in, i + 1, nj, s, si, map);
		return setPos(pre, pi + 1, pi + i - ni, in, ni, i - 1, s, si, map);
	}

	public static void printArray(int[] arr) {
		if (arr == null) {
			return;
		}
		for (int i = 0; i != arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] pre = { 1, 2, 4, 5, 3, 6, 7 };
		int[] in = { 4, 2, 5, 1, 6, 3, 7 };
		int[] pos1 = getPosArray(pre, in);
		int[] pos2 = getPostArray(pre, in);
		printArray(pos1);
		printArray(pos2);

	}
}
