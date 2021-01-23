package console_apps;

import java.util.Scanner;

import model.Utilities;

public class TimeConversionApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt the user for input(s) and read input(s) from the user */
		System.out.println("Enter a non-negative integer number of secons:");
		int seconds = input.nextInt();
		
		/* Stage 2: Invoke the relevant utility method with the user input(s) */
		String result = Utilities.getTimeConversion(seconds);
		
		/* Stage 3: Output the returned value back to the user over the console. */
		System.out.println(result);
		
		input.close();
	}

}
