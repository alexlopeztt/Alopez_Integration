import java.util.Scanner;

//Alexander Lopez
//This is my project that integrates all the skills I have learned
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String myName = "Alex";
		int myAge = 19;
		//introduction
		System.out.println("Hello and welcome to this project!");
		
		//Asks user for name
		System.out.println("What is your name?");
		String name = myName; //scan.nextLine();
		
		//Responds to user's name and says it back
		System.out.println("Oh, so your name is "
				+ name  + "? Nice to meet you, " + name + "."); 
		
		//Asks user for their age
		System.out.println("How old are you, " + name 
				+ "? If I may ask?");
		int age = myAge; //scan.nextInt();
		
		//Responds to the user's age and repeats it back
		System.out.println("So you are " + age + " years old."
				+ " How wonderful!");
		
		//Asks if the user knows about variables
		System.out.println("Did you know, " + name + " that a variable is "
				+ "like a box in memory that holds specific data "
				+ "depending on what kind of box it is?"); 
		System.out.println("Yes or no?");
		String answerYS =  "yes"; //scan.nextLine();
		
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
		
		//Prompts user to give first name
		System.out.println("Could you tell me your first name?");
		String firstName = "Alex"; //scan.nextLine();
		
		//prompts user to give last name
		System.out.println("Now could you tell me your last name?");
		String lastName = "Lopez"; //scan.nextLine();
		
		//Creates an GetInitials object named userInitials 
		GetInitails userInitials = new GetInitails();
		
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
		int num1 = 5; //scan.nextInt();
		
		//Asks user for the second number to divide
		System.out.println("Can you enter another number between 1 and 100 that"
        + " is a whole number?");
		int num2 = 10; //scan.nextInt();
		
		//Divides the first number by the second number
		int intDivision = num1 / num2;
		
		//Lets the user know that division took place and the answer of it 
		System.out.println("Lets divide! The quotent of the two numbers are "
		    + intDivision);
		
		//Asks user if they are confused by integer division
		System.out.println("Are you confused by the answer?");
		scan.nextLine();
		String confusedAnswer = "yes"; //scan.nextLine();
		confusedAnswer.toLowerCase();
		
		//The condition for the later if-else statement
		int ifCondition;
		
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
		    System.out.println("Well im gonna tell you a story anyways.");
		    ifCondition = 1;
		    break;
		  
		}
		
		//Gives a response based on what the user previously answered
		if (ifCondition == 1) {
		  System.out.println("What happened was integer division."
		      + " integer division is special because in Java if two"
		      + " integers are being divided then the result will ALWAYS"
		      + " be an integer as well. Which in the case of values that"
		      + " end up being inbetween two integers then the program"
		      + " will truncate the number leaving only the number to"
		      + " the left of the decimal.");
		} else {
		  System.out.println("Well im glad to meet a fellow programmer!");
		  System.out.println("Well let us start on non-integer division.");
		}
		
		//Prompts the user to enter the different numbers now
		System.out.println("Alright, let us try some normal division."
		    + " Please enter a new whole number between 1-100.");
		int divNum1 = scan.nextInt();
		
		//Prompts the user to enter the second number to divide
		System.out.println("Now, please enter a second whole number.");
		int divNum2 =scan.nextInt();
		
		//division with casting
		double normDivision = divNum1 / (double) divNum2;
		
		System.out.println("This is the answer of " + divNum1
		    + " divided by " + divNum2 + ": " + normDivision);
		
	}

}


//Objects are instances of a class...like a house
//Class is code...like a blueprint
//Only ever have one project open in Eclipse applied