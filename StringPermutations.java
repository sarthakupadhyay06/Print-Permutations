import java.util.*;
public class StringPermutations {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    PermutationsOfString(str, "");
  }

  public static void PermutationsOfString(String str, String result) {
    if (str.length() == 0)
    {
      System.out.println(result);
      return ;
    }
    for (int i = 0; i < str.length(); i++)
    {
      char character = str.charAt(i);
      String LPart = str.substring(0, i); 
      String RPart = str.substring(i + 1);
      String remString = LPart + RPart;
      PermutationsOfString(remString, result + character);
    }
  }
}