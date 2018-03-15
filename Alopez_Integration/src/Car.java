//Alexander Lopez
public class Car {
  
  private int speed;
  private String make;

  public void setSpeed(int s) {
    speed = s;
  }
  public int getSpeed() {
    return speed;
  }

  public void setMake(String m) {
    make = m; 
  }
  public String getMake() {
    return make;
  }
  
  public Car() {
    speed = 0;
    make = "Unknown";
  }
  
  public Car(int s, String m) {
    speed = s;
    make = m;
  }


}
