class R192311291{
  public static void main(String[] args){
    int[] arr = {45, 12, 34, 9, 23};
    int smallest = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] < smallest) {
        smallest = arr[i];
      }
    }
    System.out.println("Smallest element in the array: " + smallest);
  }
}
