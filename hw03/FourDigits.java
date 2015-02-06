//Ryan Wheeler
//February 6, 2015
//HW03
//Four Digits
//In this program, the user enters a double and the code
//displays the four digits to the right of the decimal place.

//Imports scanner class
import java.util.Scanner;

//Creates class
public class FourDigits{

	//Creates main
	public static void main ( String[]args ){

		//Declares and creates scanner
		Scanner myScanner = new Scanner (System.in);
		
		System.out.print("Enter a double to have the 4 digits ");
		System.out.print("to the right of the decimal place displayed: ");
		double originalNumber = myScanner.nextDouble(); //Recieves input

		int originalNumberInt = (int)originalNumber;
		double finalDecimal = (double)originalNumber - (double)originalNumberInt;
        //Converts double to int so it rounds and can be subtracted

		double finalNumber = finalDecimal * 10000; //Moves the decimal place
		
		System.out.format("\nThe four digits are: %.0f\n", finalNumber);
		//Displays the value without any decimal places

	}

}