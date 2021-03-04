/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class ArrayExercises {
    public static void main(String[] args) {
        
    }
    
    public static boolean arrayContainsValue(int[] array, int value) {
        for (int number : array) {
            if (value == number) {
                return true;
            }
        }
        
        return false;
    }
    
    public static int[] reverseArray(int[] array) {
        int[] output = new int[array.length];
        
        int counter=0;
        for (int i=array.length-1; i>=0; i--)
        {
            output[counter] = array[i];
            counter++;
        }
        
        return output;
    }
    
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i=0; i<array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}
