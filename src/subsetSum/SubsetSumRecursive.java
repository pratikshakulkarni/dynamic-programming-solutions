package subsetSum;

public class SubsetSumRecursive {

    public static boolean findSubset(int[] arr, int n, int sum) {
        if (sum == 0)
            return true;
        else if (n == 0)
            return arr[n] == sum;
        else
            return findSubset(arr, n - 1, sum) || findSubset(arr, n - 1, sum - arr[n]);
    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 35;
        int n = arr.length;
        System.out.println("Present " + findSubset(arr, n - 1, sum));
    }
}
