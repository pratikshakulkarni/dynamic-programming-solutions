package minimumCostClimbingPairs;

public class MCCSRecursiveSolution {

    private static int solveMccs(int n, int i){
        if(i==0)
            return 1;
        else if(i>n)
            return 0;
        else return solveMccs(n,i-1)+solveMccs(n,i-2);
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println("Distinct Ways :: " + solveMccs(n,n-1));
    }
}
