import java.util.Scanner;

//Alexander Lopez
//This is my project that integrates all the skills I have learned
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Variables
		//String myName = "Alex";
		//int myAge = 19;
		
		//introduction
		System.out.println("Hello and welcome to my integration project!");
		
		//Asks user for name
		System.out.println("What is your first and last name?");
		//String name = myName; 
		String firstName = scan.next();
		String lastName = scan.next();
		scan.nextLine();
		String name = firstName + " " + lastName;
		
		//Responds to user's name and says it back
		System.out.println("Oh, so your name is "
				+ firstName  + "? Nice to meet you, " + firstName + "."); 
		
		//Asks user for their age
		System.out.println("How old are you, " + firstName 
				+ "? If I may ask?");
		//int age = myAge; 
		int age = scan.nextInt();
		scan.nextLine();
		
		//Responds to the user's age and repeats it back
		System.out.println("So you are " + age + " years old."
				+ " How wonderful!");
		
		//Asks if the user knows about variables
		System.out.println("Did you know, " + firstName + " that a variable is "
				+ "like a box in memory that holds specific data "
				+ "depending on what kind of box it is?"); 
		System.out.println("Yes or no?");
		//String answerYS =  "yes"; 
		String answerYS = scan.nextLine();
		
		//Sets the user's response to all lower case
		answerYS = answerYS.toLowerCase();
				
		//A switch statement to determine outcome based on user response
		switch (answerYS) {
		  case "yes":
		    System.out.println("Oh. That's great then!");
		    break;
		    
		  case "no":
		    System.out.println("Really? Well there are many data types"
	          + " in Java. For example your name is stored in"
	          + " a data type called a String, but that"
	          + " isn't the only data type there is. There are"
	          + " also int's (Integers), double's, floats, longs, shorts,"
	          + " bytes, booleans, and chars (characters) in the language too!");
		    break;
		    
		  default:
		      System.out.println("You didn't input a vaild response.");
	    
		}
		
		//String = An object in Java that allows you to store words and letters
		//int = A data type that allows you to store whole numbers (integers)
		//double = A data type that allows you to store numbers with decimals
		//float = A data type similar to double, but can hold larger values
		//long = A data type that stores whole numbers larger than int can hold
		//short = A data type that has a smaller range of whole numbers compared 
		  //to int
		//byte = A data type that has a smaller range of whole numbers compared
		  //to short
		//char = A data type that can only hold one character (letter or symbol)
		//boolean = A data type with only two values (true or false)
		
		//Creates an GetInitials object named userInitials 
		GetIntials userInitials = new GetIntials();
		
		//assigns the returned value of the personInitials method to initials
		//                                 Call             Arguments
		//                                   |                  |
		//                                   V                  V
		String initials = userInitials.personInitials(firstName, lastName);
		
		//Outputs the user's first and last name as well as their initials 
		System.out.println("So you are " + firstName + " " + lastName + "."
		    + " That means your initials would be " + initials + "!");
			
		//Prompts an integer input from the user
		System.out.println("Can you enter a number between 1 and 100 that"
		    + " is a whole number?");
		//int num1 = 5; 
		int num1 = scan.nextInt();
		
		//Asks user for the second number to divide
		System.out.println("Can you enter another number between 1 and 100 that"
        + " is a whole number?");
		//int num2 = 10; 
		int num2 = scan.nextInt();
		
		//Divides the first number by the second number
		int intDivision = num1 / num2;
		
		//Lets the user know that division took place and the answer of it 
		System.out.println("Let's divide! The quotient of the two numbers are "
		    + intDivision);
		
		//Asks user if they are confused by integer division
		System.out.println("Are you confused by the answer?");
		scan.nextLine();
		
		//String confusedAnswer = "yes"; 
		String confusedAnswer = scan.nextLine();
		confusedAnswer.toLowerCase();
		
		//The condition for the later if-else statement
		byte ifCondition;
		
		//Outputs a response based on user's answer to being confused
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
		    System.out.println("Well I'm gonna tell you a story anyways.");
		    ifCondition = 1;
		    break;
		  
		}
		
		//Gives a response based on what the user previously answered
		if (ifCondition == 1) {
		  System.out.println("What happened was integer division."
		      + " Integer division is special because in Java if two"
		      + " integers are being divided then the result will ALWAYS"
		      + " be an integer as well. Which in the case of values that"
		      + " end up being inbetween two integers then the program"
		      + " will truncate the number leaving only the number to"
		      + " the left of the decimal.");
		} else {
		  System.out.println("Well I'm glad to meet a fellow programmer!");
		  System.out.println("Well let's start on non-integer division.");
		}
		
		//Prompts the user to enter the different numbers now
		System.out.println("Alright, let us try some normal division."
		    + " Please enter a new whole number between 1-100.");
		int divNum1 = scan.nextInt();
		
		//Prompts the user to enter the second number to divide
		System.out.println("Now, please enter a second whole number.");
		int divNum2 = scan.nextInt();
		
		//Division with casting
		double normDivision = divNum1 / (double) divNum2;
		
		//Outputs the answer in a decimal form
		System.out.println("This is the answer of " + divNum1
		    + " divided by " + divNum2 + ": " + normDivision);
		
		//Explains why we have a decimal number now
		System.out.println("We were now able to get a decimal answer"
		    + " because within the code the second integer was treated like"
		    + " a double through casting!");
		
		//Let's the user know that the program has come to an end
		System.out.println("Well this is the end of this program."
		    + " Thanks for playing with me. Bye!");
	}

}


//Objects are instances of a class...like a house
//Class is code...like a blueprint
//Only ever have one project open in Eclipse applied