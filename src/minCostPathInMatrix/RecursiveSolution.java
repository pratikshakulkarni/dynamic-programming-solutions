package minCostPathInMatrix;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */

public class RecursiveSolution {
    /**
     * base cases:
     * 1. if i and j = m and n return matrix[i][j]
     * 2. if j=m-1 so only down return matrix[i][j]+min(i+1,j)
     * 3. if i=n-1 so only down return matrix[i][j]+min(i,j+1)
     */
    public static int getMinCost(int[][]matrix,int i,int j){
        int n=matrix.length, m=matrix[0].length;
        if(i==n-1 && j== m-1)
            return matrix[i][j];
        else if(i==n-1)
            return matrix[i][j]+getMinCost(matrix,i,j+1);
        else if(j==m-1)
            return matrix[i][j]+getMinCost(matrix,i+1,j);
        else
            return matrix[i][j]+Math.min(getMinCost(matrix,i+1,j),getMinCost(matrix,i,j+1));
    }
    public static void main(String[] args) {
        int[][] matrix = {{3,2,12,15,10},{6,19,7,11,17},{8,5,12,32,21},{3,20,2,9,7}};
        System.out.println("Minimum cost : " + getMinCost(matrix,0,0));
    }
}
