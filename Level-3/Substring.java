import java.util.Scanner;

public class Prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();

        if (s2.contains(s1)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}
