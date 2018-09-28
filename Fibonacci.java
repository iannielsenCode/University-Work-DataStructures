package data.structures;


public class Fibonacci {
  public static int Fib(int n){
    if(n <2){
      return 1;
    }
    else{
      return Fib(n-1) + Fib(n-2);
    }
  }
  public static void main(String[] args){
     System.out.println(Fibonacci.Fib(15));
  }
}
