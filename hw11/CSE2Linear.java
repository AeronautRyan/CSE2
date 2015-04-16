//Ryan Wheeler
//CSE 2
//April 16, 2015

//Linear
//Allows user to enter grades and stores into arrays.

import java.util.Scanner;
import java.util.InputMismatchException;

public class CSE2Linear{
    
    public static void main(String[]args){
        int[]array1 = new int[15];
        for(int a = 0; a < 15; a++){
            
            array1[a] = (int)(getInt("Please input an integer: "));
            
        }
        
    }
    
    public static int getInt(String prompt){
        
        Scanner myScanner = new Scanner(System.in);
        int scannedValue = -1;
        
        while((scannedValue < 0) || (scannedValue > 100)){
            try{
                System.out.println("Please input an integer: ");
                myScanner.hasNextInt();
                scannedValue = myScanner.nextInt();
                
                if((scannedValue < 0) || (scannedValue > 100)){
                 
                    System.out.println("This value is not within range: ");
                    
                }
            }
            catch(InputMismatchException exception){
                System.out.println("This is not an integer");
                scannedValue = -1;
                System.out.println("Please input an integer: ");
                break;
            }
        
        }
        return scannedValue;
    }
    
    
}