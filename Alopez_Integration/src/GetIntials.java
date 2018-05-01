//Alexander Lopez
//This is a class is used to get the initials of the user
public class GetIntials {

  private String firstInitial;
  private String lastInitial;

  // The method below calculates the initials of any name
  // ------------Method Header---------Parameters
  // ------------------|-------------------|
  // ------------------V-------------------V
  /**
   * This method takes the two names of the user (first and last name), and 
   * returns the initials of the user. 
   * @param name1 The first name of the user.
   * @param name2 The last name of the user.
   * @return The initials of the user.
   */
  public String personInitials(String name1, String name2) {

    firstInitial = name1.substring(0, 1);
    lastInitial = name2.substring(0, 1);

    return firstInitial + "." + lastInitial;

  }

}
