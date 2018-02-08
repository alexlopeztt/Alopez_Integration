
public class GetInitails {
  
  private String firstInitial;
  private String lastInitial;
  
  //The method below calculates the initials of any name 
  //            Method Header      Parameters
  //                |                  |
  //                V                  V
  public String personInitials(String name1, String name2) {
    
    firstInitial = name1.substring(0, 1);
    lastInitial = name2.substring(0, 1);
    
    return firstInitial + "." + lastInitial;
    
  }

}
