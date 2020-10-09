package class06;

public class Code05_Light {

	public static int minLight1(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}
		return process(s.toCharArray(), 0, true);
	}

	// 当前来到了i位置
	// 函数潜台词：
	// help[0..i-2]不需要操心
	// pre表示i-1位置是否点亮
	// 返回如果把所有位置都点亮，help[i..最后]需要至少几盏灯
	// process(help, i, true)
	// 表示help[0..i-2]上都已经点亮了，i-1位置也点亮的情况下，help[i..最后]需要几盏灯
	// process(help, i, false)：
	// 表示help[0..i-2]上都已经点亮了，但是i-1位置没亮的情况下，help[i..最后]需要几盏灯
	public static int process(char[] str, int i, boolean pre) {
		if (i == str.length) { // base case
			return pre ? 0 : -1;
		}
		if (i == str.length - 1) { // base case
			if (!pre && str[i] == 'X') {
				return -1;
			}
			if (pre && str[i] == 'X') {
				return 0;
			}
			return 1;
		}
		// 至少需要的灯的数量
		int ans = Integer.MAX_VALUE;
		int restLight = 0;
		if (pre) { // i-1位置是亮的
			if (str[i] == 'X') { // 当前是障碍，默认i位置是亮的，也不能放灯
				// 直接从i+1考虑即可
				restLight = process(str, i + 1, true);
				ans = Math.min(ans, restLight);
			} else { // i位置不是障碍，不亮、可以放灯
				// 可能性1，在i位置放灯
				// 可能性2，在i位置不放灯
				restLight = process(str, i + 1, false);
				if (restLight != -1) {
					ans = Math.min(ans, restLight);
				}
				// 决定在i位置放灯， process(str, i + 1, true);
				restLight = process(str, i + 2, true);
				if (restLight != -1) {
					ans = Math.min(ans, restLight + 1);
				}
			}
		} else { // i-1位置是不亮的，而且需要亮
			if (str[i] == 'X') {
				ans = -1;
			} else { // 一定要在i位置放灯
				restLight = process(str, i + 2, true);
				if (restLight != -1) {
					ans = Math.min(ans, restLight + 1);
				}
			}
		}
		return ans == Integer.MAX_VALUE ? -1 : ans;
	}

	public static int minLight2(String road) {
		char[] str = road.toCharArray();
		int index = 0;
		int light = 0;
		while (index < str.length) {
			if (str[index] == 'X') {
				index++;
			} else { // str[index] == '.'
				light++;
				if (index + 1 == str.length) {
					break;
				} else {
					if (str[index + 1] == 'X') {
						index = index + 2;
					} else {
						index = index + 3;
					}
				}
			}
		}
		return light;
	}

	public static String randomString(int len) {
		char[] res = new char[(int) (Math.random() * len) + 1];
		for (int i = 0; i < res.length; i++) {
			res[i] = Math.random() < 0.5 ? 'X' : '.';
		}
		return String.valueOf(res);
	}

	public static void main(String[] args) {
		int len = 20;
		int testTime = 300000;
		for (int i = 0; i < testTime; i++) {
			String test = randomString(len);
			int ans1 = minLight1(test);
			int ans2 = minLight2(test);
			if (ans1 != ans2) {
				System.out.println("oops!");
				System.out.println(test);
				System.out.println(ans1);
				System.out.println(ans2);
				break;
			}
		}
	}
}
