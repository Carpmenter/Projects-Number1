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
public class AlternateSequences {
    /**
     * This method takes two lists and creates a new one with the elements from
     * the two lists in alternating order.
     * @param a the first list
     * @param b the second list
     * @return a list of alternated objects
     */
    public static Object[] alternate(Object[] a, Object[] b){
        Object[] list = new Object[a.length+b.length];
        int j=0;
        for(int i=0; i< a.length+b.length;i+=2){
            list[i]= a[j];
            list[i+1] =b[j];
            j++;
        }
        return list;
    }
}
