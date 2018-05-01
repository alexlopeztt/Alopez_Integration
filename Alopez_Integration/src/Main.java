import java.time.LocalDateTime;
import java.util.Scanner;

//Alexander Lopez
//This is my project that integrates all the skills I have learned
public class Main {

  /**
   * This is the main method for the program.
   * @param args The argument for the main class.
   */
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // introduction
    System.out.println("Hello and welcome to my integration project!");

    // Asks user for name
    System.out.println("What is your first and last name?");
    String firstName = scan.next();
    String lastName = scan.next();
    scan.nextLine();
    String name = firstName + " " + lastName;

    // Responds to user's name and says it back
    System.out.println("Oh, so your name is " + name + "?\nNice to meet you, "
        + firstName + ".");

    // Asks user for their age
    System.out.println("How old are you, " + firstName + "?\nIf I may ask?");
    int age = NumberInput.getGoodInt(scan);
    scan.nextLine();

    // Responds to the user's age and repeats it back
    System.out.println("So you are " + age + " years old." + " How wonderful!");

    // Asks if the user knows about variables
    System.out.println("Did you know, " + firstName + " that a variable is"
        + "\nlike a box in memory that holds specific data"
        + "\ndepending on what kind of box it is?");
    System.out.println("Yes or no?");
    String answerYs = StringInput.getGoodString(scan);

    // Sets the user's response to all lower case
    answerYs = answerYs.toLowerCase();

    // A switch statement to determine outcome based on user response
    switch (answerYs) {
      case "yes":
        System.out.println("Oh. That's great then!");
        break;

      case "no":
        System.out.println("Really? Well there are many data types"
            + "\nin Java. For example your name is stored in"
            + "\na data type called a String, but that"
            + "\nisn't the only data type there is. There are"
            + "\nalso int's (Integers), double's, floats, longs, shorts,"
            + "\nbytes, booleans, and chars (characters) in the language too!");
        break;

      default:
        System.out.println("You didn't input a valid response.");

    }

    // String = An object in Java that allows you to store words and letters
    // int = A data type that allows you to store whole numbers (integers)
    // double = A data type that allows you to store numbers with decimals
    // float = A data type similar to double, but can hold larger values
    // long = A data type that stores whole numbers larger than int can hold
    // short = A data type that has a smaller range of whole numbers compared
    // to int
    // byte = A data type that has a smaller range of whole numbers compared
    // to short
    // char = A data type that can only hold one character (letter or symbol)
    // boolean = A data type with only two values (true or false)

    // Creates an GetInitials object named userInitials
    GetIntials userInitials = new GetIntials();

    // assigns the returned value of the personInitials method to initials
    // -----------------------------Call----------------Arguments
    // ------------------------------|----------------------|
    // ------------------------------V----------------------V
    String initials = userInitials.personInitials(firstName, lastName);

    // Outputs the user's first and last name as well as their initials
    System.out.println("So you are " + firstName + " " + lastName + "."
        + "\nThat means your initials would be " + initials + "!");

    // Prompts an integer input from the user
    System.out.println("Can you enter a number between 1 and 100 that"
        + " is a whole number?");
    int num1 = NumberInput.getGoodInt(scan);

    // Asks user for the second number to divide
    System.out.println("Can you enter another number between 1 and 100 that"
        + " is a whole number?");
    int num2 = NumberInput.getGoodInt(scan);

    // Divides the first number by the second number
    int intDivision = num1 / num2;

    // Lets the user know that division took place and the answer of it
    System.out.println(
        "Let's divide! The quotient of the two numbers is " + intDivision);

    // Asks user if they are confused by integer division
    System.out.println("Are you confused by the answer?");
    scan.nextLine();

    String confusedAnswer = StringInput.getGoodString(scan);
    confusedAnswer = confusedAnswer.toLowerCase();

    // The condition for the later if-else statement
    byte ifCondition;

    // Outputs a response based on user's answer to being confused
    switch (confusedAnswer) {
      case "yes":
        System.out.println("Well let me tell you a story.");
        ifCondition = 1;
        break;

      case "no":
        System.out.println("You must be a programmer then.");
        ifCondition = 0;
        break;

      default:
        System.out.println("Well I'm going tell you a story anyways.");
        ifCondition = 1;
        break;

    }

