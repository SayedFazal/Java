import java.util.Scanner;
public class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number : ");
    int num = sc.nextInt();
    int a=0,b=1;
    for(int i=1;i<=num;i++){
      int c = a+b;
      System.out.print(a+" ");
      a=b;
      b=c;
    }
  }
}
