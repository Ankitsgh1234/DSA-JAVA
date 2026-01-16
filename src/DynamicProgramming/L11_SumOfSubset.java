package DynamicProgramming;

public class L11_SumOfSubset {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7, 9};
        int n = arr.length;
        int target = 9;

        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= target; j++) {

                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                }
                else if (i == 0) {
                    dp[i][j] = false;
                }
                else if (j == 0) {
                    dp[i][j] = true;
                }
                else {
                    if (dp[i - 1][j]) {
                        dp[i][j] = true;
                    }
                    else {
                        int val = arr[i - 1];
                        if (j >= val && dp[i - 1][j - val]) {
                            dp[i][j] = true;
                        }
                    }
                }
            }
        }

        System.out.println("Ankit Singh");
        System.out.println(dp[n][target]);
    }
}
