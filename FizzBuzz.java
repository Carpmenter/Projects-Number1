/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githubprojects;

/**
 *
 * @author NickCarpenter
 */
public class FizzBuzz {
    /**
     * This method prints out a list of numbers up to 100, but if the a number 
     * is devisable by 3 it prints out fizz, if a number is devisable by
     * 5 it prints out buzz, and if a number is devisable by both 3 and
     * 5 it prints out fizzbuzz.
     */
    public static void fizzBuzz(){
        
        for(int i=1; i<=100; i++){
            if((i%15)==0){
                System.out.println("FizzBuzz ");
            }
            else if((i%5)==0){
                System.out.println("Buzz ");
            }
            else if((i%3)==0){
                System.out.println("Fizz ");
            }
            else{
                System.out.println(i);
            }     
        }
    }
}
