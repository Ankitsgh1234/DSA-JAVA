package SwayamTest;

import java.util.Scanner;

public class LongestIncreasingPathInMatrix {
    static int m, n;
    static int[][] arr, dp;

    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    static int dfs(int i, int j) {
        if (dp[i][j] != 0) return dp[i][j];

        int max = 1;

        for (int d = 0; d < 4; d++) {
            int ni = i + dx[d];
            int nj = j + dy[d];   // ✅ IMPORTANT FIX

            if (ni >= 0 && ni < m && nj >= 0 && nj < n &&
                arr[ni][nj] > arr[i][j]) {
                max = Math.max(max, 1 + dfs(ni, nj));
            }
        }

        dp[i][j] = max;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        m = sc.nextInt();
        n = sc.nextInt();

        if (m == 0 || n == 0) {
            System.out.println(1);
            return;
        }

        arr = new int[m][n];
        dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans = Math.max(ans, dfs(i, j));
            }
        }

        System.out.println(ans);
        sc.close();
    }

}
