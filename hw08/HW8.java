//Ryan Wheeler
//Test adventure

import java.util.Scanner;

public class HW8{

    public static void main(String[] args) {
            char option;
            Scanner scan = new Scanner(System.in);
            System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            String input = getInput(scan, "Cc");
            System.out.println("You are in a dead valley.");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You walked and walked and walked and you saw a cave!");
            cave();
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("You entered a cave!");
            System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
            input = getInput(scan, "Cc");
            System.out.println("Unfortunately, you ran into a GIANT!");
            giant();
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            input = getInput(scan, "AaEe", 10);
            System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
            System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
            box();
            input = getInput(scan);
            System.out.println("Hero! Have a good day!");
    }
    
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

    public static String getInput(Scanner scan, String string){
        
        string = scan.nextLine();
        
        if((string == "c") || (string == "C")){
            
            System.out.print("");
            
        }
        else{
            System.out.println("Yeah right, loser!");
            System.exit(0);
        }
        
        return string;
    }
    
    public static String getInput(Scanner scan, String string, int trial){
        
        int critGenerator = 0;
        int runGenerator = 0;
        
        while((trial < 10) || (runGenerator < 10)){
            
        string = scan.nextLine();
            
        if((string == "a") || (string == "a")){    
            while(trial < 10){
                critGenerator = (int)Math.random();
                
                if(critGenerator == 1){
                    trial++;
                }
                
            }
        }
        else if((string == "r") || (string == "R")){
            while(runGenerator < 10){
                runGenerator = (int)(Math.random() * 10);
            }
        }
        else{
            System.out.println("You just got wrecked by an ogre!");
            ;
        }
        }
        
        return string;
    }
    
    public static String getInput(Scanner scan){
        
        int boxChoice = scan.nextInt();
        String reward = "";
        
        switch(boxChoice){
            case 1: System.out.println("You recieve a full night of sleep!");
                    break;
            case 2: System.out.println("You recieve a 4.0 GPA!");
                    break;
            case 3: System.out.println("You recieve free tuition!");
                    break;
            default: System.out.println("A Wrong Number! You get nothing! Better restart the game LOL!");
                    System.exit(0);
            
            
        }
        
        return reward;
    }
    
}    