import java.util.Scanner;
public class StringPermutations {
  public static void PermutationsOfString(String str) {
    int length = str.length();
    int f = factorial(length);
    for(int i = 0 ; i < f ; i++) {
      StringBuilder sb = new StringBuilder(str);
      int temp = i;
      for(int div = length ; div >= 1 ; div--) {
        int r = temp % div;
        int q = temp / div;
        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);
        temp = q;
      }
      System.out.println();
    }
  }
  
  public static int factorial(int n) {
    int fact = 1;
    for(int i = 1 ; i <= n ; i++) {
      fact = fact * i;
    }
    return fact;
  }
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter String : ");
    String str = s.next();
    System.out.println("Permutations of " + str + " are :-");
    PermutationsOfString(str);
  }
}
