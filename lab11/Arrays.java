//Ryan Wheeler
//April 10, 2015
//
//Arrays
//This program allows the user to search arrays and stuff.

import java.util.Scanner;
public class Arrays{
    
    public static void main(String[]args){
        Scanner myScanner = new Scanner(System.in);
        int[]array1 = new int[50];
        int[]array2 = new int[50];
        
        //Adds random values to array 1
        for(int i = 0; i < 50; i++){
            
            array1[i] = (int)(Math.random() * 99);
            
        }
        
        outerloop:
        for(int i = 99; i >= 0; i--){
            
            for(int j = 0; j < 50; j++){
                
                if(array1[j] == i){
                    
                    System.out.println("The maximum value in Array 1 is " + i);
                    break outerloop;
                }
                
            }
            
        }
        
        outerloop:
        for(int i = 0; i <= 99; i++){
            
            for(int j = 0; j < 50; j++){
                
                if(array1[j] == i){
                    
                    System.out.println("The minimum value in Array 1 is " + i);
                    break outerloop;
                }
                
            }
            
        }
        
        //@@@@@@ ARRAY 2 @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        int arrayValue = 0;
        for(int i = 0; i < 50; i++){
            
            arrayValue = (((int)(Math.random() * 99)) + arrayValue);
            
            array2[i] = arrayValue;
            
        }
        
        System.out.println("\nThe maximum value in Array 2 is " + array2[49]);
        System.out.println("The minimum value in Array 2 is " + array2[0]);
        
        //@@@@@@ SEARCHES @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
        try{
            System.out.println("Please input an integer");
            int scannedValue = myScanner.nextInt();
        }
        catch(InputMismatchException exception){
            System.out.println("This is not an integer");
            System.exit(0);
        }
        
        
    }
    
}