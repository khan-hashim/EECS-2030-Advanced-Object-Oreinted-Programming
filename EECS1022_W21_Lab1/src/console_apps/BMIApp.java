package console_apps;

import java.util.Scanner;

import model.Utilities;

public class BMIApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt the user for input(s) and read input(s) from the user */
		System.out.println("Enter your name:");
		String user = input.nextLine();
		
		System.out.println(user + ", enter a non-negative floating-point number of your weight (in pounds):");
		double weight = input.nextDouble();
		
		System.out.println(user + ", enter a non-negative floating-point number of your height (in inches):");
		double height = input.nextDouble();
		
		/* Stage 2: Invoke the relevant utility method with the user input(s) */
		double result = Utilities.getBMI(weight, height);
		
		/* Stage 3: Output the returned value back to the user over the console. */
		System.out.println(user + ", your BMI is: " + result);
		
		input.close();
	}

}
