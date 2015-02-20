//Ryan Wheeler
//February 20, 2015
//Lab 5
//Space Exploration
//This lab generates a random value that indicates the number of years
//of space exploration to print out, and then prints out those dates.

//Creates class
public class SpaceExploration{
    
    //creates main
    public static void main (String [] args){
        
        //Picks random year
        int spaceYear = (int) (Math.random() * 10);
        System.out.format("\nHere is an output of space exploration events\n");
        
        //Switch statement
        switch(spaceYear) {
            
            case 0: 
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back");
            
            case 1:
                System.out.println("2009: N/A");
                
            case 2:
                System.out.println("2008: Kepler launched to study deep space");
                
            case 3:
                System.out.println("2007: N/A");
                
            case 4:
                System.out.println("2006: Spacecraft returns with collections from a comet");
                
            case 5:
                System.out.println("2005: Spacecraft collies with comet");
                
            case 6:
                System.out.println("2004: N/A");
                
            case 7:
                System.out.println("2003: Largest infrared telescope released");
                
            case 8:
                System.out.println("2002: N/A");
                
            case 9:
                System.out.println("2001: First spacecraft lands on asteroid");
            
            case 10:
                System.out.println("2000: First spacecraft orbits an asteroid");
                break;
        }
            
    }
        
}