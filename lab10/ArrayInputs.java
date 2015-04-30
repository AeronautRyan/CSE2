//Ryan Wheeler
//April 3, 2015
//Array Inputs
//This program is meant to give practice with arrays.

import java.util.Scanner;

public class ArrayInputs{
    
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        boolean isInt = false;
        int arraySize = 0;
        System.out.println("Enter a positive integer for the size of the array.");
        arraySize = arrayValue();
        
        int[]userArray = new int[arraySize];
        
        System.out.println("Enter array values: ");
        for(int i = 0; i < arraySize; i++){
            
            userArray[i] = myScanner.nextInt();
            
        }
        
        System.out.println("The array is: ");
        for(int i = 0; i < userArray.length; i++){
            
            System.out.print(" " + userArray[i]);
            
        }
        System.out.println();
        
    }
    
    public static int arrayValue(){
        
        Scanner myScanner = new Scanner(System.in);
        boolean isInt = false;
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