//Ryan Wheeler
//March 3, 2015
//Homework 6
//Run Factorial
//This program takes input from the user and determines the factorial of said
//input.

//Imports scanner
import java.util.Scanner;

//Creates class
public class RunFactorial{
    
    //creates main
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        int factorialValue = 0;
        System.out.println("Enter and integer between 9 and 16: ");
        for(int integerCheck = 0; integerCheck < 1; integerCheck++){
            
            factorialValue = myScanner.nextInt();
            if(factorialValue < 9 || factorialValue > 16){
                System.out.println("Invalid input, enter again! ");
                integerCheck -= 1;
            }
            
        }
        
        int whileCounter = 1;
        int finalFactorial = 1;
        while(whileCounter <= factorialValue){
            finalFactorial *= whileCounter;
            whileCounter += 1;
        }
        System.out.println("Input accepted:\n" + factorialValue + " != "
        + finalFactorial);
        
    }
    
}