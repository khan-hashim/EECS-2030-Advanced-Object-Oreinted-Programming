package console_apps;

import java.util.Scanner;

import model.Utilities;

public class GeometricSequenceApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/* Stage 1: Prompt the user for input(s) and read input(s) from the user */
		System.out.println("Enter the first term of a geometric sequence (of size 5):");
		int ft = input.nextInt();
		
		System.out.println("Enter the common ratio of the geometric sequence:");
		int r = input.nextInt();
		
		/* Stage 2: Invoke the relevant utility method with the user input(s) */
		String result = Utilities.getGeometricSequence(ft, r);
		
		/* Stage 3: Output the returned value back to the user over the console. */
		System.out.println(result);
		
		input.close();
	}

}
