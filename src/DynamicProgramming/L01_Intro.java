package DynamicProgramming;

import java.util.Scanner;

public class L01_Intro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        int n =sc.nextInt();
        int fib=fibb(n);
        System.out.println(fib);
        int[] dp=new int[n+1];
        int nfib=fibmemo( n,dp);
        System.out.println(nfib);

    }

    public static int fibb(int n){
        if(n<=1){
            return n;
        }
        return fibb(n-1)+fibb(n-2);

    }
    public static int fibmemo(int n,int[] dp){
         if(n<=1){
            return n;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        return dp[n]=fibmemo(n-1,dp)+fibmemo(n-2, dp);
    }

}
