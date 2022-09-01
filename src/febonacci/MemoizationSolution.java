package febonacci;

import java.util.Arrays;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */
public class MemoizationSolution {
    public static int solveFibonacci(int n,int[] dp){
        if(dp[n] != -1)
            return dp[n];
        else
            dp[n]= solveFibonacci(n-1,dp) + solveFibonacci(n-2,dp);

        return dp[n];
    }
    public static void main(String[] args) {
        int n=8;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=1;
        System.out.println("Fibonacci of "+ n + " is "+ solveFibonacci(n,dp));
    }
}
