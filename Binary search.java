import java.util.Scanner;
public class R192311291{
  public static int binarySearch(int[] arr,int ele){
    int n = arr.length;
    int low =0;
    int high = n-1;
    while(low<=high){
      int mid = (low+high)/2;
      if(arr[mid]==ele){
        return mid;
      }
      else if(arr[mid]>ele){
       high = mid-1;
      }
      else{
        low = mid+1;
      }
    }
    return -1;
  }
  public static void main(String[] args){
  	int[] arr = {1,2,3,4,5,6,7};
    int element = 3;
    int search = binarySearch(arr,element);
      if(search==-1){
        System.out.print("No element founfd in array");
      }
    else{
      System.out.print(search);
    }
  }
}
