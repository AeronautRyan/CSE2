//Ryan Wheeler
//March 3, 2015
//Homework 6
//Get integers
//This program prompts the user for 5 positive integers and prints out the sum
//of the five integers using non nested for loops.

//Imports scanner
import java.util.Scanner;

//Creates class
public class GetIntegers{
    
    //creates main
    public static void main(String[]args){
        
        int sumIntegers = 0;
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter 5 positive integers:");
        for(int forCounter = 0; forCounter < 5; forCounter++){
            
            int scannedValue = myScanner.nextInt();
            if(scannedValue < 0){
                System.out.println("Invalid input.");
                forCounter = forCounter - 1;
                scannedValue = 0;
            }
            
            sumIntegers += scannedValue;
            
        }
        System.out.println("Sum is " + sumIntegers);
    }
    
}