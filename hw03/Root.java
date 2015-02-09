//Ryan Wheeler
//February 5, 2015
//Homework 3
//Root
//This program allows the user to input a double and estimates the value of the
//cube root.

//############################### CODE ########################################

//Imports scanner
import java.util.Scanner;

//Creates class
public class Root{
    
    //Creates main
    public static void main ( String[]args ){
        
        //Declares and creates scanner
        Scanner myScanner = new Scanner ( System.in );
        
        //------------------ INPUT ---------------------
        
        System.out.println("Enter a double and I print its cube root: ");
        double x = myScanner.nextDouble();
        
        //--------------- CALCULATIONS -----------------
        
        //Estimates the cube root of a number
        double cubeRoot = ( 1.0 * 4.5 * 4.5 * 5.0 + x ) / ( 1.5 * 4.75 * 6.0 );
        //Cubes the estimate
        double cubeRootCubed = ( cubeRoot * cubeRoot * cubeRoot );
        
        //------------------ OUTPUT --------------------
        
        System.out.format("The cube root is \n\n\t%f", cubeRoot);
        System.out.format("\n\nThe cube is \n\n\t%f\n\n", cubeRootCubed);
        //%f formats it as a floating point number
        
    }
    
}