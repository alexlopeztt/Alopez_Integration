import java.util.Scanner;

//Alexander Lopez
//My project that integrates all the skills I have learned
// sysout Ctrl+space
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//System.out.println("Hello World!");
		
		System.out.println("What is your name?");
		String userName = scan.nextLine();
		System.out.println(userName);
		
		System.out.println("Enter x1"); //Prompt
		int x1 = scan.nextInt();
		System.out.println(x1);
		
		System.out.println("Enter rate"); //Prompt
		double rate = scan.nextDouble();
		System.out.println(rate);
		
		scan.nextLine();
		
		System.out.println("What is your title?");
		String title = scan.nextLine();
		System.out.println(title);
		
		Dog spot = new Dog();
		spot.size = 30.5;
		spot.breed = "German Shepard";
		System.out.println(spot.breed);
		
		Dog spuds = new Dog();
		spuds.size = 40.3;
		spuds.breed = "Bull Dog";
	}

}

class Dog{
	double size;
	String breed;
}
//Objects are instances of a class...like a house
//Class is code...like a blueprint
//Only ever have one project open in Eclipse applied