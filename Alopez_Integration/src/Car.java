//Alexander Lopez
public class Car {

  private int topSpeed;
  private String make;
  private int currentSpeed;

  public Car() {
    topSpeed = 0;
    make = "Unknown";
    currentSpeed = 50;
  }

  public Car(int s) {
    topSpeed = s;
    make = "No make found";
    currentSpeed = 50;
  }

  public Car(String m) {
    topSpeed = 0;
    make = m;
    currentSpeed = 50;
  }

  public Car(int s, String m) {
    topSpeed = s;
    make = m;
    currentSpeed = 50;
  }
  
  public Car(int s, String m, int c) {
    topSpeed = s;
    make = m;
    currentSpeed = c;
  }

  public void setSpeed(int s) {
    topSpeed = s;
  }

  public int getSpeed() {
    return topSpeed;
  }

  public void setMake(String m) {
    make = m;
  }

  public String getMake() {
    return make;
  }
  
  public void setCurrentSpeed(int c) {
    currentSpeed = c;
  }
  
  public int getCurrentSpeed() {
    return currentSpeed;
  }

  public void applyBrake() {
    currentSpeed--;
  }

}
