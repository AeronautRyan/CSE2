//Ryan Wheeler
//February 23, 2015
//Homework 5
//ToHex
//This code takes RGB values from the user and then converts them to their 
//cooresponding hexadecimal value.

//########################### CODE #################################

//Imports scanner
import java.util.Scanner;

//Creates class
public class ToHex{
    
    //Creates main
    public static void main( String[]args ){
        
        Scanner myScanner = new Scanner (System.in);
        
        //Getting input for RGB values
        System.out.println("Please enter three numbers representing RGB values: ");
        System.out.print("\t");
        int rValue = myScanner.nextInt();
        System.out.print("\t");
        int gValue = myScanner.nextInt();
        System.out.print("\t");
        int bValue = myScanner.nextInt();
        System.out.print("\n");
        
        //------------------- FOR R ------------------------
        
        int rIntPart1 = (((int) rValue / 16));
        int rIntPart2 = (((int) rValue % 16));
        String rHexPart1 = "" + rIntPart1;
        String rHexPart2 = "" + rIntPart2;
            
        switch(rIntPart1) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                rHexPart1 = "A";
                break;
            case 11:
                rHexPart1 = "B";
                break;
            case 12:
                rHexPart1 = "C";
                break;
            case 13:
                rHexPart1 = "D";
                break;
            case 14:
                rHexPart1 = "E";
                break;
            case 15:
                rHexPart1 = "F";
                break;
            
        }
            
        switch(rIntPart2) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                rHexPart2 = "A";
                break;
            case 11:
                rHexPart2 = "B";
                break;
            case 12:
                rHexPart2 = "C";
                break;
            case 13:
                rHexPart2 = "D";
                break;
            case 14:
                rHexPart2 = "E";
                break;
            case 15:
                rHexPart2 = "F";
                break;
            
        }
            
        //-------------------- FOR G ----------------------
        
        int gIntPart1 = (((int) gValue / 16));
        int gIntPart2 = (((int) gValue % 16));
        String gHexPart1 = "" + gIntPart1;
        String gHexPart2 = "" + gIntPart2;
            
        switch(gIntPart1) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                gHexPart1 = "A";
                break;
            case 11:
                gHexPart1 = "B";
                break;
            case 12:
                gHexPart1 = "C";
                break;
            case 13:
                gHexPart1 = "D";
                break;
            case 14:
                gHexPart1 = "E";
                break;
            case 15:
                gHexPart1 = "F";
                break;
            
        }
            
        switch(gIntPart2) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                gHexPart2 = "A";
                break;
            case 11:
                gHexPart2 = "B";
                break;
            case 12:
                gHexPart2 = "C";
                break;
            case 13:
                gHexPart2 = "D";
                break;
            case 14:
                gHexPart2 = "E";
                break;
            case 15:
                gHexPart2 = "F";
                break;
            
        }
        
        //----------------------- FOR B ------------------------
        
        int bIntPart1 = (((int) bValue / 16));
        int bIntPart2 = (((int) bValue % 16));
        String bHexPart1 = "" + bIntPart1;
        String bHexPart2 = "" + bIntPart2;
            
        switch(bIntPart1) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                bHexPart1 = "A";
                break;
            case 11:
                bHexPart1 = "B";
                break;
            case 12:
                bHexPart1 = "C";
                break;
            case 13:
                bHexPart1 = "D";
                break;
            case 14:
                bHexPart1 = "E";
                break;
            case 15:
                bHexPart1 = "F";
                break;
            
        }
            
        switch(bIntPart2) {//Converts to hex
            case 1: case 2: case 3: case 4: case 5:
            case 6: case 7: case 8: case 9:
                break;
            case 10:
                bHexPart2 = "A";
                break;
            case 11:
                bHexPart2 = "B";
                break;
            case 12:
                bHexPart2 = "C";
                break;
            case 13:
                bHexPart2 = "D";
                break;
            case 14:
                bHexPart2 = "E";
                break;
            case 15:
                bHexPart2 = "F";
                break;
            
        }
        
        System.out.println("The decimal numbers R:" + rValue +
        ", G:" + gValue + ", B:" + bValue + " is represented in hexadecimal as: "
        + rHexPart1 + rHexPart2 + gHexPart1 + gHexPart2 + bHexPart1
        + bHexPart2);
    
    }
    
}