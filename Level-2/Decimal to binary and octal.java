import java.util.Scanner;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a decimal number: ");
    int num = sc.nextInt();
    int temp = num;
    // Decimal to Binary
    String binary = "";
    while (num > 0) {
      binary = (num % 2) + binary;
      num = num / 2;
    }
    
    //Decimal to Octal
    num = temp;
    String octal = "";
    while (num > 0) {
      octal = (num % 8) + octal;
      num = num / 8;
    }
    System.out.println("Binary = " + binary);
    System.out.println("Octal = " + octal);
  }
}
