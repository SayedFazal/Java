import java.util.Scanner;
public class PerfectNumbers{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of n: ");
    int n = sc.nextInt();
    int count = 0;
    int num = 1;
    while (count < n){
      int sum = 0;
      for (int i = 1; i <= num / 2; i++){
        if (num % i == 0){
          sum = sum + i;
          
        }
      }
      if (sum == num) {
        System.out.print(num + " ");
        count++;
      }
      num++;
    }
    sc.close();
  }
}
