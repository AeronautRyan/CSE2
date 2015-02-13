//Ryan Wheeler
//February 12, 2015
//Homework 4
//WhichNumber
//This program allows the user to enter an int and after asking a series
// of yes or no questions, the program determines the number entered by the
//user.

// Questions and their cooresponding numbers(Use for navigation):
//
//  1: Is the number even?
//  2: Is it divisible by 3?
//  3: Is your number 6?
//  4: Is the number divisible by 4?
//  5: Is the number divided by 4 greater than 1?
//  6: Is your number 8?
//  7: Is your number 4?
//  8: Is it divisible by 5?
//  9: Is it 10?
//  10: Is it 2?
//  11: Is it divisibly by 3?
//  12: When divided by 3 is the result greater than 1?
//  13: Is it 9?
//  14: Is it 3?
//  15: Is it greater than 6?
//  16: Is it 7?
//  17: Is it less than 3?
//  18: Is it 1?
//  19: Is it 5?

//############################ CODE ################################

//Imports scanner
import java.util.Scanner;

//Creates class
public class WhichNumber {

    //Creates main
    public static void main ( String[]args ) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Think of a number 1 through 10 inclusive.");
        System.out.println("Is the number even? ");
        String answer1 = myScanner.nextLine();
        
        //--------------- Question 1 ---------------------
        
