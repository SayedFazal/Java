class R192311291{
  public static void main(String[] args){
    int base = 2;
    int exp = 2;
    int result = 1;
    while (exp > 0){
      result = result * base;
      exp--;
    }
    System.out.println(result);
  }
}
