/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {
        //int[] months = new int[12];
        //months[0] = 1;

        int[] months = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println(months.length);

        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }

        for (int month : months) {
            System.out.println(month);
        }

        printArray(months);

        String[] names = new String[3];
        names[0] = "John";
        names[1] = "Lucy";
        names[2] = "Scott";
        printArray(names);

        int[] myNumbers = {1, 2, 3};
        // don't do this!       
        // int[] myNumbers2 = myNumbers;
        int [] myNumbers2 = copyArray(myNumbers);
        
        System.out.println(myNumbers);
        System.out.println(myNumbers2);
        
        myNumbers2[0] = 99;
        
        printArray(myNumbers);
        printArray(myNumbers2);

    }
    
    public static int[] copyArray(int[] arrayToCopy) {
        int[] output = new int[arrayToCopy.length];
        
        for(int i=0; i<arrayToCopy.length; i++) {
            output[i] = arrayToCopy[i];
        }
        
        return output;
    }
    

    public static void printArray(int[] arrayToPrint) {
        String output = "[";
        for (int item : arrayToPrint) {
            output += item + ",";
        }
        output += "]";
        System.out.println(output);
    }

    public static void printArray(String[] arrayToPrint) {
        String output = "[";
        for (String item : arrayToPrint) {
            output += item + ",";
        }
        output += "]";
        System.out.println(output);
    }
}
