//Ryan Wheeler
//February 5, 2015
//Homework 3
//Bicycle
//This program determines distance traveled and miles per hour based on
//input from the user

//############################# CODE #####################################

//Imports scanner
import java.util.Scanner;

//Creates class
public class Bicycle {

    //Creates main
    public static void main ( String[]args ) {
    
        //Declares and creates scanner
        Scanner myScanner = new Scanner ( System.in );
        
        //----------------- INPUT -------------------
        
        System.out.println("Enter the number of seconds: ");
        int numberSeconds = myScanner.nextInt(); //Takes input for seconds
        
        System.out.println("Enter the number of counts: ");
        int numberCounts = myScanner.nextInt(); //Takes input for counts
        
        //-------------- CALCULATIONS ----------------
        
        double distancePerCount = ( (double)27 / (double)63360 );
        double distanceMiles = ((double)( distancePerCount ) * (double)( numberCounts ));
        double timeMinutes = ((double)( numberSeconds ) / (double)( 60 ));
        double timeHours = ((double)timeMinutes / (double)60 );
        double milesPerHour = ((double)( distanceMiles ) / (double)( timeHours ));
        
        //---------------- OUTPUT ---------------------
        
        System.out.format("The distance was %.2f miles and took %.2f minutes", 
        distanceMiles, timeMinutes);
        System.out.format("\nThe average mph was %.2f \n", milesPerHour);
        
    }
    
}