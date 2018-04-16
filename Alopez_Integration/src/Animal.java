
public class Animal {
  private String breed;
  private int age;
  private String sound;
  private String name;
  protected String animal;
  
  public Animal() {
    breed = "Unkown";
    age = 0;
    sound = "Grrrr";
    name = "Bob";
    animal = "Unknown";
  }
  
  public String getBreed() {
    return breed;
  }
  public void setBreed(String breed) {
    this.breed = breed;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  
  public void makeSound() {
    System.out.println(sound);
  }
  
  public String showAnimal() {
    animal = "Unknown";
    return animal;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
