import java.util.*;
class R192311291{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int r1 = 2, c1 = 2;
    int r2 = 2, c2 = 2;
    int[][] a = new int[r1][c1];
    int[][] b = new int[r2][c2];
    int[][] c = new int[r1][c2];
    System.out.println("Enter elements of first matrix:");
    for (int i = 0; i < r1; i++){
      for (int j = 0; j < c1; j++){
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("Enter elements of second matrix:");
    for (int i = 0; i < r2; i++){
      for (int j = 0; j < c2; j++){
        b[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < r1; i++){
      for (int j = 0; j < c2; j++){
        c[i][j] = 0;
        for (int k = 0; k < c1; k++){
          c[i][j] += a[i][k] * b[k][j];
        }
      }
    }
    System.out.println("Result matrix:");
    for (int i = 0; i < r1; i++){
      for (int j = 0; j < c2; j++){
        System.out.print(c[i][j] + " ");
      }
      System.out.println();
    }
  }
}
