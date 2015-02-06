//Ryan Wheeler
//February 6, 2015
//Lab 03
//Big Mac
//This lab takes input from the user and uses it to calculate the cost of a
//Big Mac. This program uses the Scanner utility to recieve input from the user.

//################################# CODE ######################################

//Creates Scanner
import java.util.Scanner;

//Creates class
public class BigMac{
    
    //Creates main
    public static void main ( String[]args ){
    
        //Declares and creates scanner
        Scanner myScanner = new Scanner ( System.in );
        
        //----------------- INPUT ----------------
        
        System.out.println("Enter the number of Big Macs: ");
        int numberBigMacs = myScanner.nextInt();
        
        System.out.println("Enter the cost of one Big Mac in the form xx.xx: ");
        double costBigMacs = myScanner.nextDouble();
        
        System.out.println("Enter the tax rate as a whole number: ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;
        
        //-------------- CALCULATIONS --------------
        
        double bigMacCost$ = (double)numberBigMacs * (double)costBigMacs *
        ((double)1 + (double)taxRate);
        taxRate*=100;
        
        //----------------- OUTPUT -----------------
        
        System.out.format("\nThe total cost of %d Big Macs, at ", numberBigMacs);
        System.out.format("$%.2f per Big Mac, with a sales tax ", costBigMacs);
        System.out.format("of %.0f percent, is $%.2f\n", taxRate, bigMacCost$);
        
    }
    
}