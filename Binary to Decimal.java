import java.util.*;
class R192311291{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bin = sc.nextInt();
    int dec = 0, p = 1;
    while (bin > 0) {
      dec = dec + (bin % 10) * p;
      p = p * 2;
      bin = bin / 10;
    }
    System.out.println(dec);
  }
}
