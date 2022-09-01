package febonacci;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */
public class RecursiveSolution {
 public static long solveFibonacci(int n){
  if(n<2)
   return n;
  else
   return solveFibonacci(n-1) + solveFibonacci(n-2);
 }
 public static void main(String[] args) {
  int n=8;
  System.out.println("Fibonacci of "+ n + " is "+ solveFibonacci(n));
 }
}
