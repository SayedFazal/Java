import java.util.Scanner;
public class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number :");
    int num = sc.nextInt();
    boolean isFlag = true;
    if(num<=1){
      isFlag = false;
    }
    for(int i=2;i<=num/2;i++){
      if(num%i==0){
        isFlag = false;
        break;
      }
    }
    if(isFlag){
      System.out.print("It is a Prime number");
    }
    else{
      System.out.print("Not prime number !");
    }
  }
}
