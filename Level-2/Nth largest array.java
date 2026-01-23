import java.util.Scanner;
public class NthLargest{
    public static void main(String[] args) {
        int[] a = {4, 2, 7, 1, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.println(n + "th largest number is: " + a[n - 1]);
        sc.close();
    }
}
