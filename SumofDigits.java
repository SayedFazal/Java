import java.util.Scanner;
public class R192311291{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number :");
    int num = sc.nextInt();
    int sum =0;
    while(num!=0){
      int rem = num%10 ;
      sum+=rem;
      num =num/10;
    }
    System.out.print(sum);
  }
}
