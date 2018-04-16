import java.util.Scanner;

public class NumberInput {
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
