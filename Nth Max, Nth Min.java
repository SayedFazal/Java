import java.util.*;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size: ");
    int n = sc.nextInt();
    int[] a = new int[n];
    System.out.println("Enter array elements:");
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter N value: ");
    int k = sc.nextInt();
    Arrays.sort(a);
    int nthMin = a[k - 1];
    int nthMax = a[n - k];
    System.out.println("Nth Minimum = " + nthMin);
    System.out.println("Nth Maximum = " + nthMax);
    System.out.println("Sum = " + (nthMin + nthMax));
    System.out.println("Difference = " + (nthMax - nthMin));
  }
}
