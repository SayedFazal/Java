import java.util.*;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    int product = 1;
    while (num > 0) {
      product = product * (num % 10);
      num = num / 10;
    }
    System.out.println(product);
  }
}
