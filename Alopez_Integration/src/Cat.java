
public class Cat extends Animal{
  //This class is a child class of Animal
  //This means that Cat IS-A Animal
  public String showAnimal() {
    animal = "Cat";
    return animal;
  }
  //This method overrides the showAnimal method of Animal
  
  public void makeSound() {
    System.out.println("Purr");
  }
  //This method overrides the showAnimal method of Animal
}
