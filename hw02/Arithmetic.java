//Ryan Wheeler
//Jan 30, 2015
//Homework 02
//Arithmetic
//Practice program for basic arithmetic in java.

//Creates class
public class Arithmetic {
    
    //Creates main
    public static void main(String[]args){
        
        //Creates the variables
        int numberSocks = 3;
        double sockCost$ = 2.58;
        
        int numberGlasses = 6;
        double glassCost$ = 2.29;
        
        int numberEnvelopes = 1;
        double envelopeCost$ = 3.25;
        
        double taxPercent = 0.06;
        
        double totalSockCost$, totalGlassCost$, totalEnvelopeCost$, totalCost$;
        double taxSocks, taxGlasses, taxEnvelopes, totalTax;
        double totalCostWithTax$;
        
        //################## CALCULATIONS ###################

        //Total cost individual + Sales tax
        //Socks ---------------
        
        System.out.println("\nItem: Socks \nNumber: " + numberSocks + 
        "\nCost: $" + sockCost$ );
        
        totalSockCost$ = numberSocks * sockCost$;
        taxSocks = totalSockCost$ * taxPercent;
        
        System.out.println("Total sock cost: $" + totalSockCost$);
        double newTaxSocks = Math.round(taxSocks*100.00)/100.00;//Rounds
        System.out.println("Total sock tax: $"+ newTaxSocks);
        
        //Glasses --------------
        
        System.out.println("\n\nItem: Glasses \nNumber: " + numberGlasses + 
        "\nCost: $" + glassCost$ );
        
        totalGlassCost$ = numberGlasses * glassCost$;
        taxGlasses = totalGlassCost$ * taxPercent;
        
        System.out.println("Total glass cost: $" + totalGlassCost$);
        double newTaxGlasses = Math.round(taxGlasses*100.00)/100.00;//Rounds
        System.out.println("Total glass tax: $"+ newTaxGlasses);
        
        //Envelopes -----------
        
        System.out.println("\n\nItem: Envelopes \nNumber: " + numberEnvelopes + 
        "\nCost: $" + envelopeCost$ );
        
        totalEnvelopeCost$ = numberEnvelopes * envelopeCost$;
        taxEnvelopes = totalEnvelopeCost$ * taxPercent;
        
        System.out.println("Total envelope cost: $" + totalEnvelopeCost$);
        double newTaxEnvelopes = Math.round(taxEnvelopes*100.00)/100.00;//Rounds
        System.out.println("Total envelope tax: $"+ newTaxEnvelopes + "0");
        
        //Total cost combined before tax -----------
        
        totalCost$ = totalEnvelopeCost$ + totalGlassCost$ + totalSockCost$;
        double newTotalCost$ = Math.round(totalCost$*100.00)/100.00;//Rounds
        System.out.println("\nSubtotal: $" + newTotalCost$);
        
        //Total cost combined after tax -------------
        
        totalTax = taxEnvelopes + taxGlasses + taxSocks;
        totalCostWithTax$ = totalCost$ + totalTax;
        double newTotalCostWithTax$ = Math.round(totalCostWithTax$*100.00)/100.00;//Rounds
        System.out.println("\nTotal: $" + newTotalCostWithTax$);
        
    }
    
}