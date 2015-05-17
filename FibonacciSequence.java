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
public class FibonacciSequence {
    /**
     * This method returns a fibonacci sequence up to the amount specified.
     * @param length the length the sequence will be made to
     * @return a list of a fibonacci sequence
     */
    public static long[] fibonacciSequence(int length){
        long[] n = new long[length];
        
        if(length<=1){
            n[0]= 0;
        }
        else if(length==2){
            n[0]=0;
            n[1]=1;
        }
        else{
            n[0]=0;
            n[1]=1;
            for(int i=2; i<length; i++){
            n[i] = n[i-1]+n[i-2];
            }
        }
        return n;
    }
}
