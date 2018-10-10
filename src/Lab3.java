import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to the automated decision maker. Can I have your name?: ");

		String userName; 
		
		String userCont = "y"; // This variable is used to decide if the user wants to continue using the program.

		Scanner scnr = new Scanner(System.in); // This initializes an instance of the scanner class.

		while (userCont.equalsIgnoreCase("y")) { // The while loop continues as long as the user inputs 'y' after the loop is completed.
			userName = scnr.nextLine();
			System.out.println("Hey " + userName + "! Let's get started. \nPlease enter a number between 1 and 100.");
			int userNum = 0;
			
			while(!scnr.hasNextInt()) { // This validates the input to ensure that the user only inputs an integer.
				System.out.println("Please be sure to enter an integer.");
				scnr.nextLine(); // Garbage line
	
			}
			userNum = scnr.nextInt();
			
			if (userNum >= 1 && userNum <= 100) { // This if/else ensures that the user enters a # between 1 and 100.
					input(userNum); // if the user enters an integer between 1 - 100 we are ready to roll and it sends us to the input method.
				}
			else {
					System.out.println("Please be sure that your number is between 1 and 100");
				}
			
			System.out.println("Press Y to continue. Press any other key to stop."); // Prompt to see if the user wants to continue.
			
			userCont = scnr.next();
			}
			
			
			
		
		
		System.out.println("Goodbye"); // The while loop will end when the user inputs something other that Y and end the program.
		
	}
		

	public static void input(int userNum) { // This is an instance of this integer variable in this method.

		if (userNum >= 1 && userNum <= 100) { // Ensures that the input is between 1-100.
		} else {
			System.out.println("Please be sure that your number is between 1 and 100");
		}

		if ((userNum % 2) == 1) { // This will take all odd numbers.

			if (userNum > 60) { // Odd numbers over 60.
				System.out.println(userNum + " Odd. \nOdd and over 60.");
			} else {
				System.out.println(userNum + " Odd."); // All other odd numbers.
			}
		} else if ((userNum) >= 2 && (userNum <= 25)) { // All even #s between 25.
			System.out.println("Even and less than 25.");
		} else if (userNum > 60) { 	// All even numbers over 60.
			System.out.println(userNum + " Even");
		} else {
			System.out.println("Even."); // All remaining even numbers.
		}

	}

}
