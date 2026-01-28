package SwayamTest;

public class OptimalBST {
    static int optimalBST(int[] freq, int n) {
        int[][] dp = new int[n][n];
        int[] pre = new int[n + 1];

        for (int i = 0; i < n; i++)
            pre[i + 1] = pre[i] + freq[i];

        for (int i = 0; i < n; i++)
            dp[i][i] = freq[i];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                int sum = pre[j + 1] - pre[i];

                for (int r = i; r <= j; r++) {
                    int left = (r > i) ? dp[i][r - 1] : 0;
                    int right = (r < j) ? dp[r + 1][j] : 0;
                    dp[i][j] = Math.min(dp[i][j], left + right + sum);
                }
            }
        }
        return dp[0][n - 1];
    }

}
