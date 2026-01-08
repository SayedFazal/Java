import java.util.Scanner;
public class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    int lcm;
    int max = (a > b) ? a : b;
    while (true) {
      if (max % a == 0 && max % b == 0) {
        lcm = max;
        break;
      }
      max++;
    }
    System.out.println("LCM of number:" +lcm);
  }
}
