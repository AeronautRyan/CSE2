//Ryan Wheeler
//February 27, 2015
//Lab 05
//Smile Generator
//This program uses various loops to print out smile faces. The purpose is to
//improve familiarity with loops.

//Creates class
public class SmileGenerator{
    
    //Creates main
    public static void main(String[]args){
    
        //-----------------PART 1------------------------
        for(int smileForCounter = 0; smileForCounter < 5; smileForCounter++){
            
            System.out.print(":)");
            
        }
        System.out.println("");
        int smileWhileCounter = 0;
        while(smileWhileCounter < 5){
            
            System.out.print(":)");
            smileWhileCounter += 1;
            
        }
        
        //------------------PART 2&3----------------------
        System.out.println("\n");
        int randomSmile = (int)(Math.random() * 100);
        smileWhileCounter -= 5;
        while(smileWhileCounter <= randomSmile){
            if(smileWhileCounter % 30 == 0){
                System.out.println("");
            }
            System.out.print(":)");
            smileWhileCounter += 1;
        }
        System.out.println("\n");
        
        //------------------PART 4------------------------
        int randomSmile2 = (int)(Math.random() * 100);
        int smilePyramidCounter = 0;
        int remainingSmiles = randomSmile2;
        while(smilePyramidCounter <= randomSmile2){
            for(int smileLineCounter = 0; smileLineCounter <= smilePyramidCounter; smileLineCounter++){
                System.out.print(":)");
                remainingSmiles -= smileLineCounter;
            }
            System.out.println("");
            smilePyramidCounter += 1;
            if(remainingSmiles <= 0){
                return;
            }
        }
            
        
    }
    
}