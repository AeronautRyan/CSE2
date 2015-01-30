//Ryan Wheeler
//Jan 30, 2015
//CSE02
//Cyclometer
//This program is meant to record data for cycling

//Create class
public class Cyclometer {
    
    //Declares main
    public static void main(String[]args){
    
    //Input data used for calculations
    int secsTrip1 = 480; //Records time elapsed
    int secsTrip2 = 3220;
    int countsTrip1 = 1561; //Records the total rotations
    int countsTrip2 = 9037;
    
    //Variables
    double wheelDiameter = 27.0, //Stores a double
    PI = 3.14159,
    feetPerMile = 5280, //Conversions
    inchesPerFoot = 12,
    secondsPerMinute = 60;
    double distanceTrip1, distanceTrip2, totalDistance; //Stores a double
    
    System.out.println("Trip 1 took " + secsTrip1/secondsPerMinute +
        " minutes and had " + countsTrip1 + " counts.");
    System.out.println("Trip 2 took " + secsTrip2/secondsPerMinute + 
        " minutes and had " + countsTrip2 + " counts.");
    
    //Computations:
    distanceTrip1 = countsTrip1 * wheelDiameter * PI; 
    //Uses circumference formula
    distanceTrip1 /= inchesPerFoot * feetPerMile; //Converts from in to mile
    distanceTrip2 = countsTrip2 * wheelDiameter * PI / inchesPerFoot / feetPerMile;
    totalDistance = distanceTrip1 + distanceTrip2;
    
    //Prints out the calculated data:
    System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
    System.out.println("The total distance was " + totalDistance + " miles.");
    
    }
    
}