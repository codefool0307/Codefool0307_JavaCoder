package class01;

public class Code06_RandToRand {

	// 底层依赖一个等概率返回a~b的随机函数f，
	// 如何加工出等概率返回c~d的随机函数
	public static int g(int a, int b, int c, int d) {
		int range = d - c;
		int num = 1;
		while ((1 << num) - 1 < range) {
			num++;
		}
		int ans = 0;
		do {
			ans = 0;
			for (int i = 0; i < num; i++) {
				ans += (rand01(a, b) << i);
			}
		} while (ans > range);
		return ans + c;
	}

	// 底层依赖一个等概率返回a~b的随机函数f，
	// 如何加工出等概率返回0和1的随机函数
	public static int rand01(int a, int b) {
		int size = b - a + 1;
		boolean odd = size % 2 != 0;
		int mid = size / 2;
		int ans = 0;
		do {
			ans = f(a, b) - a;
		} while (odd && ans == mid);
		return ans < mid ? 0 : 1;
	}

	public static int f(int a, int b) {
		return a + (int) (Math.random() * (b - a + 1));
	}

	// 底层依赖一个以p概率返回0，以1-p概率返回1的随机函数rand01p
	// 如何加工出等概率返回0和1的函数
	public static int rand01(double p) {
		int num;
		do {
			num = rand01p(p);
		} while (num == rand01p(p));
		return num;
	}

	public static int rand01p(double p) {
		return Math.random() < p ? 0 : 1;
	}

	public static void main(String[] args) {
		int a = 2;
		int b = 7;
		int c = 3;
		int d = 10;
		int[] ans = new int[d + 1];
		int testTime1 = 1000000;
		for (int i = 0; i < testTime1; i++) {
			ans[g(a, b, c, d)]++;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

		int testTime2 = 10000000;
		int count2 = 0;
		// p是返回0的概率，1-p是返回1的概率，不管你怎么指定，都能调成0和1等概率返回
		double p = 0.88;
		for (int i = 0; i < testTime2; i++) {
			if (rand01(p) == 0) {
				count2++;
			}
		}
		System.out.println((double) count2 / (double) testTime2);

	}

}
