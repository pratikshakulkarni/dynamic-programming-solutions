package subsetSum;

public class SubsetSubProblem {
    public static boolean findSubset(int[] A,int k){
        boolean[][] dp = new boolean[A.length+1][k+1];
        for (int j=0; j< k+1;j++)
            dp[0][j]=false;
        for (int i=0; i< A.length+1;i++)
            dp[i][0]=true;


        for (int i=1;i<A.length+1;i++){
            for (int j=1;j<k+1;j++){
                if(A[i-1] <= j){
                    dp[i][j]= (dp[i-1][j-A[i-1]] || dp[i-1][j]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[A.length][k];
    }

    public static void main(String[] args) {
        int[] A = {3, 34, 4, 12, 5, 2};;
        int k = 35;

        System.out.println("Present " + findSubset(A,k));
    }
}
