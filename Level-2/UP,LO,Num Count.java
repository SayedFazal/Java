import java.util.Scanner;
public class CountCharacters{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lowerCount = 0, upperCount = 0, digitCount = 0;
    char ch;
    System.out.println("Enter characters (* to stop):");
    while (true){
      ch = sc.next().charAt(0);
      if (ch == '*'){
        break;
      }
      if (ch >= 'a' && ch <= 'z') {
        lowerCount++;
      } 
      else if (ch >= 'A' && ch <= 'Z') {
        upperCount++;
      } else if (ch >= '0' && ch <= '9') {
        digitCount++;
      }
    }
    System.out.println("Lowercase letters: " + lowerCount);
    System.out.println("Uppercase letters: " + upperCount);
    System.out.println("Digits: " + digitCount);
    sc.close();
  }
}
