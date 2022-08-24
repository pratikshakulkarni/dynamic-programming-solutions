package knapsack;

public class knapsack01MemoizationSolution {
    private static int knapsack(int w[], int v[], int n, int W, int[][]dp) {

        if (n == 0 || W == 0) {
            return 0;
        } else if (w[n] <= W) {
            dp[n][W]= Math.max(v[n] + knapsack(w, v, n - 1, W - w[n],dp), knapsack(w, v, n - 1, W,dp));
        } else {
            dp[n][W]= knapsack(w, v, n - 1, W,dp);
        }
        return dp[n][W];

    }

    public static void main(String[] args) {
        int weight[] = {1, 3, 4, 5};
        int value[] = {1, 4, 5, 7};
        int n = weight.length;
        int W = 7;
        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i < n + 1; i++)
            for (int j = 0; j < W + 1; j++)
                dp[i][j] = -1;

        System.out.println("0/1 knapsack solution : " + knapsack(weight, value, n - 1, W,dp));
    }
}


