package DynamicProgramming;

import java.util.Scanner;

public class L02_ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter the number ");
        // int n=sc.nextInt();
        // int[] dp=new int[n+1];

        // int c=climb(n,dp);
        // System.out.println(c);
        System.out.println(climbUsingTabulation(10));
    }
    public static int climb(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int n1=climb(n-1, dp);
        int n2=climb(n-2, dp);
        int n3=climb(n-3, dp);

        return dp[n]=n1+n2+n3;
    }

    public static int climbUsingTabulation(int n){
       int[] dp=new int[n+1];
       dp[0]=1;
       for(int i=1;i<=n;i++){
        if(i==1){
            dp[i]=dp[i-1];
        }
        else if(i==2){
            dp[i]=dp[i-1]+dp[i-2];
        }
        else{
            dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        }
       }
       return dp[n];

    }

}
