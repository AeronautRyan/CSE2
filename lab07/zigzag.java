//Ryan Wheeler
//April 30, 2015
//Zigzag
//Creates zigzag lines

import java.util.Scanner;

public class zigzag{
    
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner(System.in);
        boolean continuation = true;
        
        while(continuation == true){
        
        int zigzagValue = 0;
        System.out.println("Enter an integer between 3 and 33: ");
        zigzagValue = myScanner.nextInt();
        
        for(int i = 0; i < zigzagValue; i++){
            
            System.out.print("*");
            
        }
        
        for(int i = 0; i < (zigzagValue - 2); i++){
            System.out.println();
            for(int j = 0; j <= i; j++){
                
                System.out.print(" ");
                
            }
            System.out.print("*");
        }
        
        System.out.println();
        
        for(int i = 0; i < zigzagValue; i++){
            
            System.out.print("*");
            
        }
        
        System.out.println();
        
        System.out.println("To continue type y: ");
        String userin = myScanner.next();
        
        if(userin.equals("y")){
            continuation = true;
        }
        else{
            continuation = false;
        }
        }
        
    }
    
}