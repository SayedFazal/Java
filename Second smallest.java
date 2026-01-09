class R192311291{
  public static void main(String[] args){
    int[] a = {5, 2, 9, 1, 3};
    int smallest = a[0];
    int second = Integer.MAX_VALUE;
    for (int i = 1; i < a.length; i++){
      if (a[i] < smallest){
        second = smallest;
        smallest = a[i];
      } else if (a[i] > smallest && a[i] < second) {
        second = a[i];
      }
    }
    System.out.println(second);
  }
}
