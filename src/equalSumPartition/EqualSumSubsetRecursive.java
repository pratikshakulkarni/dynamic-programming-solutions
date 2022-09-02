package equalSumPartition;

/***
 @author: Pratiksha Kulkarni
 date: 9/2/2022

 416. Partition Equal Subset Sum
 */
public class EqualSumSubsetRecursive {
    public static void main(String[] args) {
     int[] arr = {1,5,11,5};
     int sum=0;
     for(int i : arr)
      sum+=i;
     if(sum%2 !=0)
      System.out.println("Result :"+ false);
     else
      System.out.println("Result :"+subsetSum(arr,arr.length-1,sum/2));

    }

    private static boolean subsetSum(int[] A, int n, int sum) {
        //base cases
        if (sum == 0)
            return true;
        else if (n < 1 || sum < 0)
            return false;
        else if (A[n] > sum)
            return false;
        else
            return subsetSum(A, n - 1, sum - A[n]) || subsetSum(A, n - 1, sum);
    }
}
