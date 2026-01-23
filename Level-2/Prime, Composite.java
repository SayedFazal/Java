import java.util.Scanner;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter how many numbers: ");
    int n = sc.nextInt();
    for(int i = 1; i <= n; i++){
      System.out.print("Enter number " + i + ": ");
      int num = sc.nextInt();
      if (num <= 1) {
        System.out.println(num + " is neither Prime nor Composite");
        continue;
      }
      int count = 0;
      for (int j = 1; j <= num; j++){
        if (num % j == 0){
          count++;
        }
      }
      if (count == 2)
        System.out.println(num + " is Prime");
      else
        System.out.println(num + " is Composite");
    }
  }
}
