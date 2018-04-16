import java.util.Scanner;

public class StringInput {
  public static String getGoodString(Scanner scan) {
    String goodString = null;
    boolean gotGood = false;
    do {
      try {
        goodString = scan.nextLine();
        gotGood = true;
      } catch (Exception e) {
        scan.next();
        System.out.println("Please enter a word or a phrase.");
      }
    } while (gotGood == false);

    return goodString;
  }
}
