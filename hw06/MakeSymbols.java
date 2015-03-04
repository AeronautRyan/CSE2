//Ryan Wheeler
//March 3, 2015
//Homework 6
//Make Symbols
//Generates a random number of symbols. The symbol is based on the randomly
//generated number.

//Creates class
public class MakeSymbols{
    
    //creates main
    public static void main(String[]args){
 
        int randomNumber = (int)(Math.random() * 100);
        System.out.println("Random number generated: "+ randomNumber);
        int whileCounter = 1;
        do{
            
            if((randomNumber%2) == 0){
                System.out.print("*");
            }
            else{
                System.out.print("&");
            }
            whileCounter += 1;
            
        }while(whileCounter <= randomNumber);
        System.out.println();
    }
    
}