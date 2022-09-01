package minCostPathInMatrix;

import java.sql.SQLOutput;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */
public class MemoizationSolution {
    public static int getMinCost(int[][] matrix,int[][] dp ,int i, int j) {
        int n = matrix.length, m = matrix[0].length;
        if(dp[i][j] != -1)
            return dp[i][j];
        else if (i == n - 1 && j == m - 1)
            return matrix[i][j];
        else if (i == n - 1)
            dp[i][j]= matrix[i][j] + getMinCost(matrix, dp,i, j + 1);
        else if (j == m - 1)
            dp[i][j]= matrix[i][j] + getMinCost(matrix,dp, i + 1, j);
        else
            dp[i][j]= matrix[i][j] + Math.min(getMinCost(matrix,dp ,i + 1, j), getMinCost(matrix,dp ,i, j + 1));

        return dp[i][j];
    }

    public static void main(String[] args) {
        int[][] matrix = {{3, 2, 12, 15, 10}, {6, 19, 7, 11, 17}, {8, 5, 12, 32, 21}, {3, 20, 2, 9, 7}};
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        for(int i=0;i<n;i++)
         for(int j=0;j<m;j++)
          dp[i][j]=-1;
         System.out.println("Minimum cost : " + getMinCost(matrix,dp ,0, 0));
        for(int i=0;i<n;i++) {
            for (int j = 0; j < m; j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }

    }
}
