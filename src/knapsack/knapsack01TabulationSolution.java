package knapsack;

public class knapsack01TabulationSolution {
    private static int knapsack(int w[], int v[], int n, int W) {
        /*
        n=0 i.e no item in the list
        W=0 i.e knapsack's capacity is 0
        */

        int[][] dp = new int[n + 1][W + 1];
        for (int i = 0; i < 1; i++)
            for (int j = 0; j<1 ; j++)
                dp[i][j] = 0;

        for (int i = 1; i < n; i++){
            for (int j = 0; j<=W ; j++){
                if(w[i] <= j){
                    dp[i][j]=Math.max(v[i]+dp[i-1][W-w[i]],dp[i-1][W]);
                }
                else{
                   dp[i][j]=dp[i-1][W];
                }
            }
        }
        return dp[n-1][W];
    }

    public static void main(String[] args) {
        int weight[] = {1, 3, 4, 5};
        int value[] = {1, 4, 5, 7};
        int n = weight.length;
        int W = 7;

        System.out.println("0/1 knapsack solution : " + knapsack(weight, value, n - 1, W));
    }
}
