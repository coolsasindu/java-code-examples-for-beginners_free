class MoneyAdder {
  public static void main(String args[]) {
    float sum = 0;
    int i = 0;
    while(i < args.length) {
      int quantity = Integer.parseInt(args[i]);
      ++i;
      float value = 1;
      if(args[i].equals("pennies"))
        value = 1;
      else if(args[i].equals("nickels"))
        value = 5;
      else if(args[i].equals("dimes"))
        value = 10;
      else if(args[i].equals("quarters"))
        value = 25;
      else {
        System.out.print("Unrecognized coin");
        return;
      }
      sum += quantity * value;
      ++i;
    }
    System.out.println("Sum is $" + sum/100);
  }
}