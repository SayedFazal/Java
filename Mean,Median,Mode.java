import java.util.*;
public class R192311291{
  public static void main(String[] args){
    int arr[]={16,18,27,16,23,21,19};
    int sum=0;
    for(int i=0; i<arr.length; i++){
      sum=sum+arr[i];
    }
    int mean= (sum)/(arr.length);
    System.out.println("Mean:"+mean);
    Arrays.sort(arr);
    int median=arr[arr.length/2];
    System.out.println("Median:"+median);
    int mode=0;
    for(int i=0; i<arr.length; i++){
      if(arr[i]==arr[i+1]){
        mode=arr[i];
        break;
      }
    }
    System.out.print("Mode:"+mode);
  }
}
