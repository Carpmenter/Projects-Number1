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
public class CollatzConjecture {
    
    private static int counter;
    /**
     * This method starts with a number and calculates the number of steps it
     * takes to get to 1 with the following rules. If n is even divide by 2. If 
     * n is odd multiply it by 3 and add 1.
     * @param n the number to start from
     * @return the number of steps it takes to get to 1
     */
    public static int collatzConjecture(int n){
        
        if(n <=1)
            return 1;
        else if(n%2 != 0){
            counter++;
            collatzConjecture((n*3)+1);
        }
        else if(n%2 ==0){
            counter++;
            collatzConjecture(n/2);
        }
        return counter;
    }
}
