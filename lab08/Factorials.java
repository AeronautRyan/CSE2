//Ryan Wheeler
//March 20, 2015
//Lab 8
//Factorials
//This program uses multiple methods to compute a super factorial.

//Imports Scanner
import java.util.Scanner;

//creates class
public class Factorials{
    
    //Creates main method
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the value you want the Super Factorial of: ");
        int regFactorialValue = myScanner.nextInt();
        
        int sFactorialSum = 0;
        
        for(int counter1 = 1; counter1 <= regFactorialValue; counter1++){
            
            sFactorialSum += factorial(counter1);//Uses factorial method
            
        }
        
        print(sFactorialSum);//Uses print method
        
    }
    
    public static int factorial(int fac){//Factorial method solves the factorial
        
        int multiplier = 1;
        
        for(int counter1 = 1; counter1 <= fac; counter1++){
            
            multiplier *= counter1;
            
        }
        
        return multiplier;
        
    }
    
    public static void print(int num){//Print method prints the answer in this form
        
        System.out.println("The super factorial is equal to: " + num);
        
    }
    
}