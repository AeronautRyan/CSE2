//Ryan Wheeler
//March 17, 2015
//Homework 7
//Waves
//This program takes input from a user and uses that input to print out
//waves of numbers

import java.util.Scanner;

//Creates class
public class waves{
    
    //creates main
    public static void main(String[]args){
        
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter a number between 1 and 30: ");
        int waveNumber = myScanner.nextInt();
        System.out.println("For Loop:\n");
    
        if((waveNumber > 0) & (waveNumber < 30)){
            
        //############################### FOR LOOP ############################
            
            for(int waveCounter1 = 1; waveCounter1 <= waveNumber; waveCounter1++){
                
                if((waveCounter1 % 2) == 0){
                for(int waveCounter2 = 1; waveCounter2 <= waveCounter1; waveCounter2++){
                    
                        for(int waveCounter4 = 1; waveCounter4 <= waveCounter2; waveCounter4++){
                            
                            System.out.print("" + waveCounter1);
                        }
                    System.out.println("");    
                }
                }
                else{
                    
                    for(int waveCounter2 = waveCounter1; waveCounter2 >= 1; waveCounter2--){
                        
                        for(int waveCounter3 = 1; waveCounter3 <= waveCounter2 ; waveCounter3++){
                            
                            System.out.print("" + waveCounter1);
                        }
                        System.out.println("");
                        
                    }
                }
            }
        
        //################################ WHILE LOOP #########################  
            int whileCounter1 = 1;
            int whileCounter2 = 1;
            int whileCounter3 = 1;
            int whileCounter4 = 1;
            int whileCounter5 = 1;
            
            System.out.println("\nWhile Loop:\n");
            
            while(whileCounter1 <= waveNumber){
                
                whileCounter5 = whileCounter1;
                
                if((whileCounter1 % 2) == 0){
                while(whileCounter2 <= whileCounter1){
                    
                        while(whileCounter4 <= whileCounter2){
                            
                            System.out.print("" + whileCounter1);
                            whileCounter4 += 1;
                        }
                    System.out.println("");
                    whileCounter2 += 1;
                    whileCounter4 = 1;
                }
                whileCounter2 = 1;
                }
                else{
                    
                    while(whileCounter5 >= 1){
                        
                        while(whileCounter3 <= whileCounter5){
                            
                            System.out.print("" + whileCounter1);
                            whileCounter3 += 1;
                        }
                        System.out.println("");
                        whileCounter5 -= 1;
                        whileCounter3 = 1;
                    }
                }
                
                whileCounter1 += 1;
            }
        
        //############################## DO WHILE LOOP ########################
        
            int doWhileCounter1 = 1;
            int doWhileCounter2 = 1;
            int doWhileCounter3 = 1;
            int doWhileCounter4 = 1;
            int doWhileCounter5 = 1;
            
            System.out.println("\nDo While Loop:\n");
            
            do{
                
                doWhileCounter5 = doWhileCounter1;
                
                if((doWhileCounter1 % 2) == 0){
                do{
                    
                        do{
                            
                            System.out.print("" + doWhileCounter1);
                            doWhileCounter4 += 1;
                        }while(doWhileCounter4 <= doWhileCounter2);
                    System.out.println("");
                    doWhileCounter2 += 1;
                    doWhileCounter4 = 1;
                }while(doWhileCounter2 <= doWhileCounter1);
                doWhileCounter2 = 1;
                }
                else{
                    
                    do{
                        
                        do{
                            
                            System.out.print("" + doWhileCounter1);
                            doWhileCounter3 += 1;
                        }while(doWhileCounter3 <= doWhileCounter5);
                        System.out.println("");
                        doWhileCounter5 -= 1;
                        doWhileCounter3 = 1;
                    }while(doWhileCounter5 >= 1);
                }
                
                doWhileCounter1 += 1;
            }while(doWhileCounter1 <= waveNumber);
        
        
        }
        else{
            System.out.println("Invalid Number! ");
        }
        
        
    }
}