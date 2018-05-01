/**
 * Represents a car that the user could have.
 * 
 * @author Alexander Lopez
 */
public class Car {

  /**
   * This field stores the car's top speed.
   */
  private int topSpeed;

  /**
   * This field stores the make of the car, such as Ford or Toyota.
   */
  private String make;

  /**
   * This field stores the car's current speed which is determined by either the
   * constructor, or by the user's input.
   */
  private int currentSpeed;

  /**
   * This constructor is for if there is no arguments passed into the object
   * upon creation; it also sets the top speed, make, and current speed of the
   * car object.
   */
  public Car() {
    topSpeed = 0;
    make = "Unknown";
    currentSpeed = 50;
  }

  /**
   * This constructor takes a parameter of type integer, and sets the topSpeed,
   * make, and currentSpeed of the Car object to a preset example.
   * @param s This car's top speed should be an integer.
   */
  public Car(int s) {
    topSpeed = s;
    make = "No make found";
    currentSpeed = 50;
  }

  /**
   * This constructor takes a parameter of type String, and sets the topSpeed,
   * and currentSpeed of the Car object to a preset example.
   * @param m This car's make should be an existing car company.
   */
  public Car(String m) {
    topSpeed = 0;
    make = m;
    currentSpeed = 50;
  }

  /**
   * This constructor takes a parameter of type integer and type String, and 
   * sets the currentSpeed of the Car object to a preset example.
   * @param s This car's top speed should be an integer.
   * @param m This car's make should be an existing car company.
   */
  public Car(int s, String m) {
    topSpeed = s;
    make = m;
    currentSpeed = 50;
  }

  /**
   * This is a constructor that takes two integer parameters and one String 
   * parameter. It sets the Car objects topSpeed, make, and currentSpeed to 
   * what the user gives the program.
   * @param s This car's top speed should be an integer.
   * @param m This car's make should be an existing car company.
   * @param c The current speed of the car should be an integer that is between
   *          0 and the top speed of the car.
   */
  public Car(int s, String m, int c) {
    topSpeed = s;
    make = m;
    currentSpeed = c;
  }

  /**
   * This method sets the topSpeed of the Car object.
   * @param s This car's top speed should be an integer.
   */
  public void setSpeed(int s) {
    topSpeed = s;
  }

  /** Method getSpeed.
   * This method returns the topSpeed of the Car object.
   * @return This method returns the top speed of the car.
   */
  public int getSpeed() {
    return topSpeed;
  }

  /**
   * This method sets the make of the Car object.
   * @param m This car's make should be an existing car company.
   */
  public void setMake(String m) {
    make = m;
  }

  /** Method getMake.
   * This method returns the make of the Car object.
   * @return This method returns the make of the car.
   */
  public String getMake() {
    return make;
  }

  /**
   * This method sets the currentSpeed of the Car object.
   * @param c The current speed of the car should be an integer that is between
   *           0 and the top speed of the car.
   */
  public void setCurrentSpeed(int c) {
    currentSpeed = c;
  }

  /** Method getCurrentSpeed.
   * This method returns the currentSpeed of the Car object.
   * @return This method returns the current speed of the car.
   */
  public int getCurrentSpeed() {
    return currentSpeed;
  }

  /**
   * This method decreased the current speed of the car by 1.
   */
  public void applyBrake() {
    currentSpeed--;
  }

}
