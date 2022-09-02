package equalSumPartition;

/***
 @author: Pratiksha Kulkarni
 date: 9/2/2022
 */
public class EqualSumPartitionTabulation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        int sum=0;
        for(int i : nums)
            sum+=i;
        if(sum%2 != 0)
            System.out.println("false");
        else System.out.println(subsetSum(nums,sum/2));

    }
    private static boolean subsetSum(int[] A,int sum){
        boolean[][] t= new boolean[A.length+1][sum+1];

        //i==0 all false
        for(int j=0;j<sum+1;j++)
            t[0][j]=false;

        //j==0 all true
        for(int i=0;i<A.length+1;i++)
            t[i][0]=true;

        for(int i=1;i<A.length+1;i++){
            for(int j=1;j<sum+1;j++){
                if(A[i-1] <= j)
                    t[i][j] = (t[i-1][j-A[i-1]])||(t[i-1][j]);
                else
                    t[i][j]=t[i-1][j];
            }
        }

        return t[A.length][sum];
    }

}
