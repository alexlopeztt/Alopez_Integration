import java.util.Scanner;

public class StringInput {
  /**
   * This method checks to make sure that the string that the user gives will
   * not crash the program.
   * @param scan Passes in the Scanner object.
   * @return Returns the string that the user gave as input.
   */
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
