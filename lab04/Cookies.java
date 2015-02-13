//Ryan Wheeler
//February 13, 2015
//Lab 4
//Cookies
//This program is meant to take input from the user and determine if the
//cookies input by the user is divisible evenly amongst the number of 
//people input by the user.

//Imports scanner
import java.util.Scanner;

//Creates class
public class Cookies {

    //Creates main
    public static void main ( String[]args ) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Enter the number of people: ");
        
        if(myScanner.hasNextInt()){//Recieves input
            
            int numberPeople = myScanner.nextInt();
            System.out.println("Enter the number of cookies: ");
        
            if(myScanner.hasNextInt()){//Recieves input
                
                int numberCookies = myScanner.nextInt();
                System.out.println("How many per person?: ");
        
                if(myScanner.hasNextInt()){//Recieves input
                    
                    int cookiesPerPerson = myScanner.nextInt();
                    
                    int cookiesNeeded = (numberPeople * cookiesPerPerson);
                    
                    if(numberCookies >= cookiesNeeded){//Determines if there are enough cookies.
                        
                        if(numberCookies % cookiesPerPerson == 0){//Determines if it divides evenly.
                            
                            System.out.println("You have enough cookies and they will divide evenly.");
                            
                        }
                        else{
                            
                            System.out.println("You have enough but they will not divide evenly.");
                            
                        }
                        
                    }
                    else{
                        
                        int neededDifference = (cookiesNeeded - numberCookies);
                        System.out.format("Not enough cookies, still need %d.\n", neededDifference);
                        
                    }
            
                }
                else{
            
                    System.out.println("You did not enter an int.");//Displays error.
                    return;
            
                }
            
            }
            else{
            
                System.out.println("You did not enter an int.");//Displays error.
                return;
            
            }
            
        }
        else{
            
            System.out.println("You did not enter an int.");//Displays error.
            return;
            
        }
        
    }
    
}