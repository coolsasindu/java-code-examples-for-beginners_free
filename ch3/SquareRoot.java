class SquareRoot {
  public static void main(String args[]) {
    double d = Double.valueOf(args[0]).doubleValue();
    if(d < 0) 
      System.out.print(Math.sqrt(-d) + "i");
    if(d >= 0) 
      System.out.print(Math.sqrt(d));
  }
}