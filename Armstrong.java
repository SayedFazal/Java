import java.util.Scanner;
public class R192311291{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter number :");
    int num = sc.nextInt();
    int temp = num;
    int sum = 0;
    while (temp > 0) {
      int d = temp % 10;
      sum = sum + (d * d * d);
      temp = temp / 10;
    }
    if (sum == num)
      System.out.println("Armstrong Number");
    else
      System.out.println("Not an Armstrong Number");
  }
}
