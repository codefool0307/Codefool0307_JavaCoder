package class04;

public class Code03_SnacksWays {

	public static int ways1(int[] arr, int w) {
		return process(arr, 0, w);
	}

	public static int process(int[] arr, int index, int rest) {
		if (rest < 0) {
			return -1;
		}
		if (index == arr.length) {
			return 1;
		}
		int next1 = process(arr, index + 1, rest);
		int next2 = process(arr, index + 1, rest - arr[index]);
		return next1 + (next2 == -1 ? 0 : next2);

	}

	public static int ways2(int[] arr, int w) {
		int N = arr.length;
		int[][] dp = new int[N + 1][w + 1];
		for (int j = 0; j <= w; j++) {
			dp[N][j] = 1;
		}
		for (int i = N - 1; i >= 0; i--) {
			for (int j = 0; j <= w; j++) {
				dp[i][j] = dp[i + 1][j] + ((j - arr[i] >= 0) ? dp[i + 1][j - arr[i]] : 0);
			}
		}
		return dp[0][w];
	}

	public static int ways3(int[] arr, int w) {
		int N = arr.length;
		int[][] dp = new int[N][w + 1];
		for (int i = 0; i < N; i++) {
			dp[i][0] = 1;
		}
		if (arr[0] <= w) {
			dp[0][arr[0]] = 1;
		}
		for (int i = 1; i < N; i++) {
			for (int j = 1; j <= w; j++) {
				dp[i][j] = dp[i - 1][j] + ((j - arr[i]) >= 0 ? dp[i - 1][j - arr[i]] : 0);
			}
		}
		int ans = 0;
		for (int j = 0; j <= w; j++) {
			ans += dp[N - 1][j];
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 9 };
		int w = 8;
		System.out.println(ways1(arr, w));
		System.out.println(ways2(arr, w));
		System.out.println(ways3(arr, w));

	}

}
