class Fibonacci {
  public static void main(String args[]) {
    int count = 0;
    int i = 0;
    int j = 1;
    do {
      System.out.print(j + " ");
      int k = i + j;
      i = j;
      j = k;
    } while(++count < 15);
  }
}