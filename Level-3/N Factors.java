import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        int n = 10;
        int nthFactor = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;

                if (count == n) {
                    nthFactor = i;
                }
            }
        }

        System.out.println("Number of factors = " + count);

        if (nthFactor != 0) {
            System.out.println("10th factor = " + nthFactor);
        } else {
            System.out.println("10th factor does not exist");
        }

        sc.close();
    }
}
