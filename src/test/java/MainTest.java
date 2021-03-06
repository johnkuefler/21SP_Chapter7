/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class MainTest {
    
    public MainTest() {
    }

    @Test
    public void testCopyArray() {
        System.out.println("copyArray");
        int[] arrayToCopy = {1,2,3};
        int[] expResult = {1,2,3};
        int[] result = Main.copyArray(arrayToCopy);
        assertArrayEquals(expResult, result);
    }

 
    @Test
    public void testPrintArray_intArr() {
        System.out.println("printArray");
        int[] arrayToPrint = {1,2,3};
        String expResult = "[1,2,3,]";
        String result = Main.printArray(arrayToPrint);
        assertEquals(expResult, result);
    }

    @Test
    public void testPrintArray_StringArr() {
        System.out.println("printArray");
        String[] arrayToPrint = {"A","B","C"};
        String expResult = "[A,B,C,]";
        String result = Main.printArray(arrayToPrint);
        assertEquals(expResult, result);
    }

    



       
}
