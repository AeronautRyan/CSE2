//Ryan Wheeler
//April 23, 2015
//Multiply
//This program multiplies the components of multidimensional arrays.

import java.util.Scanner;

public class Multiply{
    
    public static void main(String[]args){
        
        //############################################################
        int[][] matrixOne = randomMatrix();
        
        for(int i = 0; i < matrixOne.length; i++){
            
            for(int j = 0; j < matrixOne[i].length; j++){
                
                System.out.print(matrixOne[i][j]);
                if(j < matrixOne[i].length - 1) System.out.print(" ");
            }
            
            System.out.println();
        }
        //#############################################################
        int[][] matrixTwo = randomMatrix();
        
        for(int i = 0; i < matrixTwo.length; i++){
            
            for(int j = 0; j < matrixTwo[i].length; j++){
                
                System.out.print(matrixTwo[i][j]);
                if(j < matrixTwo[i].length - 1) System.out.print(" ");
            }
            
            System.out.println();
        }
        //############################################################
        int[][] matrixThree = matrixMultiply(matrixTwo, matrixOne);
        
        for(int i = 0; i < matrixThree.length; i++){
            
            for(int j = 0; j < matrixThree[i].length; j++){
                
                System.out.print(matrixThree[i][j]);
                if(j < matrixThree[i].length - 1) System.out.print(" ");
            }
            
            System.out.println();
        }
        //##############################################################
    }
    
    public static int[][] randomMatrix(){
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for the matrix: ");
        int x = myScanner.nextInt();
        System.out.println("Enter the number of columns for the matrix: ");
        int y = myScanner.nextInt();
        
        int[][] newMatrix = new int[x][y];
        
        for (int row = 0; row < newMatrix.length; row++){
            for (int col = 0; col < newMatrix[row].length; col++){
                newMatrix[row][col] = ((int)(Math.random()* 9));
            }
        }
        
        return newMatrix;
    }
    
    public static int[][] matrixMultiply(int[][] a, int[][] b){
        
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < 1; ++i){
            for(int j = 0 ; j < a.length; ++j){
                for(int k = 0 ; k < a[i].length; ++k){
                    c[i][j] += a[i][k] * b[k][j];
        
                }
            }
        }
        return c;
    }
    
}