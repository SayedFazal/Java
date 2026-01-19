import java.util.*;
public class R192311291{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int odd=0;
    for (int i=1; i<n*n; i++){
      if(i%2!=0){
        odd=i;
      }
    }
    System.out.print(odd);
  }
}
