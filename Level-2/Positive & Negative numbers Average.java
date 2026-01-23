import java.util.Scanner;
public class SumAndAverage{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    int posSum = 0, negSum = 0;
    int posCount = 0, negCount = 0;
    System.out.println("Enter numbers (-1 to stop):");
    while (true){
      num = sc.nextInt();
      if (num == -1) {
        break;
      }
      if (num > 0) {
        posSum += num;
        posCount++;
      } 
      else if (num < 0) {
        negSum += num;
        negCount++;
      }
    }
    if (posCount > 0)
    System.out.println("Positive Sum = " + posSum);
    if (negCount > 0)
    System.out.println("Negative Sum = " + negSum);
    if (posCount > 0)
    System.out.println("Positive Average = " + (posSum / (double) posCount));
    if (negCount > 0)
    System.out.println("Negative Average = " + (negSum / (double) negCount));
    sc.close();
  }
}
