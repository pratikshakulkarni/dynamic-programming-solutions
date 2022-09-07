package cutRodIntoSegments;

import java.util.Arrays;

/***
 @author: Pratiksha Kulkarni
 date: 9/7/2022
 */
public class RodCutting {

    private static int solveRodCuttingRecursion(int n, int x, int y, int z) {
        if (n == 0)
            return 0;
        else if (n < 0)
            return Integer.MIN_VALUE;
        else
            return Math.max(solveRodCuttingRecursion(n - x, x, y, x) + 1, Math.max(solveRodCuttingRecursion(n - y, x, y, z) + 1, solveRodCuttingRecursion(n - z, x, y, z)+1));
    }

    private static int solveRodCuttingMemoization(int n, int x, int y, int z, int[] dp) {
        if (n == 0)
            return 0;
        else if (n < 0)
            return Integer.MIN_VALUE;
        else if (dp[n] != -1)
            return dp[n];
        else
            dp[n] = Math.max(solveRodCuttingMemoization(n - x, x, y, x, dp) + 1, Math.max(solveRodCuttingMemoization(n - y, x, y, z, dp) + 1, solveRodCuttingMemoization(n - z, x, y, z, dp)+ 1));

        return dp[n];
    }

    private static int solveRodCuttingTabulation(int n, int x, int y, int z) {
       int[] dp = new int[n+1];
       Arrays.fill(dp,-1);
       dp[0]=0;

       for(int i=1;i<=n;i++){
        if(i-x >=0 && dp[i-x]!=-1)
           dp[i]=Math.max(dp[i],dp[i-x]+1);
        if(i-y >=0 && dp[i-y]!=-1)
         dp[i]=Math.max(dp[i],dp[i-y]+1);
        if(i-z >=0 && dp[i-y]!=-1)
         dp[i]=Math.max(dp[i],dp[i-z]+1);
       }

       if(dp[n]<0)
        return 0;
       else return dp[n];
    }


    public static void main(String[] args) {
        int n = 7;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        //int ans =solveRodCuttingRecursion(n, 5, 2, 2);
        //int ans = solveRodCuttingMemoization(n, 5, 2, 2, dp);
        int ans = solveRodCuttingTabulation(n, 5, 2, 2);
        if (ans < 0)
            System.out.println("negative");
        else
            System.out.println("Recursion : " + ans);
    }

}
