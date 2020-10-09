package class02;

public class Code02_NumToStringWays {

	public static int convertWays(int num) {
		if (num < 1) {
			return 0;
		}
		return process(String.valueOf(num).toCharArray(), 0);
	}

	// 0..index-1  已经转换完毕，并且转换正确
	// str[index...] 能转出多少种有效的字符串表达
	public static int process(char[] str, int index) {
		if (index == str.length) {
			return 1;
		}
		// index及其后续是还有数字字符的
		// 0..
		if (str[index] == '0') { // 开头为0
			return 0;
		}
		// index及其后续是还有数字字符的，且不以0开头，以1~9开头
		int res = process(str, index + 1); // 做了一个决定，就让str[index]自己作为一个部分
		if (index == str.length - 1) { // 除了index之外，后续没有字符串了
			return res;
		}
		// index+1依然没越界
		// index和index+1 共同构成一个部分   <27
		if (((str[index] - '0') * 10 + str[index + 1] - '0') < 27) {
			res += process(str, index + 2);
		}
		return res;
	}

	// 还能简化
	public static int dpways(int num) {
		if (num < 1) {
			return 0;
		}
		char[] str = String.valueOf(num).toCharArray();
		int N = str.length;
		int[] dp = new int[N + 1];
		dp[N] = 1;
		dp[N - 1] = str[N - 1] == '0' ? 0 : 1;
		for (int i = N - 2; i >= 0; i--) {
			if (str[i] == '0') {
				dp[i] = 0;
			} else {
				dp[i] = dp[i + 1]
						+ (((str[i] - '0') * 10 + str[i + 1] - '0') < 27 ? dp[i + 2]
								: 0);
			}
		}
		return dp[0];
	}

	public static void main(String[] args) {
		int test = 111143311;
		System.out.println(convertWays(test));
		System.out.println(dpways(test));
	}

}
