public class knapsack01RecursiveSolution {
    private static int knapsack(int w[], int v[], int n, int W){

        if(n==0||W==0){
            return 0;
        }
        else{
            return Math.max(v[n]+knapsack(w,v,n-1,W-w[n]),knapsack(w,v,n-1,W));
        }

    }
    public static void main(String[] args) {
        int weight[] = {1,3,4,5};
        int value[] = {1,4,5,7};
        int n=weight.length;
        int W=7;

        System.out.println("0/1 knapsack solution : " + knapsack(weight,value,n-1,7));
    }
}