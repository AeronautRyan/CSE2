//Ryan Wheeler
//Methods
//This program is meant to give practice with writing methods for sentence
//construction.

import java.util.Random;
import java.util.Scanner;

public class Methods{
    
    public static String adjective(int a){
        
        String adj = "";
        
        switch(a){
            
            case 1: adj = "fast";
                    break;
            case 2: adj = "slow";
                    break;
            case 3: adj = "brown";
                    break;
            case 4: adj = "purple";
                    break;
            case 5: adj = "smart";
                    break;
            case 6: adj = "dumb";
                    break;
            case 7: adj = "large";
                    break;
            case 8: adj = "small";
                    break;
            case 9: adj = "crazy";
                    break;
            
        }
        return adj;
    }
    
    public static String noun(int a){
        
        String subjectNoun = "";
        
        switch(a){
            
            case 1: subjectNoun = "cow";
                    break;
            case 2: subjectNoun = "dog";
                    break;
            case 3: subjectNoun = "cat";
                    break;
            case 4: subjectNoun = "zebra";
                    break;
            case 5: subjectNoun = "rooster";
                    break;
            case 6: subjectNoun = "snail";
                    break;
            case 7: subjectNoun = "monkey";
                    break;
            case 8: subjectNoun = "elephant";
                    break;
            case 9: subjectNoun = "lion";
                    break;
            
        }
        return subjectNoun;
    }
    
    public static String verb(int a){
        
        String pastVerb = "";
        
        switch(a){
            
            case 1: pastVerb = "ran";
                    break;
            case 2: pastVerb = "flew";
                    break;
            case 3: pastVerb = "swam";
                    break;
            case 4: pastVerb = "jumped";
                    break;
            case 5: pastVerb = "biked";
                    break;
            case 6: pastVerb = "drove";
                    break;
            case 7: pastVerb = "skipped";
                    break;
            case 8: pastVerb = "raced";
                    break;
            case 9: pastVerb = "walked";
                    break;
            
        }
        return pastVerb;
    }
    
    public static String objNoun(int a){
        
        String objectNoun = "";
        
        switch(a){
            
            case 1: objectNoun = "course";
                    break;
            case 2: objectNoun = "route";
                    break;
            case 3: objectNoun = "competition";
                    break;
            case 4: objectNoun = "rally";
                    break;
            case 5: objectNoun = "race";
                    break;
            case 6: objectNoun = "trail";
                    break;
            case 7: objectNoun = "journey";
                    break;
            case 8: objectNoun = "trip";
                    break;
            case 9: objectNoun = "adventure";
                    break;
            
        }
        return objectNoun;
    }
    
    public static void main(String[]args){
        
        Random randomGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);
        int limiter = 20;
        
        for(int counter = 0; counter < limiter; counter++){
            
            int a = (randomGenerator.nextInt(8) + 1);
            int b = (randomGenerator.nextInt(8) + 1);
            int c = (randomGenerator.nextInt(8) + 1);
            int d = (randomGenerator.nextInt(8) + 1);
            int e = (randomGenerator.nextInt(8) + 1);
            int f = (randomGenerator.nextInt(8) + 1);
            
            String adj1 = adjective(a);
            String adj2 = adjective(b);
            String adj3 = adjective(c);
            String noun1 = noun(d);
            String verb1 = verb(e);
            String noun2 = objNoun(f);
            
            System.out.println("The " + adj1 + " " + adj2 + " " + noun1 + " " +
            verb1 + " the "+ adj3 + " " + noun2 + ".");
            
            System.out.println("Would you like another sentence? (y/n)");
            String cont = myScanner.nextLine();
            while(cont == "n"){
                break;
            }
            
        }
        
    }
    
}