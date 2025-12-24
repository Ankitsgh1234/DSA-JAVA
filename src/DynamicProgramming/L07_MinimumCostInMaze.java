package DynamicProgramming;

public class L07_MinimumCostInMaze {
    public static void main(String[] args) {
        int[][] arr = {
                { 34, 7, 21, 45, 2, 18, 39 },
                { 11, 29, 48, 5, 13, 33, 26 },
                { 42, 1, 19, 37, 24, 46, 8 },
                { 15, 30, 4, 22, 49, 10, 36 },
                { 27, 6, 41, 14, 31, 47, 3 },
                { 20, 38, 12, 44, 25, 9, 43 },
                { 32, 16, 23, 40, 17, 35, 28 }
        };

        int m=arr.length;
        int n=arr[0].length;
        int[][] dp=new int[m][n];

        // dp[m][n]=arr[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1&&j==n-1){
                    dp[i][j]=arr[i][j];
                }
                else if(i==m-1){
                    dp[i][j]=dp[i][j+1]+arr[i][j];
                }
                else if(j==n-1){
                    dp[i][j]=dp[i+1][j]+arr[i][j];
                }
                else
                {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
