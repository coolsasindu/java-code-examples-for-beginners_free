class EmptyCase {

  public static void main(String args[]) {

    // Get first character of argument
    char ch = args[0].charAt(0);

    // Determine if it is a vowel or consonant
    switch(ch) {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'y':
        System.out.println("Vowel");
        break;
      default:
        System.out.println("Consonant");
    }
  }
}
