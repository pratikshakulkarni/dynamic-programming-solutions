package febonacci;

/***
 @author: Pratiksha Kulkarni
 date: 9/1/2022
 */
public class TabulationSolution {
 public static void main(String[] args) {
  int n=8;
  long fib=0, prev=1, beforePrev=0;
  for(long i=2;i<=n;i++){
   fib = prev+beforePrev;
   beforePrev=prev;
   prev=fib;
  }
  System.out.println("Fibonacci "+ fib);
 }
}