    // Gives a response based on what the user previously answered
    if (ifCondition == 1) {
      System.out.println("What happened was integer division."
          + "\nInteger division is special because in Java if two"
          + "\nintegers are being divided then the result will ALWAYS"
          + "\nbe an integer as well. Which in the case of values that"
          + "\nend up being in between two integers then the program"
          + "\nwill truncate the number leaving only the number to"
          + "\nthe left of the decimal.");
    } else {
      System.out.println("Well I'm glad to meet a fellow programmer!");
      System.out.println("Well let's start on non-integer division.");
    }

    // Prompts the user to enter the different numbers now
    System.out.println("Alright, let us try some normal division."
        + "\nPlease enter a new whole number between 1-100.");
    int divNum1 = NumberInput.getGoodInt(scan);

    // Prompts the user to enter the second number to divide
    System.out.println("Now, please enter a second whole number.");
    int divNum2 = NumberInput.getGoodInt(scan);

    // Division with casting
    double normDivision = divNum1 / (double) divNum2;

    // Outputs the answer in a decimal form
    System.out.println("This is the answer of " + divNum1 + " divided by "
        + divNum2 + ": " + normDivision);

    // Explains why we have a decimal number now
    System.out.println("We were now able to get a decimal answer"
        + "\nbecause within the code the second integer was treated like"
        + "\na double through casting!");

    // Tells the user to enter 4 numbers to have math operations applied to
    System.out.println("Now let's do something crazy. Please enter four"
        + " different integers between 1 and 100 separated by a space.");
    int firstNum = NumberInput.getGoodInt(scan);
    int secondNum = NumberInput.getGoodInt(scan);
    int thirdNum = NumberInput.getGoodInt(scan);
    int fourthNum = NumberInput.getGoodInt(scan);
    scan.nextLine();

    // Tells the user what operations we will be doing with the numbers
    System.out.println("Now we are going to add the first two numbers,"
        + "\nthe sum being multiplied by the third, the product being"
        + "\nsubtracted by the fourth, and finally the difference will"
        + "\nbe divided by the first number.");

    // Math calculation
    double complexMath = (((firstNum + secondNum) * thirdNum) - fourthNum)
        / (double) firstNum;

    // Fake loading
    System.out.println(
        "Calculation complete. Please hit the enter key to" + " continue.");
    scan.nextLine();

    System.out.println("The answer is: " + complexMath);

    // Asks user for their car info
    System.out.println("What company is your car from?");
    String make = StringInput.getGoodString(scan);
    System.out.println("What is your car's top speed?");
    int topSpeed = NumberInput.getGoodInt(scan);
    scan.nextLine();

    // Makes a car object using the a constructor
    Car userCar = new Car(topSpeed, make);
    System.out.println("So you drive a " + userCar.getMake()
        + " and its top speed is " + userCar.getSpeed());

    // do-while loop for the user to hit 5 to continue the program
    int keypress;
    do {
      System.out.println("Press 5 to continue.");
      keypress = NumberInput.getGoodInt(scan);
      scan.nextLine();
    } while (keypress != 5);

    // Prompts user to enter a certain amount of numbers
    System.out.println(
        "Please enter five different integers separated" + " by spaces.");

    // Makes an array of integers that holds up to 5 elements
    int[] numbers = new int[5];

    // A for loop to assign all integers typed in, to the different
    // elements of the numbers array
    for (int counter = 0; counter < numbers.length; counter++) {
      numbers[counter] = NumberInput.getGoodInt(scan);;
    }

    scan.nextLine();

    // Lets the user know what is going to happen next
    System.out.println("Now lets see what is the smallest number you entered."
        + "\nPress enter to continue.");
    scan.nextLine();

    int numSum = numbers[0];
    int largest = numbers[0];
    int smallest = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
      numSum += numbers[i];

