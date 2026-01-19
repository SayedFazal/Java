public class R192311291{
  public static void main(String[] args){
    int[] numbers = {10, 5, 8, 20, 3, 15};
    if (numbers.length == 0){
      System.out.println("Array is empty.");
      return;
    }
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] > max) {
        max = numbers[i];
      }
    }
    System.out.println("The largest element in the array is: " + max);
  }
}
