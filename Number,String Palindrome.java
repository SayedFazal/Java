import java.util.Scanner;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Choose option:");
    System.out.println("1. String Palindrome");
    System.out.println("2. Number Palindrome");
    int choice = sc.nextInt();
    sc.nextLine();
    switch(choice){
      case 1:
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--){
          rev += s.charAt(i);
        }
        if (s.equals(rev))
          System.out.println("String is Palindrome");
        else
          System.out.println("String is Not Palindrome");
        break;
      
      case 2:
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num, r, revNum = 0;
        while (num > 0){
          r = num % 10;
          revNum = revNum * 10 + r;
          num = num / 10;
        }
        if (temp == revNum)
          System.out.println("Number is Palindrome");
        else
          System.out.println("Number is Not Palindrome");
        break;
      default:
        System.out.println("Invalid option");
    }
  }
}
