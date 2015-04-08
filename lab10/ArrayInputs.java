//Ryan Wheeler
//April 3, 2015
//Array Inputs
//This program is meant to give practice with arrays.

import java.util.Scanner;

public class ArrayInputs{
    
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        boolean isInt = false;
        int arrayValue = 0;
        System.out.println("Enter a positive integer for the size of the array.");
        arrayValue(myScanner.nextInt());
        
        int[]userArray = new Int[arrayValue];
        
        System.out.println("Enter array values: ");
        for(int i = 0; i < arrayValue; i++){
            
            userArray[i] = myScanner.nextInt();
            
        }
        
    }
    
    public static int arrayValue(myScanner.nextInt()){
        
        int arrayValue = 0;
        while(isInt == false){
            
            if(myScanner.hasNextInt()){
                
                arrayValue = myScanner.nextInt();
                isInt = true;
                
            }
            else{
                myScanner.nextLine();
                System.out.println("Please enter a positive integer. ");
                isInt = false;
                
            }

        }
        return arrayValue;
    }
    
}