import java.util.Scanner;

public class NumberInput {
  /**
   * This method checks what the user enters as input to see if it is a valid
   * input for an integer.
   * @param scan Passes in the Scanner object.
   * @return Returns the integer that the user enters as input.
   */
  public static int getGoodInt(Scanner scan) {
    int goodInt = 0;
    boolean gotGood = false;
    do {
      try {
        goodInt = scan.nextInt();
        gotGood = true;
      } catch (Exception e) {
        scan.next();
        System.out.println("Please enter a whole number.");
      }
    } while (gotGood == false);

    return goodInt;
  }
}