        if(answer1.equals( "y" ) || answer1.equals( "Y" )){
            
            System.out.println("Is it divisible by 3? ");
            String answer2 = myScanner.nextLine();
            
            //------------------ Question 2 ----------------
            
            if(answer2.equals( "y" ) || answer2.equals( "Y" )){
            
                System.out.println("Is your number 6? ");
                String answer3 = myScanner.nextLine();
                
                //---------------- Question 3 -----------------
                
                if(answer3.equals( "y" ) || answer3.equals( "Y" )){
                 
                    System.out.println("Yay!");
                    
                }
                    
                else if(answer3.equals( "n" ) || answer3.equals( "N" )){
                    
                    System.out.println("Liar.");
                    
                }
                
                else{
                    
                    System.out.println("Invalid input!");
                    
                }//--------------------- End 3 --------------------
                    
            
            }
            else if(answer2.equals( "n" ) || answer2.equals( "N" )){
                
                System.out.println("Is the number divisible by 4? ");
                String answer4 = myScanner.nextLine();
                
                //----------------- Question 4 ----------------------
                
                if(answer4.equals( "y" ) || answer4.equals( "Y" )){
                 
                    System.out.println("Is the number divided by 4 greater than 1? ");
                    String answer5 = myScanner.nextLine();
                    
                    //------------------- Question 5 --------------------
                    
                    if(answer5.equals( "y" ) || answer5.equals( "Y" )){
                    
                        System.out.println("Is the number 8? ");
                        String answer6 = myScanner.nextLine();
                    
                        //------------------- Question 6 --------------------
                    
                        if(answer6.equals( "y" ) || answer6.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer6.equals( "n" ) || answer6.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 6 -----------------------
                    
                    }
                    else if(answer5.equals( "n" ) || answer5.equals( "N" )){
                     
                        System.out.println("Is the number 4? ");
                        String answer7 = myScanner.nextLine();
                    
                        //------------------- Question 7 --------------------
                    
                        if(answer7.equals( "y" ) || answer7.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer7.equals( "n" ) || answer7.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 7 -----------------------
                        
                    }
                    else{
                        
                        System.out.println("Invalid input!");
                        
                    }//--------------------- End 5 -----------------------
                    
                }
                else if(answer4.equals( "n" ) || answer4.equals( "N" )){
                    
                    System.out.println("Is it divisible by 5? ");
                    String answer8 = myScanner.nextLine();
                    
                    //------------------- Question 8 --------------------
                    
                    if(answer8.equals( "y" ) || answer8.equals( "Y" )){
                    
                        System.out.println("Is the number 10? ");
                        String answer9 = myScanner.nextLine();
                    
                        //------------------- Question 9 --------------------
                    
                        if(answer9.equals( "y" ) || answer9.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer9.equals( "n" ) || answer9.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 9 -----------------------
                    
                    }
                    else if(answer8.equals( "n" ) || answer8.equals( "N" )){
                     
                        System.out.println("Is the number 2? ");
                        String answer10 = myScanner.nextLine();
                    
                        //------------------- Question 10 -------------------
                    
                        if(answer10.equals( "y" ) || answer10.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer10.equals( "n" ) || answer10.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 10 ----------------------
                        
                    }
                    else{
                        
                        System.out.println("Invalid input!");
                        
                    }//--------------------- End 8 -----------------------
                    
                }
                else{
                    
                    System.out.println("Invalid input!");
                    
                }//---------------------- End 4 ------------------------
                
            }
            else{
                
                System.out.println("Invalid input!");
                
            }//-------------------- End 2 -------------------------
            
        }
        else if(answer1.equals( "n" ) || answer1.equals( "N" )){
            
            System.out.println("Is the number divisible by 3? ");
            String answer11 = myScanner.nextLine();
                    
            //------------------- Question 11 --------------------
                    
            if(answer11.equals( "y" ) || answer11.equals( "Y" )){
                    
                System.out.println("When divided by 3 is the result greater than 1? ");
                String answer12 = myScanner.nextLine();
                    
                //------------------- Question 12 --------------------
                    
                if(answer12.equals( "y" ) || answer12.equals( "Y" )){
                    
                System.out.println("Is the number 9? ");
                String answer13 = myScanner.nextLine();
                    
                //------------------- Question 13 -------------------
                    
                if(answer13.equals( "y" ) || answer13.equals( "Y" )){
                    
                    System.out.println("Yay!");
                    
                }
                else if(answer13.equals( "n" ) || answer13.equals( "N" )){
                     
                    System.out.println("Liar.");
                        
                }
                else{
                        
                    System.out.println("Invalid input!");
                        
                }//-------------------- End 13 ----------------------
                    
                }
                else if(answer12.equals( "n" ) || answer12.equals( "N" )){
                     
                    System.out.println("Is the number 3? ");
                    String answer14 = myScanner.nextLine();
                    
                    //------------------- Question 14 -------------------
                    
                    if(answer14.equals( "y" ) || answer14.equals( "Y" )){
                    
                        System.out.println("Yay!");
                    
                    }
                    else if(answer14.equals( "n" ) || answer14.equals( "N" )){
                     
                        System.out.println("Liar.");
                        
                    }
                    else{
                        
                        System.out.println("Invalid input!");
                        
                    }//-------------------- End 14 ----------------------
                        
                }
                else{
                        
                    System.out.println("Invalid input!");
                        
                }//-------------------- End 12 -----------------------
                    
            }
            else if(answer11.equals( "n" ) || answer11.equals( "N" )){
            
                System.out.println("Is it greater than 6? ");
                String answer15 = myScanner.nextLine();
                    
                //------------------- Question 15 -------------------
                    
                if(answer15.equals( "y" ) || answer15.equals( "Y" )){
                    
                    System.out.println("Is the number 7? ");
                    String answer16 = myScanner.nextLine();
                    
                    //------------------- Question 16 -------------------
                    
                    if(answer16.equals( "y" ) || answer16.equals( "Y" )){
                    
                        System.out.println("Yay!");
                    
                    }
                    else if(answer16.equals( "n" ) || answer16.equals( "N" )){
                     
                        System.out.println("Liar.");
                        
                    }
                    else{
                        
                        System.out.println("Invalid input!");
                        
                    }//-------------------- End 16 ----------------------
                    
                }
                else if(answer15.equals( "n" ) || answer15.equals( "N" )){
                     
                    System.out.println("Is it less than 3? ");
                    String answer17 = myScanner.nextLine();
                    
                    //------------------- Question 17 -------------------
                    
                    if(answer17.equals( "y" ) || answer17.equals( "Y" )){
                    
                        System.out.println("Is the number 1? ");
                        String answer18 = myScanner.nextLine();
                    
                        //------------------- Question 18 -------------------
                    
                        if(answer18.equals( "y" ) || answer18.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer18.equals( "n" ) || answer18.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 18 ----------------------
                    
                    }
                    else if(answer17.equals( "n" ) || answer17.equals( "N" )){
                     
                        System.out.println("Is the number 5? ");
                        String answer19 = myScanner.nextLine();
                    
                        //------------------- Question 19 -------------------
                    
                        if(answer19.equals( "y" ) || answer19.equals( "Y" )){
                    
                            System.out.println("Yay!");
                    
                        }
                        else if(answer19.equals( "n" ) || answer19.equals( "N" )){
                     
                            System.out.println("Liar.");
                        
                        }
                        else{
                        
                            System.out.println("Invalid input!");
                        
                        }//-------------------- End 19 ----------------------
                        
                    }
                    else{
                        
                        System.out.println("Invalid input!");
                        
                    }//-------------------- End 17 ----------------------
                        
                }
                else{
                        
                    System.out.println("Invalid input!");
                        
                }//-------------------- End 15 ----------------------
            
            }
            else{
                        
                System.out.println("Invalid input!");
                        
            }//-------------------- End 11 -----------------------
            
        }
        else{
        
            System.out.println("Invalid input!");
            
        }//------------------- End 1 ------------------------

    }

}