      if (numbers[i] > largest) {
        largest = numbers[i];
      } else if (numbers[i] < smallest) {
        smallest = numbers[i];
      } else {
        System.out.println("Loading");
      }
    }

    // Returns smallest number
    System.out.println("Done!");
    System.out.println("The smallest number you entered was... " + smallest);

    // Returns largest number
    System.out.println("Now lets see what the biggest number is.\n"
        + "Press enter to continue.");
    scan.nextLine();

    System.out.println("Loading...");
    System.out.println("Done!");
    System.out.println("The biggest number you entered was... " + largest);
    System.out.println("Alright now lets calculate the sum of all these"
        + " numbers.\nPress enter to continue.");
    scan.nextLine();

    System.out.println("Loading...");
    System.out.println("Done!");
    System.out.println("The total sum of the numbers you entered is " + numSum);

    // Going prompts user to enter a word
    System.out.println("Let's try something a little more complicated."
        + "\nPlease enter your favorite word.");
    
    String favWord = StringInput.getGoodString(scan);
    
    //Makes favWord all lower case.
    favWord = favWord.toLowerCase();

    // Let's the user know what is going to take place
    System.out.println("Now let's get on with the magic trick.\n"
        + "Tell me a letter you would like me to search for\n"
        + "and if it is in your favorite word\n" + "then I will let you know.\n"
        + "If it is not in the word then I will let you know.");

    // prompts the user to enter a letter
    System.out
        .println("Please enter was letter you would like\n" + "me to search.");
    String letToSearch = StringInput.getGoodString(scan);

    // fake load time
    System.out.println("Loading...");

    // turns letToSearch into all lower case
    letToSearch = letToSearch.toLowerCase();

    // converts both favWord and letToSearch into arrays of chars
    char[] favChars = favWord.toCharArray();
    char[] charToSearch = letToSearch.toCharArray();

    // Loop to search through the favChars array to check if the
    // charToSearch is in the favChars array
    boolean found = false;
    int index = 0;
    while (found == false && index < favChars.length) {
      if (favChars[index] == charToSearch[0]) {
        // int placeOfChar = indexOf(charToSearch[0], 0);
        System.out.println("I have found a(n) " + letToSearch + ".");
        // System.out.println("It was at position " + placeOfChar + "." );
        found = true;
      } else {
        System.out.println("Loading...");
        index++;
      }

    }

    if (found == false) {
      System.out.println("Your letter was not found in your word.");
    }

    System.out.println("Press enter to continue");
    scan.nextLine();

    // Prompts user to what is going to happen
    System.out.println("Now we are going do a little bit of math.\n"
        + "I will give you the product of the following 5 numbers...");

    // Does a for-each loop to print out all numbers in the arr array
    int[] arr = { 1, 2, 3, 4, 5 };
    for (int loop : arr) {
      System.out.print(loop + " ");
    }

    System.out.println(
        "\nNow to multiply them together.\n" + "Press enter to continue");
    scan.nextLine();

    // Calculates the total product
    int numProduct = arr[0];
    for (int k = 1; k < arr.length; k++) {
      numProduct = arr[k] * numProduct;
    }
    System.out.println("Loading...\nDone!");
    System.out.println("The total product is " + numProduct + ".");

    // Gives a scenario to the user
    // This uses static fields and methods. Static means that the fields
    // and methods belong to the class itself and not to an object
    System.out.println("Quick! You are on the highway and a cop is coming\n"
        + "up behind you. Press enter to check your current speed");
    scan.nextLine();

    // returns the current speed
    System.out.println("You look at your speedometer and you are going "
        + userCar.getCurrentSpeed() + "mph. Would you like to change your speed?");

    // Evaluates the users choice
    System.out.println("Yes or no?");
    String choice = StringInput.getGoodString(scan);
    int newSpeed;
    choice = choice.toLowerCase();
    if (choice.equals("yes")) {
      System.out.println("Enter what speed you would like to go");
      newSpeed = NumberInput.getGoodInt(scan);
      userCar.setCurrentSpeed(newSpeed);
      System.out.println("OK. You are now going " + userCar.getCurrentSpeed()
          + "mph. Now lets see if you evade the cops..." + "\nLoading...");

      // Determines if user evades
      if (userCar.getCurrentSpeed() > 75) {
        System.out.println(
            "Sorry... You were going too fast and were pulled" + " over.");
      } else if (userCar.getCurrentSpeed() < 65) {
        System.out.println(
            "Sorry... You were going too slow and were pulled" + " over.");
      } else {
        System.out.println("Good job. You stayed within the speed limit.");
      }

    } else {
      System.out.println("Good choice. You are already going the speed limit"
          + "\nsince there is construction currently going on.");
    }

    System.out.println("Press enter to continue");
    scan.nextLine();

    // Reversing a given input of the user
    System.out.println(
        "Its time for more magic. " + "\nPlease enter a short phrase.");
    String phrase = StringInput.getGoodString(scan);
    StringBuilder reverse = new StringBuilder(phrase);
    System.out.println("Here is your phrase backwards: " + reverse.reverse());

    System.out.println("Press enter to continue");
    scan.nextLine();

    // Exercise in the .append() method
    System.out.println("Please enter an adjective...");
    String adj = StringInput.getGoodString(scan);
    System.out.println("Please enter a noun...");
    String noun = StringInput.getGoodString(scan);
    System.out.println("Loading...");
    StringBuilder sbAdj = new StringBuilder(adj);
    System.out.println("Here is the result: " + sbAdj.append(" " + noun));

    System.out.println("Press enter to continue");
    scan.nextLine();

    // Using the .deleteCharAt() method
    System.out.println("Please enter a word");
    String word = StringInput.getGoodString(scan);
    
    StringBuilder newWord = new StringBuilder(word);
    boolean pass = false;
    do {
      try {
        System.out.println("Now enter an integer between 0 and " 
            + (word.length() - 1));
        int charPlace = NumberInput.getGoodInt(scan);
        scan.nextLine();
        System.out.println("Loading...");
        newWord = newWord.deleteCharAt(charPlace);
        pass = true;
      } catch (Exception e) {
        System.out.println("The number you chose is outside the bounds."
            + "\nPlease enter a new number.");
      }
    } while (pass == false);
    System.out.println("Here is your new word: " + newWord);


    // Assigning values to the different fields
    System.out.println("So now imagine yourself as a great person who"
        + "\ntook in 3 different strays. A dog, a cat, and a something"
        + "\nthat you dont know.");
    System.out.println("Press enter to go through your dog's info.");
    scan.nextLine();
    
    // Creates a Dog object
    Dog myDog = new Dog();

    // Dog values
    System.out.println("What is the dog's breed?");
    String dogBreed = StringInput.getGoodString(scan);
    myDog.setBreed(dogBreed);

    System.out.println("What is the dog's age?");
    int dogAge = NumberInput.getGoodInt(scan);
    myDog.setAge(dogAge);

    //System.out.println("What is the dog's name?");
    //String dogName = StringInput.getGoodString(scan);
    //myDog.setName(dogName);
    
    System.out.println("Now to the cat. Press enter to continue.");
    scan.nextLine();
    
    //Creates a Cat object 
    Cat myCat = new Cat();

    // Cat values
    System.out.println("What is the cat's breed?");
    String catBreed = StringInput.getGoodString(scan);
    myCat.setBreed(catBreed);

    System.out.println("What is the cat's age?");
    int catAge = NumberInput.getGoodInt(scan);
    myCat.setAge(catAge);

    //System.out.println("What is the cat's name?");
    //String catName = StringInput.getGoodString(scan);
    //myCat.setName(catName);
    
    //Creates an Animal object.
    Animal myAnimal = new Animal();

    // Animal Values
    System.out.println("Well...you don't know what kind of creature the last"
        + "\nanimal is so you cannot identify its breed or its age. So what"
        + "\ndid you name it?");
    String animalName = StringInput.getGoodString(scan);
    myAnimal.setName(animalName);
    
    // Puts the three objects above into an array of type Animal
    Animal[] animals = { myAnimal, myDog, myCat };

    // Iterating through the animals array
    System.out.println("So lets recap the information about your animals.");
    for (Animal a : animals) {
      System.out.println("You have a " + a.showAnimal()
          + "\n" + " and is " + a.getAge() + " years old. " 
          + "\nit likes to go... ");
      a.makeSound();
    }
    //The above code shows polymorphism due to overriding methods
    //as well as that both Dog and Cat IS-A Animal
    
    System.out.println("Press enter to get the current date and time.");
    scan.nextLine();
    System.out.println(LocalDateTime.now());
    
    MathOperation addition = (int a, int b) -> a + b;
    MathOperation subtraction = (int a, int b) -> a - b;
    System.out.println("10 + 5 = " + operate(10, 5, addition));
    System.out.println("10 - 5 = " + operate(10, 5, subtraction));
    System.out.println("The above two expression were used using Lamda!");

    // Let's the user know that the program has come to an end
    System.out.println("Well this is the end of this program."
        + " Thanks for playing with me. Bye!");
    scan.close();
  }

  private static int operate(int number, int number2, MathOperation matOp) {
    return matOp.operation(number, number2);
  }



}


// Objects are instances of a class...like a house
// Class is code...like a blueprint
// Only ever have one project open in Eclipse applied