import java.util.*;
public class R192311291{
  public static int factorial(int n){
    if(n==0){
      return 1;
    }
    return n*factorial(n-1);
  }
  public static void main(String[] args){
    int num = 6;
    System.out.print(factorial(num));
  }
}
