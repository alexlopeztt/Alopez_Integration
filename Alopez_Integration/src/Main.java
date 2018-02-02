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
		scan.nextLine();
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
		
		
			
	}

}


//Objects are instances of a class...like a house
//Class is code...like a blueprint
//Only ever have one project open in Eclipse applied