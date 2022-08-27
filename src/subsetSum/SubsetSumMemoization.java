package subsetSum;

public class SubsetSumMemoization {
    public static boolean findSubset(int[] arr, int n, int sum,boolean[][] dp) {
        if (sum == 0)
            return true;
        else if(n<0||sum<0)
            return false;
        else if (n == 0)
            dp[n][sum] = arr[n] == sum;
        else
            dp[n][sum]= findSubset(arr, n - 1, sum,dp) || findSubset(arr, n - 1, sum - arr[n],dp);

        return dp[n][sum];
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 38;
        int n = arr.length;
        boolean[][] dp = new boolean[arr.length+1][sum+1];
        for (int i=0; i< arr.length+1;i++)
            dp[i][0]=true;
        for (int j=0; j< sum+1;j++)
            dp[0][j]=false;
        System.out.println("Present " + findSubset(arr, n - 1, sum,dp));
    }
}
