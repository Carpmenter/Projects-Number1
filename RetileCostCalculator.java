/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubprojects;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class calculates the cost to re-tile a floor depending on the size of 
 * the room and cost of material according to user input.
 * @author NickCarpenter
 */
public class RetileCostCalculator {
    
    public static double squareFeet(double width, double length){
        return width * length;
    }
    public static double cost(double squareFeet, double price){
        return squareFeet * price;
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        System.out.println("If you have the number of square feet of the room enter 1.\n"
                + "If you have the width and length of the room enter 2.");
        
        if(!scan.hasNextInt()){
            throw new InputMismatchException("Please enter a number!");
        }
        int input = scan.nextInt();
        if(input==1||input==2){
            if(input==1){
                System.out.println("How many square feet do you need?");
                double sqft1 = scan.nextDouble();
                System.out.println("What is the cost of your material?");
                double cost1 = scan.nextDouble();
                String finalCost1 = df.format(cost(sqft1, cost1));
                System.out.println("The total cost comes out to be: $" + finalCost1);
            }
            else if(input==2){
                System.out.println("What is the width of the room?");
                double w = scan.nextDouble();
                System.out.println("What is the length of the room?");
                double l = scan.nextDouble();
                double sqft2 = squareFeet(w,l);
                System.out.println("The room is "+sqft2+" square feet.");
                System.out.println("What is the cost of your material?");
                double cost2 = scan.nextDouble();
                String finalCost2 = df.format(cost(sqft2, cost2));
                System.out.println("The total cost comes out to be: $" + finalCost2);
            }
        }
        else{
            System.out.println("Please enter numbers 1. or 2.");
        }
    }  
}