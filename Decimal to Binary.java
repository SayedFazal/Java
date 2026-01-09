import java.util.*;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int bin = 0, p = 1;
    while (num > 0){
      bin = bin + (num % 2) * p;
      p = p * 10;
      num = num / 2;
    }
    System.out.println(bin);
  }
}
