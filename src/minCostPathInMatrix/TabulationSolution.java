package minCostPathInMatrix;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */
public class TabulationSolution {
    public static void main(String[] args) {
        int[][] matrix = {{3,2,12,15,10},{6,19,7,11,17},{8,5,12,32,21},{3,20,2,9,7}};
        System.out.println("Minimum cost : " + getMinCost(matrix));
    }
    private static int getMinCost(int[][] matrix) {
        int rowLength = matrix.length;
        int columnLength = matrix[0].length;
        int[][] dp = new int[rowLength][columnLength];
        dp[0][0] = matrix[0][0];
        for (int i = 1; i < rowLength; i++)
            dp[i][0] = matrix[i][0] + dp[i - 1][0];

        for(int j=1;j<columnLength;j++)
            dp[0][j] = matrix[0][j]+dp[0][j-1];

        for (int i = 1; i < rowLength; i++)
            for (int j = 1; j < columnLength; j++)
                dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);

        return dp[rowLength-1][columnLength-1];
    }

}
