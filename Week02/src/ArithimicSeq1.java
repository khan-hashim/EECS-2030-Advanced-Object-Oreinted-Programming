
import java.util.Scanner;

public class ArithimicSeq1 {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the first term ft of the arithematic seq of 5 terms: ");
         int ft = input.nextInt();
         System.out.println("Enter the common differnece: ");
         int d = input.nextInt();
         
         String seq = "[(ft)]" + "[(ft+d)]" + "[(ft+2*d)]" + "[(ft+3*d)]" + "[(ft+4*d)]";
         System.out.println(seq);
         
        input.close();	 
	}

}
