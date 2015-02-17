//Ryan Wheeler
//February 16, 2015
//Homework 4
//Banking
//This program allocates a random amount of money to the user's bank. The user 
//is then allowed to deposit, withdraw or check their balance

//############################ CODE ################################

//Imports scanner utility
import java.util.Scanner;

//Creates class
public class Banking {

    //Creates main
    public static void main ( String[]args ) {
        
        Scanner myScanner = new Scanner (System.in);
        
        //Adds random value to user's bank account
        int initialMoney = (int) (Math.random() * 5000);
        
        System.out.format("Your account balance is: $%d\n", initialMoney);
        System.out.println("Enter  \"w\" for withdraw, \"d\" for deposit," + 
        " or \"b\" for checking balance: ");
        String bankingCommand = myScanner.nextLine();
        
        if((bankingCommand.equals( "w" )) || (bankingCommand.equals( "W" ))){
            
            System.out.println("How much would you like to withdraw?: ");
            int amountWithdraw = myScanner.nextInt();
            if((amountWithdraw >= 0) && (amountWithdraw <= initialMoney)){
                
                int finalWithdrawAmount = (initialMoney - amountWithdraw);
                System.out.format("You withdrew $%d and have $%d remaining.\n", 
                amountWithdraw, finalWithdrawAmount);
                
            }
            else{
                
                System.out.println("Invalid amount. Insufficient funds.\n");
                return;
                
            }
            
        }
        else if((bankingCommand.equals( "d" )) || (bankingCommand.equals( "D" ))){
            
            System.out.println("How much would you like to deposit?: ");
            int amountDeposit = myScanner.nextInt();
            if((amountDeposit >= 0)){
                
                int finalDepositAmount = (initialMoney + amountDeposit);
                System.out.format("You deposited $%d and have $%d in the account.\n", 
                amountDeposit, finalDepositAmount);
                
            }
            else{
                
                System.out.println("Invalid amount. ");
                return;
                
            }
            
        }
        else if((bankingCommand.equals( "b" )) || (bankingCommand.equals( "B" ))){
            
            System.out.format("Your account balance is: $%d\n", initialMoney);
            
        }
        else{
            
            System.out.println("Invalid input. ");
            return;
            
        }
        
    }
    
}