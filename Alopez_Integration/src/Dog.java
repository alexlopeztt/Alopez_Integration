
public class Dog extends Animal {
  // This class is a child class of Animal
  // This means that Dog IS-A Animal
  public String showAnimal() {
    animal = "Dog";
    return animal;
  }
  // This method overrides the showAnimal method of Animal

  public void makeSound() {
    System.out.println("Bow Wow");
  }
  // This method overrides the showAnimal method of Animal
}
